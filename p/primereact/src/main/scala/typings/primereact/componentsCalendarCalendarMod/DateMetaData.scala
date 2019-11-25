package typings.primereact.componentsCalendarCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateMetaData extends js.Object {
  var day: Double
  var month: Double
  var otherMonth: Boolean
  var selectable: Boolean
  var today: Boolean
  var year: Double
}

object DateMetaData {
  @scala.inline
  def apply(day: Double, month: Double, otherMonth: Boolean, selectable: Boolean, today: Boolean, year: Double): DateMetaData = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], otherMonth = otherMonth.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DateMetaData]
  }
}

