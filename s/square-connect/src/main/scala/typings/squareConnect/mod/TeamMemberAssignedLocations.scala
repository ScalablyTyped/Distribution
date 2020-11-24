package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "TeamMemberAssignedLocations")
@js.native
class TeamMemberAssignedLocations () extends js.Object {
  
  /**
    * The current assignment type of the team member.
    * See [TeamMemberAssignedLocationsAssignmentType](#type-teammemberassignedlocationsassignmenttype) for possible values.
    */
  var assignment_type: js.UndefOr[String] = js.native
  
  /**
    * The locations that the team member is assigned to.
    */
  var location_ids: js.UndefOr[js.Array[String]] = js.native
}
