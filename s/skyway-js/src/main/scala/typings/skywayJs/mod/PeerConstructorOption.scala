package typings.skywayJs.mod

import typings.std.RTCConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerConstructorOption extends StObject {
  
  var config: js.UndefOr[RTCConfiguration] = js.undefined
  
  var credential: js.UndefOr[PeerCredential] = js.undefined
  
  var debug: js.UndefOr[LogLevel] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var key: String
  
  var port: js.UndefOr[Double] = js.undefined
  
  var secure: js.UndefOr[Boolean] = js.undefined
  
  var turn: js.UndefOr[Boolean] = js.undefined
}
object PeerConstructorOption {
  
  inline def apply(key: String): PeerConstructorOption = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerConstructorOption]
  }
  
  extension [Self <: PeerConstructorOption](x: Self) {
    
    inline def setConfig(value: RTCConfiguration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setCredential(value: PeerCredential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    inline def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
    
    inline def setDebug(value: LogLevel): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    inline def setTurn(value: Boolean): Self = StObject.set(x, "turn", value.asInstanceOf[js.Any])
    
    inline def setTurnUndefined: Self = StObject.set(x, "turn", js.undefined)
  }
}
