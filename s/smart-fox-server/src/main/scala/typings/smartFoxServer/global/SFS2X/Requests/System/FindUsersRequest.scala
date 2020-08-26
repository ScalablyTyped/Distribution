package typings.smartFoxServer.global.SFS2X.Requests.System

import typings.smartFoxServer.SFS2X.Entities.Match.MatchExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.System.FindUsersRequest")
@js.native
class FindUsersRequest protected ()
  extends typings.smartFoxServer.SFS2X.Requests.System.FindUsersRequest {
  /**
    * Creates a new FindUsersRequest instance.
    * @param {Entities.Match.MatchExpression} expr   A matching expression that the system will use to retrieve the users.
    * @param {any}                            [target=null] The name of a Group or a single SFSRoom object where to search for matching users; if null, the search is performed in the whole Zone.
    * @param {number}                         [limit=0]  The maximum size of the list of users that will be returned by the userFindResult event. If 0, all the found users are returned.
    */
  def this(expr: MatchExpression) = this()
  def this(expr: MatchExpression, target: js.Any) = this()
  def this(expr: MatchExpression, target: js.UndefOr[scala.Nothing], limit: Double) = this()
  def this(expr: MatchExpression, target: js.Any, limit: Double) = this()
}

