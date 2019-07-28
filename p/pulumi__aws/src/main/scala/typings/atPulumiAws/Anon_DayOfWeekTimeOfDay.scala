package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DayOfWeekTimeOfDay extends js.Object {
  var dayOfWeek: Input[String]
  var timeOfDay: Input[String]
  var timeZone: Input[String]
}

object Anon_DayOfWeekTimeOfDay {
  @scala.inline
  def apply(dayOfWeek: Input[String], timeOfDay: Input[String], timeZone: Input[String]): Anon_DayOfWeekTimeOfDay = {
    val __obj = js.Dynamic.literal(dayOfWeek = dayOfWeek.asInstanceOf[js.Any], timeOfDay = timeOfDay.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DayOfWeekTimeOfDay]
  }
}

