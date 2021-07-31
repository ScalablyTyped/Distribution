package typings.squareConnect.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchTeamMembersResponse")
@js.native
class SearchTeamMembersResponse () extends StObject {
  
  /**
    * The opaque cursor for fetching the next page.
    * Read about [pagination](https://developer.squareup.com/docs/docs/working-with-apis/pagination) with Square APIs for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * The errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * The filtered list of `TeamMember` objects.
    */
  var team_members: js.UndefOr[js.Array[TeamMember]] = js.native
}
