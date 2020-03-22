package typings.reactJsonschemaForm.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateObject extends js.Object {
  var day: Double
  var hour: Double
  var minute: Double
  var month: Double
  var second: Double
  var year: Double
}

object DateObject {
  @scala.inline
  def apply(day: Double, hour: Double, minute: Double, month: Double, second: Double, year: Double): DateObject = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DateObject]
  }
}

