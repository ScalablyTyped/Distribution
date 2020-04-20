package typings.reactNativeCalendarPicker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxDurationArrayItem extends js.Object {
  var date: MomentParsable
  var maxDuration: Double
}

object MaxDurationArrayItem {
  @scala.inline
  def apply(date: MomentParsable, maxDuration: Double): MaxDurationArrayItem = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], maxDuration = maxDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxDurationArrayItem]
  }
}

