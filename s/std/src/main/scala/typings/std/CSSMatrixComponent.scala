package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMatrixComponent) */
trait CSSMatrixComponent
  extends StObject
     with CSSTransformComponent {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMatrixComponent/matrix) */
  /* standard dom */
  var matrix: DOMMatrix
}
object CSSMatrixComponent {
  
  inline def apply(is2D: scala.Boolean, matrix: DOMMatrix, toMatrix: () => DOMMatrix): CSSMatrixComponent = {
    val __obj = js.Dynamic.literal(is2D = is2D.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix))
    __obj.asInstanceOf[CSSMatrixComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSMatrixComponent] (val x: Self) extends AnyVal {
    
    inline def setMatrix(value: DOMMatrix): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
  }
}
