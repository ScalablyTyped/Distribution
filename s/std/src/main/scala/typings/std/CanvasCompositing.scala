package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasCompositing extends StObject {
  
  var globalAlpha: Double
  
  var globalCompositeOperation: java.lang.String
}
object CanvasCompositing {
  
  inline def apply(globalAlpha: Double, globalCompositeOperation: java.lang.String): CanvasCompositing = {
    val __obj = js.Dynamic.literal(globalAlpha = globalAlpha.asInstanceOf[js.Any], globalCompositeOperation = globalCompositeOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasCompositing]
  }
  
  extension [Self <: CanvasCompositing](x: Self) {
    
    inline def setGlobalAlpha(value: Double): Self = StObject.set(x, "globalAlpha", value.asInstanceOf[js.Any])
    
    inline def setGlobalCompositeOperation(value: java.lang.String): Self = StObject.set(x, "globalCompositeOperation", value.asInstanceOf[js.Any])
  }
}
