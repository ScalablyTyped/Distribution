package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "BusinessHoursPeriod")
@js.native
class BusinessHoursPeriod () extends js.Object {
  /**
    * The day of week for this time period. See [DayOfWeek](#type-dayofweek) for possible values
    */
  var day_of_week: js.UndefOr[squareDashConnectLib.squareDashConnectMod.BusinessHoursPeriodNs.DayOfWeekEnum] = js.native
  /**
    * The end time of a business hours period, specified in local time using partial-time RFC3339 format.
    */
  var end_local_time: js.UndefOr[java.lang.String] = js.native
  /**
    * The start time of a business hours period, specified in local time using partial-time RFC3339 format.
    */
  var start_local_time: js.UndefOr[java.lang.String] = js.native
}

