package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectStrings.CLOSED
import typings.squareDashConnect.squareDashConnectStrings.OPEN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "Shift")
@js.native
class Shift () extends js.Object {
  /**
    * A list of any paid or unpaid breaks that were taken during this shift.
    */
  var breaks: js.UndefOr[js.Array[ModelBreak]] = js.native
  /**
    * A read-only timestamp in RFC 3339 format; presented in UTC.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * The ID of the employee this shift belongs to.
    */
  var employee_id: String = js.native
  /**
    * RFC 3339; shifted to timezone + offset. Precision up to the minute is respected; seconds are truncated. The
    * `end_at` minute is not counted when the shift length is calculated. For example, a shift from `00:00` to `08:01`
    * is considered an 8 hour shift (midnight to 8am).
    */
  var end_at: js.UndefOr[String] = js.native
  /**
    * UUID for this object.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The ID of the location this shift occurred at. Should be based on where the employee clocked in.
    */
  var location_id: js.UndefOr[String] = js.native
  /**
    * RFC 3339; shifted to location timezone + offset. Precision up to the minute is respected; seconds are truncated.
    */
  var start_at: String = js.native
  /**
    * Describes working state of the current `Shift`. See [ShiftStatus](#type-shiftstatus) for possible values.
    */
  var status: js.UndefOr[OPEN | CLOSED] = js.native
  /**
    * Read-only convenience value that is calculated from the location based on `location_id`. Format: the IANA
    * Timezone Database identifier for the location timezone.
    */
  var timezone: js.UndefOr[String] = js.native
  /**
    * A read-only timestamp in RFC 3339 format; presented in UTC.
    */
  var updated_at: js.UndefOr[String] = js.native
  /**
    * Used for resolving concurrency issues; request will fail if version provided does not match server version at
    * time of request. If not provided, Square executes a blind write; potentially overwriting data from another write.
    */
  var version: js.UndefOr[Double] = js.native
  /**
    * Job and pay related information.
    */
  var wage: js.UndefOr[ShiftWage] = js.native
}

