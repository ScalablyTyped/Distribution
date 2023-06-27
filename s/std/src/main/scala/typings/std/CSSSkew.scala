package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSSkew) */
trait CSSSkew
  extends StObject
     with CSSTransformComponent {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSSkew/ax) */
  /* standard dom */
  var ax: CSSNumericValue
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSSkew/ay) */
  /* standard dom */
  var ay: CSSNumericValue
}
object CSSSkew {
  
  inline def apply(ax: CSSNumericValue, ay: CSSNumericValue, is2D: scala.Boolean, toMatrix: () => DOMMatrix): CSSSkew = {
    val __obj = js.Dynamic.literal(ax = ax.asInstanceOf[js.Any], ay = ay.asInstanceOf[js.Any], is2D = is2D.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix))
    __obj.asInstanceOf[CSSSkew]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSSkew] (val x: Self) extends AnyVal {
    
    inline def setAx(value: CSSNumericValue): Self = StObject.set(x, "ax", value.asInstanceOf[js.Any])
    
    inline def setAy(value: CSSNumericValue): Self = StObject.set(x, "ay", value.asInstanceOf[js.Any])
  }
}
