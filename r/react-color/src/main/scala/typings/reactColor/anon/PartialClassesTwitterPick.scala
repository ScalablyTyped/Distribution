package typings.reactColor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/twitter/Twitter.TwitterPickerStylesProps>> */
trait PartialClassesTwitterPick extends js.Object {
  var default: js.UndefOr[PartialTwitterPickerStyle] = js.undefined
}

object PartialClassesTwitterPick {
  @scala.inline
  def apply(default: PartialTwitterPickerStyle = null): PartialClassesTwitterPick = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassesTwitterPick]
  }
}

