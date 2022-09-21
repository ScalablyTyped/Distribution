package typings.squareConnect.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "BulkUpdateTeamMembersResponse")
@js.native
open class BulkUpdateTeamMembersResponse () extends StObject {
  
  /**
    * The errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The successfully updated `TeamMember` objects.
    * Each key is the `team_member_id` that maps to the `UpdateTeamMemberRequest`.
    */
  var team_members: Record[String, UpdateTeamMemberResponse] = js.native
}
