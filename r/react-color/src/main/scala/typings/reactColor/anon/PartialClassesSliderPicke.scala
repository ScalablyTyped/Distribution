package typings.reactColor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/slider/Slider.SliderPickerStylesProps>> */
trait PartialClassesSliderPicke extends StObject {
  
  var default: js.UndefOr[PartialSliderPickerStyles] = js.undefined
}
object PartialClassesSliderPicke {
  
  @scala.inline
  def apply(): PartialClassesSliderPicke = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassesSliderPicke]
  }
  
  @scala.inline
  implicit class PartialClassesSliderPickeMutableBuilder[Self <: PartialClassesSliderPicke] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: PartialSliderPickerStyles): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
