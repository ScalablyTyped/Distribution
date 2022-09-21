package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListTeamMemberWagesRequest")
@js.native
open class ListTeamMemberWagesRequest () extends StObject {
  
  /**
    * Pointer to the next page of Employee Wage results to fetch.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of Team Member Wages to return per page. Can range between 1 and 200. The default is the maximum at 200.
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * Filter wages returned to only those that are associated with the specified team member.
    */
  var team_member_id: js.UndefOr[String] = js.native
}
