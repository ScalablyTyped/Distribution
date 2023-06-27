package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPerspective) */
trait CSSPerspective
  extends StObject
     with CSSTransformComponent {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPerspective/length) */
  /* standard dom */
  var length: CSSPerspectiveValue
}
object CSSPerspective {
  
  inline def apply(is2D: scala.Boolean, length: CSSPerspectiveValue, toMatrix: () => DOMMatrix): CSSPerspective = {
    val __obj = js.Dynamic.literal(is2D = is2D.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix))
    __obj.asInstanceOf[CSSPerspective]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSPerspective] (val x: Self) extends AnyVal {
    
    inline def setLength(value: CSSPerspectiveValue): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
