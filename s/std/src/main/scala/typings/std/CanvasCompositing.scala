package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasCompositing extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/globalAlpha) */
  /* standard dom */
  var globalAlpha: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/globalCompositeOperation) */
  /* standard dom */
  var globalCompositeOperation: GlobalCompositeOperation
}
object CanvasCompositing {
  
  inline def apply(globalAlpha: Double, globalCompositeOperation: GlobalCompositeOperation): CanvasCompositing = {
    val __obj = js.Dynamic.literal(globalAlpha = globalAlpha.asInstanceOf[js.Any], globalCompositeOperation = globalCompositeOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasCompositing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasCompositing] (val x: Self) extends AnyVal {
    
    inline def setGlobalAlpha(value: Double): Self = StObject.set(x, "globalAlpha", value.asInstanceOf[js.Any])
    
    inline def setGlobalCompositeOperation(value: GlobalCompositeOperation): Self = StObject.set(x, "globalCompositeOperation", value.asInstanceOf[js.Any])
  }
}
