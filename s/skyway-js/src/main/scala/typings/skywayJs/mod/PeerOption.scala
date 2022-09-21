package typings.skywayJs.mod

import typings.std.RTCConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerOption extends StObject {
  
  var config: RTCConfiguration
  
  var credential: js.UndefOr[PeerCredential] = js.undefined
  
  // specified as default(and also overrode)
  var debug: LogLevel
  
  var dispatcherHost: String
  
  var dispatcherPort: Double
  
  var dispatcherSecure: Boolean
  
  var host: js.UndefOr[String] = js.undefined
  
  // overrode by PeerConstructorOption(passed by user)
  var key: String
  
  var port: js.UndefOr[Double] = js.undefined
  
  var secure: js.UndefOr[Boolean] = js.undefined
  
  // fixed
  var token: String
  
  var turn: Boolean
}
object PeerOption {
  
  inline def apply(
    config: RTCConfiguration,
    debug: LogLevel,
    dispatcherHost: String,
    dispatcherPort: Double,
    dispatcherSecure: Boolean,
    key: String,
    token: String,
    turn: Boolean
  ): PeerOption = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], dispatcherHost = dispatcherHost.asInstanceOf[js.Any], dispatcherPort = dispatcherPort.asInstanceOf[js.Any], dispatcherSecure = dispatcherSecure.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], turn = turn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerOption]
  }
  
  extension [Self <: PeerOption](x: Self) {
    
    inline def setConfig(value: RTCConfiguration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setCredential(value: PeerCredential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    inline def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
    
    inline def setDebug(value: LogLevel): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDispatcherHost(value: String): Self = StObject.set(x, "dispatcherHost", value.asInstanceOf[js.Any])
    
    inline def setDispatcherPort(value: Double): Self = StObject.set(x, "dispatcherPort", value.asInstanceOf[js.Any])
    
    inline def setDispatcherSecure(value: Boolean): Self = StObject.set(x, "dispatcherSecure", value.asInstanceOf[js.Any])
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTurn(value: Boolean): Self = StObject.set(x, "turn", value.asInstanceOf[js.Any])
  }
}
