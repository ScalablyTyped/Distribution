package typings
package primereactLib.componentsCalendarCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateMetaData extends js.Object {
  var day: scala.Double
  var month: scala.Double
  var otherMonth: scala.Boolean
  var selectable: scala.Boolean
  var today: scala.Boolean
  var year: scala.Double
}

object DateMetaData {
  @scala.inline
  def apply(
    day: scala.Double,
    month: scala.Double,
    otherMonth: scala.Boolean,
    selectable: scala.Boolean,
    today: scala.Boolean,
    year: scala.Double
  ): DateMetaData = {
    val __obj = js.Dynamic.literal(day = day, month = month, otherMonth = otherMonth, selectable = selectable, today = today, year = year)
  
    __obj.asInstanceOf[DateMetaData]
  }
}

