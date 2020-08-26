package typings.reactColor.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-color.react-color/lib/components/slider/Slider.SliderPickerStylesProps> */
@js.native
trait PartialSliderPickerStyles extends js.Object {
  var Hue: js.UndefOr[CSSProperties] = js.native
  var hue: js.UndefOr[CSSProperties] = js.native
}

object PartialSliderPickerStyles {
  @scala.inline
  def apply(): PartialSliderPickerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSliderPickerStyles]
  }
  @scala.inline
  implicit class PartialSliderPickerStylesOps[Self <: PartialSliderPickerStyles] (val x: Self) extends AnyVal {
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
    def setHue(value: CSSProperties): Self = this.set("Hue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHue: Self = this.set("Hue", js.undefined)
  }
  
}

