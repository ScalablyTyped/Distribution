package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSSkewX) */
trait CSSSkewX
  extends StObject
     with CSSTransformComponent {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSSkewX/ax) */
  /* standard dom */
  var ax: CSSNumericValue
}
object CSSSkewX {
  
  inline def apply(ax: CSSNumericValue, is2D: scala.Boolean, toMatrix: () => DOMMatrix): CSSSkewX = {
    val __obj = js.Dynamic.literal(ax = ax.asInstanceOf[js.Any], is2D = is2D.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix))
    __obj.asInstanceOf[CSSSkewX]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSSkewX] (val x: Self) extends AnyVal {
    
    inline def setAx(value: CSSNumericValue): Self = StObject.set(x, "ax", value.asInstanceOf[js.Any])
  }
}
