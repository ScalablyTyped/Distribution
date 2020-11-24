package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "BusinessHoursPeriod")
@js.native
class BusinessHoursPeriod () extends js.Object {
  
  /**
    * The day of week for this time period. See [DayOfWeek](#type-dayofweek) for possible values
    */
  var day_of_week: js.UndefOr[DayOfWeekType] = js.native
  
  /**
    * The end time of a business hours period, specified in local time using partial-time RFC3339 format.
    */
  var end_local_time: js.UndefOr[String] = js.native
  
  /**
    * The start time of a business hours period, specified in local time using partial-time RFC3339 format.
    */
  var start_local_time: js.UndefOr[String] = js.native
}
