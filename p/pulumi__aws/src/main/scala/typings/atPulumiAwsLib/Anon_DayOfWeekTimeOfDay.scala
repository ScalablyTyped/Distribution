package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DayOfWeekTimeOfDay extends js.Object {
  var dayOfWeek: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var timeOfDay: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var timeZone: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_DayOfWeekTimeOfDay {
  @scala.inline
  def apply(
    dayOfWeek: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    timeOfDay: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    timeZone: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_DayOfWeekTimeOfDay = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dayOfWeek")(dayOfWeek.asInstanceOf[js.Any])
    __obj.updateDynamic("timeOfDay")(timeOfDay.asInstanceOf[js.Any])
    __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DayOfWeekTimeOfDay]
  }
}

