package typings.reactColor.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-color.react-color/lib/components/slider/Slider.SliderPickerStylesProps> */
trait PartialSliderPickerStyles extends js.Object {
  var Hue: js.UndefOr[CSSProperties] = js.undefined
  var hue: js.UndefOr[CSSProperties] = js.undefined
}

object PartialSliderPickerStyles {
  @scala.inline
  def apply(Hue: CSSProperties = null, hue: CSSProperties = null): PartialSliderPickerStyles = {
    val __obj = js.Dynamic.literal()
    if (Hue != null) __obj.updateDynamic("Hue")(Hue.asInstanceOf[js.Any])
    if (hue != null) __obj.updateDynamic("hue")(hue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSliderPickerStyles]
  }
}

