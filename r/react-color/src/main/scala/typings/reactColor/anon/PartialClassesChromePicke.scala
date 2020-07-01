package typings.reactColor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/chrome/Chrome.ChromePickerStylesProps>> */
trait PartialClassesChromePicke extends js.Object {
  var default: js.UndefOr[PartialChromePickerStyles] = js.undefined
}

object PartialClassesChromePicke {
  @scala.inline
  def apply(default: PartialChromePickerStyles = null): PartialClassesChromePicke = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassesChromePicke]
  }
}

