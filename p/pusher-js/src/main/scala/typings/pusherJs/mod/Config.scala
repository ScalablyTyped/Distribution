package typings.pusherJs.mod

import typings.pusherJs.anon.Authorize
import typings.pusherJs.pusherJsStrings.ajax
import typings.pusherJs.pusherJsStrings.jsonp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  /**
    * After this time (in miliseconds) without any messages received from the server,
    * a ping message will be sent to check if the connection is still working.
    * Default value is is supplied by the server, low values will result in unnecessary traffic.
    */
  var activityTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Allows passing additional data to authorizers. Supports query string params and headers (AJAX only).
    * For example, following will pass foo=bar via the query string and baz: boo via headers:
    */
  var auth: js.UndefOr[AuthConfig] = js.native
  
  /**
    * Endpoint on your server that will return the authentication signature needed for private channels.
    */
  var authEndpoint: js.UndefOr[String] = js.native
  
  /**
    * Defines how the authentication endpoint, defined using authEndpoint, will be called.
    * There are two options available: ajax and jsonp.
    */
  var authTransport: js.UndefOr[ajax | jsonp] = js.native
  
  /**
    * If you need custom authorization behavior you can provide your own authorizer function as follows:
    */
  var authorizer: js.UndefOr[Authorizer] = js.native
  
  /**
    * Allows connecting to a different datacenter by setting up correct hostnames and ports for the connection.
    */
  var cluster: js.UndefOr[String] = js.native
  
  /**
    * Disables stats collection, so that connection metrics are not submitted to Pusher’s servers. These stats
    * are used for internal monitoring only and they do not affect the account stats.
    */
  var disableStats: js.UndefOr[Boolean] = js.native
  
  /**
    * Specified which transports must not be used by Pusher to establish a connection.
    * This settings overwrites transports whitelisted via the enabledTransports options.
    * Available transports: ws, wss, xhr_streaming, xhr_polling, sockjs.
    * Additional transports may be added in the future and without adding them to this list, they will be enabled.
    */
  var disabledTransports: js.UndefOr[js.Array[Transport]] = js.native
  
  /**
    * Specifies which transports should be used by Pusher to establish a connection.
    * Useful for applications running in controlled, well-behaving environments.
    * Available transports: ws, wss, xhr_streaming, xhr_polling, sockjs.
    * Additional transports may be added in the future and without adding them to this list, they will be disabled.
    */
  var enabledTransports: js.UndefOr[js.Array[Transport]] = js.native
  
  /**
    * Forces the connection to use encrypted transports.
    * @deprecated
    */
  var encrypted: js.UndefOr[Boolean] = js.native
  
  /**
    * Forces the connection to use encrypted transports.
    */
  var forceTLS: js.UndefOr[Boolean] = js.native
  
  var httpHost: js.UndefOr[String] = js.native
  
  var httpPort: js.UndefOr[Double] = js.native
  
  var httpsPort: js.UndefOr[Double] = js.native
  
  /**
    * Ignores null origin checks for HTTP fallbacks. Use with care, it should be disabled only if necessary (i.e. PhoneGap).
    */
  var ignoreNullOrigin: js.UndefOr[Boolean] = js.native
  
  /**
    * Time before the connection is terminated after sending a ping message.
    * Default is 30000 (30s). Low values will cause false disconnections, if latency is high.
    */
  var pongTimeout: js.UndefOr[Double] = js.native
  
  var wsHost: js.UndefOr[String] = js.native
  
  var wsPath: js.UndefOr[String] = js.native
  
  var wsPort: js.UndefOr[Double] = js.native
  
  var wssPort: js.UndefOr[Double] = js.native
}
object Config {
  
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActivityTimeout(value: Double): Self = this.set("activityTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityTimeout: Self = this.set("activityTimeout", js.undefined)
    
    @scala.inline
    def setAuth(value: AuthConfig): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setAuthEndpoint(value: String): Self = this.set("authEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthEndpoint: Self = this.set("authEndpoint", js.undefined)
    
    @scala.inline
    def setAuthTransport(value: ajax | jsonp): Self = this.set("authTransport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthTransport: Self = this.set("authTransport", js.undefined)
    
    @scala.inline
    def setAuthorizer(value: (/* channel */ Channel, /* options */ Config) => Authorize): Self = this.set("authorizer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAuthorizer: Self = this.set("authorizer", js.undefined)
    
    @scala.inline
    def setCluster(value: String): Self = this.set("cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCluster: Self = this.set("cluster", js.undefined)
    
    @scala.inline
    def setDisableStats(value: Boolean): Self = this.set("disableStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableStats: Self = this.set("disableStats", js.undefined)
    
    @scala.inline
    def setDisabledTransportsVarargs(value: Transport*): Self = this.set("disabledTransports", js.Array(value :_*))
    
    @scala.inline
    def setDisabledTransports(value: js.Array[Transport]): Self = this.set("disabledTransports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledTransports: Self = this.set("disabledTransports", js.undefined)
    
    @scala.inline
    def setEnabledTransportsVarargs(value: Transport*): Self = this.set("enabledTransports", js.Array(value :_*))
    
    @scala.inline
    def setEnabledTransports(value: js.Array[Transport]): Self = this.set("enabledTransports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledTransports: Self = this.set("enabledTransports", js.undefined)
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncrypted: Self = this.set("encrypted", js.undefined)
    
    @scala.inline
    def setForceTLS(value: Boolean): Self = this.set("forceTLS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceTLS: Self = this.set("forceTLS", js.undefined)
    
    @scala.inline
    def setHttpHost(value: String): Self = this.set("httpHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpHost: Self = this.set("httpHost", js.undefined)
    
    @scala.inline
    def setHttpPort(value: Double): Self = this.set("httpPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpPort: Self = this.set("httpPort", js.undefined)
    
    @scala.inline
    def setHttpsPort(value: Double): Self = this.set("httpsPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpsPort: Self = this.set("httpsPort", js.undefined)
    
    @scala.inline
    def setIgnoreNullOrigin(value: Boolean): Self = this.set("ignoreNullOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreNullOrigin: Self = this.set("ignoreNullOrigin", js.undefined)
    
    @scala.inline
    def setPongTimeout(value: Double): Self = this.set("pongTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePongTimeout: Self = this.set("pongTimeout", js.undefined)
    
    @scala.inline
    def setWsHost(value: String): Self = this.set("wsHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWsHost: Self = this.set("wsHost", js.undefined)
    
    @scala.inline
    def setWsPath(value: String): Self = this.set("wsPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWsPath: Self = this.set("wsPath", js.undefined)
    
    @scala.inline
    def setWsPort(value: Double): Self = this.set("wsPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWsPort: Self = this.set("wsPort", js.undefined)
    
    @scala.inline
    def setWssPort(value: Double): Self = this.set("wssPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWssPort: Self = this.set("wssPort", js.undefined)
  }
}
