package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTranslate) */
trait CSSTranslate
  extends StObject
     with CSSTransformComponent {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTranslate/x) */
  /* standard dom */
  var x: CSSNumericValue
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTranslate/y) */
  /* standard dom */
  var y: CSSNumericValue
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTranslate/z) */
  /* standard dom */
  var z: CSSNumericValue
}
object CSSTranslate {
  
  inline def apply(
    is2D: scala.Boolean,
    toMatrix: () => DOMMatrix,
    x: CSSNumericValue,
    y: CSSNumericValue,
    z: CSSNumericValue
  ): CSSTranslate = {
    val __obj = js.Dynamic.literal(is2D = is2D.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSTranslate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSTranslate] (val x: Self) extends AnyVal {
    
    inline def setX(value: CSSNumericValue): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: CSSNumericValue): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: CSSNumericValue): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
