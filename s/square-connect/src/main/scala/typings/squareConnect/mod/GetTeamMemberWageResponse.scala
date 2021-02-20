package typings.squareConnect.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "GetTeamMemberWageResponse")
@js.native
class GetTeamMemberWageResponse () extends StObject {
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * The requested `TeamMemberWage` object.
    */
  var team_member_wage: js.UndefOr[TeamMemberWage] = js.native
}
