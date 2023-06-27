package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BarProp) */
trait BarProp extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BarProp/visible) */
  /* standard dom */
  val visible: scala.Boolean
}
object BarProp {
  
  inline def apply(visible: scala.Boolean): BarProp = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarProp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BarProp] (val x: Self) extends AnyVal {
    
    inline def setVisible(value: scala.Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
