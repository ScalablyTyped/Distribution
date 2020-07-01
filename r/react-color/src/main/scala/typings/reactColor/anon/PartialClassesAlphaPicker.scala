package typings.reactColor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/alpha/Alpha.AlphaPickerStylesProps>> */
trait PartialClassesAlphaPicker extends js.Object {
  var default: js.UndefOr[PartialAlphaPickerStylesP] = js.undefined
}

object PartialClassesAlphaPicker {
  @scala.inline
  def apply(default: PartialAlphaPickerStylesP = null): PartialClassesAlphaPicker = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassesAlphaPicker]
  }
}

