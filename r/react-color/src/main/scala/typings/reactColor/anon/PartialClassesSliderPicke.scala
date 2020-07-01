package typings.reactColor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/slider/Slider.SliderPickerStylesProps>> */
trait PartialClassesSliderPicke extends js.Object {
  var default: js.UndefOr[PartialSliderPickerStyles] = js.undefined
}

object PartialClassesSliderPicke {
  @scala.inline
  def apply(default: PartialSliderPickerStyles = null): PartialClassesSliderPicke = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassesSliderPicke]
  }
}

