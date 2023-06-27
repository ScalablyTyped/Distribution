package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRotate) */
trait CSSRotate
  extends StObject
     with CSSTransformComponent {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRotate/angle) */
  /* standard dom */
  var angle: CSSNumericValue
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRotate/x) */
  /* standard dom */
  var x: CSSNumberish
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRotate/y) */
  /* standard dom */
  var y: CSSNumberish
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRotate/z) */
  /* standard dom */
  var z: CSSNumberish
}
object CSSRotate {
  
  inline def apply(
    angle: CSSNumericValue,
    is2D: scala.Boolean,
    toMatrix: () => DOMMatrix,
    x: CSSNumberish,
    y: CSSNumberish,
    z: CSSNumberish
  ): CSSRotate = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], is2D = is2D.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSRotate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSRotate] (val x: Self) extends AnyVal {
    
    inline def setAngle(value: CSSNumericValue): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setX(value: CSSNumberish): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: CSSNumberish): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: CSSNumberish): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
