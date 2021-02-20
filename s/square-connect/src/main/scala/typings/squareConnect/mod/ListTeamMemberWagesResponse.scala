package typings.squareConnect.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListTeamMemberWagesResponse")
@js.native
class ListTeamMemberWagesResponse () extends StObject {
  
  /**
    * Value supplied in the subsequent request to fetch the next next page of Team Member Wage results.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * A page of Team Member Wage results.
    */
  var team_member_wages: js.UndefOr[js.Array[TeamMemberWage]] = js.native
}
