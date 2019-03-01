package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DayOfWeek extends js.Object {
  var dayOfWeek: java.lang.String
  var timeOfDay: java.lang.String
  var timeZone: java.lang.String
}

object Anon_DayOfWeek {
  @scala.inline
  def apply(dayOfWeek: java.lang.String, timeOfDay: java.lang.String, timeZone: java.lang.String): Anon_DayOfWeek = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dayOfWeek")(dayOfWeek)
    __obj.updateDynamic("timeOfDay")(timeOfDay)
    __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[Anon_DayOfWeek]
  }
}

