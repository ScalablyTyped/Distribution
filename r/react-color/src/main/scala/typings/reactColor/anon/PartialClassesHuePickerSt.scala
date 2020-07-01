package typings.reactColor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/hue/Hue.HuePickerStylesProps>> */
trait PartialClassesHuePickerSt extends js.Object {
  var default: js.UndefOr[PartialHuePickerStylesPro] = js.undefined
}

object PartialClassesHuePickerSt {
  @scala.inline
  def apply(default: PartialHuePickerStylesPro = null): PartialClassesHuePickerSt = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassesHuePickerSt]
  }
}

