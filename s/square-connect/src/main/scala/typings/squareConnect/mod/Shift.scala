package typings.squareConnect.mod

import typings.squareConnect.squareConnectStrings.CLOSED
import typings.squareConnect.squareConnectStrings.OPEN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * The ID of the employee this shift belongs to. DEPRECATED at version 2020-08-26. Use `team_member_id` instead
    */
  var employee_id: js.UndefOr[String] = js.native
  
  /**
    * RFC 3339; shifted to timezone + offset. Precision up to the minute is respected; seconds are truncated.
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
    * The ID of the team member this shift belongs to. Replaced `employee_id` at version \"2020-08-26\"
    */
  var team_member_id: js.UndefOr[String] = js.native
  
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
    * Job and pay related information. If wage is not set on create, will default to a wage of zero money.
    * If title is not set on create, will default to the name of the role the employee is assigned to, if any.
    */
  var wage: js.UndefOr[ShiftWage] = js.native
}
