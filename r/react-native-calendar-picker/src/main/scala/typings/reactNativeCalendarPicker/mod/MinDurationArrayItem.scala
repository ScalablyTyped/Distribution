package typings.reactNativeCalendarPicker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinDurationArrayItem extends js.Object {
  var date: MomentParsable
  var minDuration: Double
}

object MinDurationArrayItem {
  @scala.inline
  def apply(date: MomentParsable, minDuration: Double): MinDurationArrayItem = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], minDuration = minDuration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MinDurationArrayItem]
  }
}

