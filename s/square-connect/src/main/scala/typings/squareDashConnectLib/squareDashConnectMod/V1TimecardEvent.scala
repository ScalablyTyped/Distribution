package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1TimecardEvent")
@js.native
class V1TimecardEvent () extends js.Object {
  /**
    * The time the employee clocked in, in ISO 8601 format.
    */
  var clockin_time: js.UndefOr[java.lang.String] = js.native
  /**
    * The time the employee clocked out, in ISO 8601 format.
    */
  var clockout_time: js.UndefOr[java.lang.String] = js.native
  /**
    * The time when the event was created, in ISO 8601 format.
    */
  var created_at: js.UndefOr[java.lang.String] = js.native
  /**
    * The ID of the timecard to list events for. See [V1TimecardEventEventType](#type-v1timecardeventeventtype) for
    * possible values
    */
  var event_type: js.UndefOr[squareDashConnectLib.squareDashConnectMod.V1TimecardEventNs.EventTypeEnum] = js.native
  /**
    * The event's unique ID.
    */
  var id: js.UndefOr[java.lang.String] = js.native
}

