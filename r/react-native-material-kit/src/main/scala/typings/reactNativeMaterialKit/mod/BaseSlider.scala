package typings.reactNativeMaterialKit.mod

import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseSlider
  extends StObject
     with ViewProps {
  
  var lowerTrackColor: js.UndefOr[String] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var step: js.UndefOr[Double] = js.undefined
  
  var thumbPadding: js.UndefOr[Double] = js.undefined
  
  var thumbRadius: js.UndefOr[Double] = js.undefined
  
  var trackSize: js.UndefOr[Double] = js.undefined
  
  var upperTrackColor: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object BaseSlider {
  
  @scala.inline
  def apply(): BaseSlider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseSlider]
  }
  
  @scala.inline
  implicit class BaseSliderMutableBuilder[Self <: BaseSlider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLowerTrackColor(value: String): Self = StObject.set(x, "lowerTrackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerTrackColorUndefined: Self = StObject.set(x, "lowerTrackColor", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setThumbPadding(value: Double): Self = StObject.set(x, "thumbPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbPaddingUndefined: Self = StObject.set(x, "thumbPadding", js.undefined)
    
    @scala.inline
    def setThumbRadius(value: Double): Self = StObject.set(x, "thumbRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbRadiusUndefined: Self = StObject.set(x, "thumbRadius", js.undefined)
    
    @scala.inline
    def setTrackSize(value: Double): Self = StObject.set(x, "trackSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackSizeUndefined: Self = StObject.set(x, "trackSize", js.undefined)
    
    @scala.inline
    def setUpperTrackColor(value: String): Self = StObject.set(x, "upperTrackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperTrackColorUndefined: Self = StObject.set(x, "upperTrackColor", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
