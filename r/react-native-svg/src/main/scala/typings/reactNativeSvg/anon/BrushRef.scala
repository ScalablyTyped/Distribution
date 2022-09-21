package typings.reactNativeSvg.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrushRef extends StObject {
  
  var brushRef: String
  
  var payload: Unit
  
  var `type`: Double
}
object BrushRef {
  
  inline def apply(brushRef: String, payload: Unit, `type`: Double): BrushRef = {
    val __obj = js.Dynamic.literal(brushRef = brushRef.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrushRef]
  }
  
  extension [Self <: BrushRef](x: Self) {
    
    inline def setBrushRef(value: String): Self = StObject.set(x, "brushRef", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: Unit): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
