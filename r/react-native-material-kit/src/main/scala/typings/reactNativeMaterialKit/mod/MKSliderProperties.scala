package typings.reactNativeMaterialKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MKSliderProperties
  extends StObject
     with BaseSlider {
  
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  
  var onConfirm: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object MKSliderProperties {
  
  inline def apply(): MKSliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MKSliderProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MKSliderProperties] (val x: Self) extends AnyVal {
    
    inline def setOnChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnConfirm(value: () => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction0(value))
    
    inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
  }
}
