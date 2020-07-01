package typings.reactColor.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-color.react-color/lib/components/alpha/Alpha.AlphaPickerStylesProps> */
trait PartialAlphaPickerStylesP extends js.Object {
  var alpha: js.UndefOr[CSSProperties] = js.undefined
  var picker: js.UndefOr[CSSProperties] = js.undefined
}

object PartialAlphaPickerStylesP {
  @scala.inline
  def apply(alpha: CSSProperties = null, picker: CSSProperties = null): PartialAlphaPickerStylesP = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (picker != null) __obj.updateDynamic("picker")(picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialAlphaPickerStylesP]
  }
}

