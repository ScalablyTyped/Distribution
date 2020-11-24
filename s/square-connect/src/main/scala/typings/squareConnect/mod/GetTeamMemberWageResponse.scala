package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "GetTeamMemberWageResponse")
@js.native
class GetTeamMemberWageResponse () extends js.Object {
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * The requested `TeamMemberWage` object.
    */
  var team_member_wage: js.UndefOr[TeamMemberWage] = js.native
}
