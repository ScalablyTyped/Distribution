package typings
package reactDashMdLib.libPickersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntlTimeFormat extends js.Object {
  var hour: js.UndefOr[N2D] = js.undefined
  var minute: js.UndefOr[N2D] = js.undefined
  var second: js.UndefOr[N2D] = js.undefined
  var timeZoneName: js.UndefOr[
    reactDashMdLib.reactDashMdLibStrings.short | reactDashMdLib.reactDashMdLibStrings.long
  ] = js.undefined
}

object IntlTimeFormat {
  @scala.inline
  def apply(
    hour: N2D = null,
    minute: N2D = null,
    second: N2D = null,
    timeZoneName: reactDashMdLib.reactDashMdLibStrings.short | reactDashMdLib.reactDashMdLibStrings.long = null
  ): IntlTimeFormat = {
    val __obj = js.Dynamic.literal()
    if (hour != null) __obj.updateDynamic("hour")(hour)
    if (minute != null) __obj.updateDynamic("minute")(minute)
    if (second != null) __obj.updateDynamic("second")(second)
    if (timeZoneName != null) __obj.updateDynamic("timeZoneName")(timeZoneName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntlTimeFormat]
  }
}

