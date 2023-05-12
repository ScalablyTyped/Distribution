package typings.pusherJs

import typings.pusherJs.typesSrcCoreAuthOptionsMod.ChannelAuthorizationOptions
import typings.pusherJs.typesSrcCoreAuthOptionsMod.UserAuthenticationOptions
import typings.pusherJs.typesSrcCoreConfigMod.AuthTransport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreDefaultsMod {
  
  @JSImport("pusher-js/types/src/core/defaults", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pusher-js/types/src/core/defaults", JSImport.Default)
  @js.native
  def default: DefaultConfig = js.native
  inline def default_=(x: DefaultConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  trait DefaultConfig extends StObject {
    
    var PROTOCOL: Double
    
    var VERSION: String
    
    var activityTimeout: Double
    
    var authEndpoint: String
    
    var authTransport: AuthTransport
    
    var cdn_http: js.UndefOr[String] = js.undefined
    
    var cdn_https: js.UndefOr[String] = js.undefined
    
    var channelAuthorization: ChannelAuthorizationOptions
    
    var dependency_suffix: js.UndefOr[String] = js.undefined
    
    var httpHost: String
    
    var httpPath: String
    
    var httpPort: Double
    
    var httpsPort: Double
    
    var pongTimeout: Double
    
    var stats_host: String
    
    var unavailableTimeout: Double
    
    var userAuthentication: UserAuthenticationOptions
    
    var wsPath: String
    
    var wsPort: Double
    
    var wssPort: Double
  }
  object DefaultConfig {
    
    inline def apply(
      PROTOCOL: Double,
      VERSION: String,
      activityTimeout: Double,
      authEndpoint: String,
      authTransport: AuthTransport,
      channelAuthorization: ChannelAuthorizationOptions,
      httpHost: String,
      httpPath: String,
      httpPort: Double,
      httpsPort: Double,
      pongTimeout: Double,
      stats_host: String,
      unavailableTimeout: Double,
      userAuthentication: UserAuthenticationOptions,
      wsPath: String,
      wsPort: Double,
      wssPort: Double
    ): DefaultConfig = {
      val __obj = js.Dynamic.literal(PROTOCOL = PROTOCOL.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any], activityTimeout = activityTimeout.asInstanceOf[js.Any], authEndpoint = authEndpoint.asInstanceOf[js.Any], authTransport = authTransport.asInstanceOf[js.Any], channelAuthorization = channelAuthorization.asInstanceOf[js.Any], httpHost = httpHost.asInstanceOf[js.Any], httpPath = httpPath.asInstanceOf[js.Any], httpPort = httpPort.asInstanceOf[js.Any], httpsPort = httpsPort.asInstanceOf[js.Any], pongTimeout = pongTimeout.asInstanceOf[js.Any], stats_host = stats_host.asInstanceOf[js.Any], unavailableTimeout = unavailableTimeout.asInstanceOf[js.Any], userAuthentication = userAuthentication.asInstanceOf[js.Any], wsPath = wsPath.asInstanceOf[js.Any], wsPort = wsPort.asInstanceOf[js.Any], wssPort = wssPort.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultConfig] (val x: Self) extends AnyVal {
      
      inline def setActivityTimeout(value: Double): Self = StObject.set(x, "activityTimeout", value.asInstanceOf[js.Any])
      
      inline def setAuthEndpoint(value: String): Self = StObject.set(x, "authEndpoint", value.asInstanceOf[js.Any])
      
      inline def setAuthTransport(value: AuthTransport): Self = StObject.set(x, "authTransport", value.asInstanceOf[js.Any])
      
      inline def setCdn_http(value: String): Self = StObject.set(x, "cdn_http", value.asInstanceOf[js.Any])
      
      inline def setCdn_httpUndefined: Self = StObject.set(x, "cdn_http", js.undefined)
      
      inline def setCdn_https(value: String): Self = StObject.set(x, "cdn_https", value.asInstanceOf[js.Any])
      
      inline def setCdn_httpsUndefined: Self = StObject.set(x, "cdn_https", js.undefined)
      
      inline def setChannelAuthorization(value: ChannelAuthorizationOptions): Self = StObject.set(x, "channelAuthorization", value.asInstanceOf[js.Any])
      
      inline def setDependency_suffix(value: String): Self = StObject.set(x, "dependency_suffix", value.asInstanceOf[js.Any])
      
      inline def setDependency_suffixUndefined: Self = StObject.set(x, "dependency_suffix", js.undefined)
      
      inline def setHttpHost(value: String): Self = StObject.set(x, "httpHost", value.asInstanceOf[js.Any])
      
      inline def setHttpPath(value: String): Self = StObject.set(x, "httpPath", value.asInstanceOf[js.Any])
      
      inline def setHttpPort(value: Double): Self = StObject.set(x, "httpPort", value.asInstanceOf[js.Any])
      
      inline def setHttpsPort(value: Double): Self = StObject.set(x, "httpsPort", value.asInstanceOf[js.Any])
      
      inline def setPROTOCOL(value: Double): Self = StObject.set(x, "PROTOCOL", value.asInstanceOf[js.Any])
      
      inline def setPongTimeout(value: Double): Self = StObject.set(x, "pongTimeout", value.asInstanceOf[js.Any])
      
      inline def setStats_host(value: String): Self = StObject.set(x, "stats_host", value.asInstanceOf[js.Any])
      
      inline def setUnavailableTimeout(value: Double): Self = StObject.set(x, "unavailableTimeout", value.asInstanceOf[js.Any])
      
      inline def setUserAuthentication(value: UserAuthenticationOptions): Self = StObject.set(x, "userAuthentication", value.asInstanceOf[js.Any])
      
      inline def setVERSION(value: String): Self = StObject.set(x, "VERSION", value.asInstanceOf[js.Any])
      
      inline def setWsPath(value: String): Self = StObject.set(x, "wsPath", value.asInstanceOf[js.Any])
      
      inline def setWsPort(value: Double): Self = StObject.set(x, "wsPort", value.asInstanceOf[js.Any])
      
      inline def setWssPort(value: Double): Self = StObject.set(x, "wssPort", value.asInstanceOf[js.Any])
    }
  }
}
