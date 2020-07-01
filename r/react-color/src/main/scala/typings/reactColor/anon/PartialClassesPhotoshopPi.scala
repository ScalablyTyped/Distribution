package typings.reactColor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/photoshop/Photoshop.PhotoshopPickerStylesProps>> */
trait PartialClassesPhotoshopPi extends js.Object {
  var default: js.UndefOr[PartialPhotoshopPickerSty] = js.undefined
}

object PartialClassesPhotoshopPi {
  @scala.inline
  def apply(default: PartialPhotoshopPickerSty = null): PartialClassesPhotoshopPi = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassesPhotoshopPi]
  }
}

