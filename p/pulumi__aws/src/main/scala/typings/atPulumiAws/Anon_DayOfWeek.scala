package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DayOfWeek extends js.Object {
  var dayOfWeek: String
  var timeOfDay: String
  var timeZone: String
}

object Anon_DayOfWeek {
  @scala.inline
  def apply(dayOfWeek: String, timeOfDay: String, timeZone: String): Anon_DayOfWeek = {
    val __obj = js.Dynamic.literal(dayOfWeek = dayOfWeek, timeOfDay = timeOfDay, timeZone = timeZone)
  
    __obj.asInstanceOf[Anon_DayOfWeek]
  }
}

