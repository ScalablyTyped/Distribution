package typings.squareConnect.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "BulkUpdateTeamMembersRequest")
@js.native
class BulkUpdateTeamMembersRequest () extends js.Object {
  
  /**
    * The data which will be used to update the `TeamMember` objects.
    * Each key is the `team_member_id` that maps to the `UpdateTeamMemberRequest`.
    */
  var team_members: Record[String, UpdateTeamMemberRequest] = js.native
}
