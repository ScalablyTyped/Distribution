package typings.pusherJs

import typings.pusherJs.channelMod.default
import typings.pusherJs.configMod.AuthTransport
import typings.pusherJs.configMod.Transport
import typings.pusherJs.deprecatedChannelAuthorizerMod.ChannelAuthorizerGenerator
import typings.pusherJs.deprecatedChannelAuthorizerMod.DeprecatedAuthOptions
import typings.pusherJs.deprecatedChannelAuthorizerMod.DeprecatedAuthorizerOptions
import typings.pusherJs.deprecatedChannelAuthorizerMod.DeprecatedChannelAuthorizer
import typings.pusherJs.optionsMod.ChannelAuthorizationOptions
import typings.pusherJs.optionsMod.UserAuthenticationOptions
import typings.tweetnacl.mod.nacl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreOptionsMod {
  
  trait Options extends StObject {
    
    var activityTimeout: js.UndefOr[Double] = js.undefined
    
    var auth: js.UndefOr[DeprecatedAuthOptions] = js.undefined
    
    var authEndpoint: js.UndefOr[String] = js.undefined
    
    var authTransport: js.UndefOr[AuthTransport] = js.undefined
    
    var authorizer: js.UndefOr[ChannelAuthorizerGenerator] = js.undefined
    
    var channelAuthorization: js.UndefOr[ChannelAuthorizationOptions] = js.undefined
    
    var cluster: js.UndefOr[String] = js.undefined
    
    var disableStats: js.UndefOr[Boolean] = js.undefined
    
    var disabledTransports: js.UndefOr[js.Array[Transport]] = js.undefined
    
    var enableStats: js.UndefOr[Boolean] = js.undefined
    
    var enabledTransports: js.UndefOr[js.Array[Transport]] = js.undefined
    
    var forceTLS: js.UndefOr[Boolean] = js.undefined
    
    var httpHost: js.UndefOr[String] = js.undefined
    
    var httpPath: js.UndefOr[String] = js.undefined
    
    var httpPort: js.UndefOr[Double] = js.undefined
    
    var httpsPort: js.UndefOr[Double] = js.undefined
    
    var ignoreNullOrigin: js.UndefOr[Boolean] = js.undefined
    
    var nacl: js.UndefOr[typings.tweetnacl.mod.nacl] = js.undefined
    
    var pongTimeout: js.UndefOr[Double] = js.undefined
    
    var statsHost: js.UndefOr[String] = js.undefined
    
    var timelineParams: js.UndefOr[Any] = js.undefined
    
    var unavailableTimeout: js.UndefOr[Double] = js.undefined
    
    var userAuthentication: js.UndefOr[UserAuthenticationOptions] = js.undefined
    
    var wsHost: js.UndefOr[String] = js.undefined
    
    var wsPath: js.UndefOr[String] = js.undefined
    
    var wsPort: js.UndefOr[Double] = js.undefined
    
    var wssPort: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setActivityTimeout(value: Double): Self = StObject.set(x, "activityTimeout", value.asInstanceOf[js.Any])
      
      inline def setActivityTimeoutUndefined: Self = StObject.set(x, "activityTimeout", js.undefined)
      
      inline def setAuth(value: DeprecatedAuthOptions): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthEndpoint(value: String): Self = StObject.set(x, "authEndpoint", value.asInstanceOf[js.Any])
      
      inline def setAuthEndpointUndefined: Self = StObject.set(x, "authEndpoint", js.undefined)
      
      inline def setAuthTransport(value: AuthTransport): Self = StObject.set(x, "authTransport", value.asInstanceOf[js.Any])
      
      inline def setAuthTransportUndefined: Self = StObject.set(x, "authTransport", js.undefined)
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setAuthorizer(
        value: (/* channel */ default, /* options */ DeprecatedAuthorizerOptions) => DeprecatedChannelAuthorizer
      ): Self = StObject.set(x, "authorizer", js.Any.fromFunction2(value))
      
      inline def setAuthorizerUndefined: Self = StObject.set(x, "authorizer", js.undefined)
      
      inline def setChannelAuthorization(value: ChannelAuthorizationOptions): Self = StObject.set(x, "channelAuthorization", value.asInstanceOf[js.Any])
      
      inline def setChannelAuthorizationUndefined: Self = StObject.set(x, "channelAuthorization", js.undefined)
      
      inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
      
      inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
      
      inline def setDisableStats(value: Boolean): Self = StObject.set(x, "disableStats", value.asInstanceOf[js.Any])
      
      inline def setDisableStatsUndefined: Self = StObject.set(x, "disableStats", js.undefined)
      
      inline def setDisabledTransports(value: js.Array[Transport]): Self = StObject.set(x, "disabledTransports", value.asInstanceOf[js.Any])
      
      inline def setDisabledTransportsUndefined: Self = StObject.set(x, "disabledTransports", js.undefined)
      
      inline def setDisabledTransportsVarargs(value: Transport*): Self = StObject.set(x, "disabledTransports", js.Array(value*))
      
      inline def setEnableStats(value: Boolean): Self = StObject.set(x, "enableStats", value.asInstanceOf[js.Any])
      
      inline def setEnableStatsUndefined: Self = StObject.set(x, "enableStats", js.undefined)
      
      inline def setEnabledTransports(value: js.Array[Transport]): Self = StObject.set(x, "enabledTransports", value.asInstanceOf[js.Any])
      
      inline def setEnabledTransportsUndefined: Self = StObject.set(x, "enabledTransports", js.undefined)
      
      inline def setEnabledTransportsVarargs(value: Transport*): Self = StObject.set(x, "enabledTransports", js.Array(value*))
      
      inline def setForceTLS(value: Boolean): Self = StObject.set(x, "forceTLS", value.asInstanceOf[js.Any])
      
      inline def setForceTLSUndefined: Self = StObject.set(x, "forceTLS", js.undefined)
      
      inline def setHttpHost(value: String): Self = StObject.set(x, "httpHost", value.asInstanceOf[js.Any])
      
      inline def setHttpHostUndefined: Self = StObject.set(x, "httpHost", js.undefined)
      
      inline def setHttpPath(value: String): Self = StObject.set(x, "httpPath", value.asInstanceOf[js.Any])
      
      inline def setHttpPathUndefined: Self = StObject.set(x, "httpPath", js.undefined)
      
      inline def setHttpPort(value: Double): Self = StObject.set(x, "httpPort", value.asInstanceOf[js.Any])
      
      inline def setHttpPortUndefined: Self = StObject.set(x, "httpPort", js.undefined)
      
      inline def setHttpsPort(value: Double): Self = StObject.set(x, "httpsPort", value.asInstanceOf[js.Any])
      
      inline def setHttpsPortUndefined: Self = StObject.set(x, "httpsPort", js.undefined)
      
      inline def setIgnoreNullOrigin(value: Boolean): Self = StObject.set(x, "ignoreNullOrigin", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNullOriginUndefined: Self = StObject.set(x, "ignoreNullOrigin", js.undefined)
      
      inline def setNacl(value: nacl): Self = StObject.set(x, "nacl", value.asInstanceOf[js.Any])
      
      inline def setNaclUndefined: Self = StObject.set(x, "nacl", js.undefined)
      
      inline def setPongTimeout(value: Double): Self = StObject.set(x, "pongTimeout", value.asInstanceOf[js.Any])
      
      inline def setPongTimeoutUndefined: Self = StObject.set(x, "pongTimeout", js.undefined)
      
      inline def setStatsHost(value: String): Self = StObject.set(x, "statsHost", value.asInstanceOf[js.Any])
      
      inline def setStatsHostUndefined: Self = StObject.set(x, "statsHost", js.undefined)
      
      inline def setTimelineParams(value: Any): Self = StObject.set(x, "timelineParams", value.asInstanceOf[js.Any])
      
      inline def setTimelineParamsUndefined: Self = StObject.set(x, "timelineParams", js.undefined)
      
      inline def setUnavailableTimeout(value: Double): Self = StObject.set(x, "unavailableTimeout", value.asInstanceOf[js.Any])
      
      inline def setUnavailableTimeoutUndefined: Self = StObject.set(x, "unavailableTimeout", js.undefined)
      
      inline def setUserAuthentication(value: UserAuthenticationOptions): Self = StObject.set(x, "userAuthentication", value.asInstanceOf[js.Any])
      
      inline def setUserAuthenticationUndefined: Self = StObject.set(x, "userAuthentication", js.undefined)
      
      inline def setWsHost(value: String): Self = StObject.set(x, "wsHost", value.asInstanceOf[js.Any])
      
      inline def setWsHostUndefined: Self = StObject.set(x, "wsHost", js.undefined)
      
      inline def setWsPath(value: String): Self = StObject.set(x, "wsPath", value.asInstanceOf[js.Any])
      
      inline def setWsPathUndefined: Self = StObject.set(x, "wsPath", js.undefined)
      
      inline def setWsPort(value: Double): Self = StObject.set(x, "wsPort", value.asInstanceOf[js.Any])
      
      inline def setWsPortUndefined: Self = StObject.set(x, "wsPort", js.undefined)
      
      inline def setWssPort(value: Double): Self = StObject.set(x, "wssPort", value.asInstanceOf[js.Any])
      
      inline def setWssPortUndefined: Self = StObject.set(x, "wssPort", js.undefined)
    }
  }
}
