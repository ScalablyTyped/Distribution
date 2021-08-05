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
  
  inline def apply(): BaseSlider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseSlider]
  }
  
  extension [Self <: BaseSlider](x: Self) {
    
    inline def setLowerTrackColor(value: String): Self = StObject.set(x, "lowerTrackColor", value.asInstanceOf[js.Any])
    
    inline def setLowerTrackColorUndefined: Self = StObject.set(x, "lowerTrackColor", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setThumbPadding(value: Double): Self = StObject.set(x, "thumbPadding", value.asInstanceOf[js.Any])
    
    inline def setThumbPaddingUndefined: Self = StObject.set(x, "thumbPadding", js.undefined)
    
    inline def setThumbRadius(value: Double): Self = StObject.set(x, "thumbRadius", value.asInstanceOf[js.Any])
    
    inline def setThumbRadiusUndefined: Self = StObject.set(x, "thumbRadius", js.undefined)
    
    inline def setTrackSize(value: Double): Self = StObject.set(x, "trackSize", value.asInstanceOf[js.Any])
    
    inline def setTrackSizeUndefined: Self = StObject.set(x, "trackSize", js.undefined)
    
    inline def setUpperTrackColor(value: String): Self = StObject.set(x, "upperTrackColor", value.asInstanceOf[js.Any])
    
    inline def setUpperTrackColorUndefined: Self = StObject.set(x, "upperTrackColor", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
