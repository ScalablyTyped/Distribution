package typings
package reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangedSelection extends js.Object {
  var end: stdLib.Date
  var eventType: EVENT_TYPE
  var start: stdLib.Date
}

object RangedSelection {
  @scala.inline
  def apply(end: stdLib.Date, eventType: EVENT_TYPE, start: stdLib.Date): RangedSelection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("eventType")(eventType)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[RangedSelection]
  }
}

