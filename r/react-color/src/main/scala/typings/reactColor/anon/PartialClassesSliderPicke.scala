package typings.reactColor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/slider/Slider.SliderPickerStylesProps>> */
@js.native
trait PartialClassesSliderPicke extends js.Object {
  var default: js.UndefOr[PartialSliderPickerStyles] = js.native
}

object PartialClassesSliderPicke {
  @scala.inline
  def apply(): PartialClassesSliderPicke = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassesSliderPicke]
  }
  @scala.inline
  implicit class PartialClassesSliderPickeOps[Self <: PartialClassesSliderPicke] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefault(value: PartialSliderPickerStyles): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
  }
  
}

