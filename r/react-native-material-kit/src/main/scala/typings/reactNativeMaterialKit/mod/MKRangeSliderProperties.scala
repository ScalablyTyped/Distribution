package typings.reactNativeMaterialKit.mod

import typings.reactNativeMaterialKit.anon.Max
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MKRangeSliderProperties extends BaseSlider {
  
  var maxValue: js.UndefOr[Double] = js.native
  
  var minValue: js.UndefOr[Double] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* curValue */ Max, Unit]] = js.native
  
  var onConfirm: js.UndefOr[js.Function1[/* curValue */ Max, Unit]] = js.native
  
  var onStart: js.UndefOr[js.Function0[Unit]] = js.native
}
object MKRangeSliderProperties {
  
  @scala.inline
  def apply(): MKRangeSliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MKRangeSliderProperties]
  }
  
  @scala.inline
  implicit class MKRangeSliderPropertiesMutableBuilder[Self <: MKRangeSliderProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* curValue */ Max => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnConfirm(value: /* curValue */ Max => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
    
    @scala.inline
    def setOnStart(value: () => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
  }
}
