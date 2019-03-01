package typings
package reactDashInfiniteDashCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var end: reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarMod.DateType
  var start: reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarMod.DateType
}

object Anon_End {
  @scala.inline
  def apply(
    end: reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarMod.DateType,
    start: reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarMod.DateType
  ): Anon_End = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_End]
  }
}

