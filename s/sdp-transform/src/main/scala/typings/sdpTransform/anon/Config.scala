package typings.sdpTransform.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var config: String
  
  var payload: Double
}
object Config {
  
  inline def apply(config: String, payload: Double): Config = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: Double): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
