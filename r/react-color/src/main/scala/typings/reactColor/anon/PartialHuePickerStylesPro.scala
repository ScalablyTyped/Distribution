package typings.reactColor.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-color.react-color/lib/components/hue/Hue.HuePickerStylesProps> */
trait PartialHuePickerStylesPro extends js.Object {
  var hue: js.UndefOr[CSSProperties] = js.undefined
  var picker: js.UndefOr[CSSProperties] = js.undefined
}

object PartialHuePickerStylesPro {
  @scala.inline
  def apply(hue: CSSProperties = null, picker: CSSProperties = null): PartialHuePickerStylesPro = {
    val __obj = js.Dynamic.literal()
    if (hue != null) __obj.updateDynamic("hue")(hue.asInstanceOf[js.Any])
    if (picker != null) __obj.updateDynamic("picker")(picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialHuePickerStylesPro]
  }
}

