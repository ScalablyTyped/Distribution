package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "WageSetting")
@js.native
class WageSetting () extends js.Object {
  
  /**
    * The timestamp in RFC 3339 format describing when the wage setting object was created.
    * Ex: \"2018-10-04T04:00:00-07:00\" or \"2019-02-05T12:00:00Z\"
    */
  var created_at: js.UndefOr[String] = js.native
  
  /**
    * Whether the team member is exempt from the overtime rules of the seller country.
    */
  var is_overtime_exempt: js.UndefOr[Boolean] = js.native
  
  /**
    * The ordered list of jobs that the team member is assigned to.
    * The first job assignment is considered the team member's \"Primary Job\". <br> <b>Min Length 1 Max Length 12</b>
    */
  var job_assignments: js.Array[JobAssignment] = js.native
  
  /**
    * The unique ID of the `TeamMember` whom this wage setting describes.
    */
  var team_member_id: js.UndefOr[String] = js.native
  
  /**
    * The timestamp in RFC 3339 format describing when the wage setting object was last updated.
    * Ex: \"2018-10-04T04:00:00-07:00\" or \"2019-02-05T12:00:00Z\"
    */
  var updated_at: js.UndefOr[String] = js.native
  
  /**
    * Used for resolving concurrency issues; request will fail if version provided does not match server version at time of request.
    * If not provided, Square executes a blind write, potentially overwriting data from another write.
    * Read about [optimistic concurrency](https://developer.squareup.com/docs/docs/working-with-apis/optimistic-concurrency)
    * in Square APIs for more information.
    */
  var version: js.UndefOr[Double] = js.native
}
