package typings.squareConnect.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "UpdateTeamMemberResponse")
@js.native
class UpdateTeamMemberResponse () extends StObject {
  
  /**
    * The errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * The successfully updated `TeamMember` object.
    */
  var team_member: js.UndefOr[TeamMember] = js.native
}
