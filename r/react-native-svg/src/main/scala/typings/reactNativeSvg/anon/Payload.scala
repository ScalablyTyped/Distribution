package typings.reactNativeSvg.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payload extends StObject {
  
  var brushRef: Unit
  
  var payload: Double
  
  var `type`: Double
}
object Payload {
  
  inline def apply(brushRef: Unit, payload: Double, `type`: Double): Payload = {
    val __obj = js.Dynamic.literal(brushRef = brushRef.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload]
  }
  
  extension [Self <: Payload](x: Self) {
    
    inline def setBrushRef(value: Unit): Self = StObject.set(x, "brushRef", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: Double): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
