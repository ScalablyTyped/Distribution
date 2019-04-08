package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1Timecard")
@js.native
class V1Timecard () extends js.Object {
  /**
    * The ID of the location the employee clocked in from. We strongly reccomend providing a clockin_location_id.
    * Square uses the clockin_location_id to determine a timecard’s timezone and overtime rules.
    */
  var clockin_location_id: js.UndefOr[java.lang.String] = js.native
  /**
    * The clock-in time for the timecard, in ISO 8601 format.
    */
  var clockin_time: js.UndefOr[java.lang.String] = js.native
  /**
    * The ID of the location the employee clocked out from. Provide this value only if importing timecard information
    * from another system.
    */
  var clockout_location_id: js.UndefOr[java.lang.String] = js.native
  /**
    * The clock-out time for the timecard, in ISO 8601 format. Provide this value only if importing timecard
    * information from another system.
    */
  var clockout_time: js.UndefOr[java.lang.String] = js.native
  /**
    * The time when the timecard was created, in ISO 8601 format.
    */
  var created_at: js.UndefOr[java.lang.String] = js.native
  /**
    * If true, the timecard was deleted by the merchant, and it is no longer valid.
    */
  var deleted: js.UndefOr[scala.Boolean] = js.native
  /**
    * The total number of doubletime seconds worked in the timecard.
    */
  var doubletime_seconds_worked: js.UndefOr[scala.Double] = js.native
  /**
    * The ID of the employee the timecard is associated with.
    */
  var employee_id: java.lang.String = js.native
  /**
    * The timecard's unique ID.
    */
  var id: js.UndefOr[java.lang.String] = js.native
  /**
    * The total number of overtime seconds worked in the timecard.
    */
  var overtime_seconds_worked: js.UndefOr[scala.Double] = js.native
  /**
    * The total number of regular (non-overtime) seconds worked in the timecard.
    */
  var regular_seconds_worked: js.UndefOr[scala.Double] = js.native
  /**
    * The time when the timecard was most recently updated, in ISO 8601 format.
    */
  var updated_at: js.UndefOr[java.lang.String] = js.native
}

