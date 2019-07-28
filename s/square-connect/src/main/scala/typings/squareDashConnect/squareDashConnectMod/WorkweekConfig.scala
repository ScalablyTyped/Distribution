package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.WorkweekConfigNs.StartOfWeekEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "WorkweekConfig")
@js.native
class WorkweekConfig () extends js.Object {
  /**
    * A read-only timestamp in RFC 3339 format; presented in UTC.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * UUID for this object
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The local time at which a business week cuts over. Represented as a string in `HH:MM` format (`HH:MM:SS` is also
    * accepted, but seconds are truncated).
    */
  var start_of_day_local_time: String = js.native
  /**
    * The day of the week on which a business week cuts over for compensation purposes.
    * See [Weekday](#type-weekday) for possible values.
    */
  var start_of_week: StartOfWeekEnum = js.native
  /**
    * A read-only timestamp in RFC 3339 format; presented in UTC.
    */
  var updated_at: js.UndefOr[String] = js.native
  /**
    * Used for resolving concurrency issues; request will fail if version provided does not match server version at
    * time of request. If not provided, Square executes a blind write; potentially overwriting data from another write.
    */
  var version: js.UndefOr[Double] = js.native
}

