package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchTeamMembersFilter")
@js.native
class SearchTeamMembersFilter () extends StObject {
  
  /**
    * When present, filter by team members assigned to the specified locations. When empty, include team members assigned to any location.
    */
  var locationIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * When present, filter by team members who match the given status. When empty, include team members of all statuses.
    * See [TeamMemberStatus](#type-teammemberstatus) for possible values.
    */
  var status: js.UndefOr[String] = js.native
}
