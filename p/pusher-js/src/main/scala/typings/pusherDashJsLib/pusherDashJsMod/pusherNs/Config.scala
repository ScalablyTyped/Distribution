package typings
package pusherDashJsLib.pusherDashJsMod.pusherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * After this time (in miliseconds) without any messages received from the server,
    * a ping message will be sent to check if the connection is still working.
    * Default value is is supplied by the server, low values will result in unnecessary traffic.
    */
  var activityTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Allows passing additional data to authorizers. Supports query string params and headers (AJAX only).
    * For example, following will pass foo=bar via the query string and baz: boo via headers:
    */
  var auth: js.UndefOr[AuthConfig] = js.undefined
  /**
    * Endpoint on your server that will return the authentication signature needed for private channels.
    */
  var authEndpoint: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines how the authentication endpoint, defined using authEndpoint, will be called.
    * There are two options available: ajax and jsonp.
    */
  var authTransport: js.UndefOr[
    pusherDashJsLib.pusherDashJsLibStrings.ajax | pusherDashJsLib.pusherDashJsLibStrings.jsonp
  ] = js.undefined
  /**
    * If you need custom authorization behavior you can provide your own authorizer function as follows:
    */
  var authorizer: js.UndefOr[Authorizer] = js.undefined
  /**
    * Allows connecting to a different datacenter by setting up correct hostnames and ports for the connection.
    */
  var cluster: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Disables stats collection, so that connection metrics are not submitted to Pusher’s servers. These stats
    * are used for internal monitoring only and they do not affect the account stats.
    */
  var disableStats: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specified which transports must not be used by Pusher to establish a connection.
    * This settings overwrites transports whitelisted via the enabledTransports options.
    * Available transports: ws, wss, xhr_streaming, xhr_polling, sockjs.
    * Additional transports may be added in the future and without adding them to this list, they will be enabled.
    */
  var disabledTransports: js.UndefOr[js.Array[Transport]] = js.undefined
  /**
    * Specifies which transports should be used by Pusher to establish a connection.
    * Useful for applications running in controlled, well-behaving environments.
    * Available transports: ws, wss, xhr_streaming, xhr_polling, sockjs.
    * Additional transports may be added in the future and without adding them to this list, they will be disabled.
    */
  var enabledTransports: js.UndefOr[js.Array[Transport]] = js.undefined
  /**
    * Forces the connection to use encrypted transports.
    */
  var encrypted: js.UndefOr[scala.Boolean] = js.undefined
  var httpHost: js.UndefOr[java.lang.String] = js.undefined
  var httpPort: js.UndefOr[scala.Double] = js.undefined
  var httpsPort: js.UndefOr[scala.Double] = js.undefined
  /**
    * Ignores null origin checks for HTTP fallbacks. Use with care, it should be disabled only if necessary (i.e. PhoneGap).
    */
  var ignoreNullOrigin: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Time before the connection is terminated after sending a ping message.
    * Default is 30000 (30s). Low values will cause false disconnections, if latency is high.
    */
  var pongTimeout: js.UndefOr[scala.Double] = js.undefined
  var wsHost: js.UndefOr[java.lang.String] = js.undefined
  var wsPath: js.UndefOr[java.lang.String] = js.undefined
  var wsPort: js.UndefOr[scala.Double] = js.undefined
  var wssPort: js.UndefOr[scala.Double] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    activityTimeout: scala.Int | scala.Double = null,
    auth: AuthConfig = null,
    authEndpoint: java.lang.String = null,
    authTransport: pusherDashJsLib.pusherDashJsLibStrings.ajax | pusherDashJsLib.pusherDashJsLibStrings.jsonp = null,
    authorizer: Authorizer = null,
    cluster: java.lang.String = null,
    disableStats: js.UndefOr[scala.Boolean] = js.undefined,
    disabledTransports: js.Array[Transport] = null,
    enabledTransports: js.Array[Transport] = null,
    encrypted: js.UndefOr[scala.Boolean] = js.undefined,
    httpHost: java.lang.String = null,
    httpPort: scala.Int | scala.Double = null,
    httpsPort: scala.Int | scala.Double = null,
    ignoreNullOrigin: js.UndefOr[scala.Boolean] = js.undefined,
    pongTimeout: scala.Int | scala.Double = null,
    wsHost: java.lang.String = null,
    wsPath: java.lang.String = null,
    wsPort: scala.Int | scala.Double = null,
    wssPort: scala.Int | scala.Double = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (activityTimeout != null) __obj.updateDynamic("activityTimeout")(activityTimeout.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (authEndpoint != null) __obj.updateDynamic("authEndpoint")(authEndpoint)
    if (authTransport != null) __obj.updateDynamic("authTransport")(authTransport.asInstanceOf[js.Any])
    if (authorizer != null) __obj.updateDynamic("authorizer")(authorizer)
    if (cluster != null) __obj.updateDynamic("cluster")(cluster)
    if (!js.isUndefined(disableStats)) __obj.updateDynamic("disableStats")(disableStats)
    if (disabledTransports != null) __obj.updateDynamic("disabledTransports")(disabledTransports)
    if (enabledTransports != null) __obj.updateDynamic("enabledTransports")(enabledTransports)
    if (!js.isUndefined(encrypted)) __obj.updateDynamic("encrypted")(encrypted)
    if (httpHost != null) __obj.updateDynamic("httpHost")(httpHost)
    if (httpPort != null) __obj.updateDynamic("httpPort")(httpPort.asInstanceOf[js.Any])
    if (httpsPort != null) __obj.updateDynamic("httpsPort")(httpsPort.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreNullOrigin)) __obj.updateDynamic("ignoreNullOrigin")(ignoreNullOrigin)
    if (pongTimeout != null) __obj.updateDynamic("pongTimeout")(pongTimeout.asInstanceOf[js.Any])
    if (wsHost != null) __obj.updateDynamic("wsHost")(wsHost)
    if (wsPath != null) __obj.updateDynamic("wsPath")(wsPath)
    if (wsPort != null) __obj.updateDynamic("wsPort")(wsPort.asInstanceOf[js.Any])
    if (wssPort != null) __obj.updateDynamic("wssPort")(wssPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

