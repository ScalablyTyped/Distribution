package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSScale) */
trait CSSScale
  extends StObject
     with CSSTransformComponent {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSScale/x) */
  /* standard dom */
  var x: CSSNumberish
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSScale/y) */
  /* standard dom */
  var y: CSSNumberish
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSScale/z) */
  /* standard dom */
  var z: CSSNumberish
}
object CSSScale {
  
  inline def apply(is2D: scala.Boolean, toMatrix: () => DOMMatrix, x: CSSNumberish, y: CSSNumberish, z: CSSNumberish): CSSScale = {
    val __obj = js.Dynamic.literal(is2D = is2D.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSScale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSScale] (val x: Self) extends AnyVal {
    
    inline def setX(value: CSSNumberish): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: CSSNumberish): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: CSSNumberish): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
