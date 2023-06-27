package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformComponent) */
trait CSSTransformComponent extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformComponent/is2D) */
  /* standard dom */
  var is2D: scala.Boolean
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformComponent/toMatrix) */
  /* standard dom */
  def toMatrix(): DOMMatrix
}
object CSSTransformComponent {
  
  inline def apply(is2D: scala.Boolean, toMatrix: () => DOMMatrix): CSSTransformComponent = {
    val __obj = js.Dynamic.literal(is2D = is2D.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix))
    __obj.asInstanceOf[CSSTransformComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSTransformComponent] (val x: Self) extends AnyVal {
    
    inline def setIs2D(value: scala.Boolean): Self = StObject.set(x, "is2D", value.asInstanceOf[js.Any])
    
    inline def setToMatrix(value: () => DOMMatrix): Self = StObject.set(x, "toMatrix", js.Any.fromFunction0(value))
  }
}
