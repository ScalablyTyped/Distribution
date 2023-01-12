package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISpacer
  extends StObject
     with IComponent {
  
  /** [Method] Sets the value of width
    * @param width Number The new value.
    */
  @JSName("setWidth")
  var setWidth_ISpacer: js.UndefOr[js.Function1[/* width */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Config Option] (Number) */
  @JSName("width")
  var width_ISpacer: js.UndefOr[Double] = js.undefined
}
object ISpacer {
  
  inline def apply(): ISpacer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpacer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISpacer] (val x: Self) extends AnyVal {
    
    inline def setSetWidth(value: /* width */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
    
    inline def setSetWidthUndefined: Self = StObject.set(x, "setWidth", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
