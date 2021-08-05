package typings.skyway

import typings.std.RTCConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var config: js.UndefOr[RTCConfiguration] = js.undefined
  
  var credential: js.UndefOr[Credential] = js.undefined
  
  var debug: js.UndefOr[Double] = js.undefined
  
  var key: String
  
  var turn: js.UndefOr[Boolean] = js.undefined
}
object Options {
  
  inline def apply(key: String): Options = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setConfig(value: RTCConfiguration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setCredential(value: Credential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    inline def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
    
    inline def setDebug(value: Double): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setTurn(value: Boolean): Self = StObject.set(x, "turn", value.asInstanceOf[js.Any])
    
    inline def setTurnUndefined: Self = StObject.set(x, "turn", js.undefined)
  }
}
