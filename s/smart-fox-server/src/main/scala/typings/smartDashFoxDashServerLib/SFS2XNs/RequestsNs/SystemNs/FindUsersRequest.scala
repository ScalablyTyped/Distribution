package typings
package smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.System.FindUsersRequest")
@js.native
class FindUsersRequest protected () extends js.Object {
  /**
                   * Creates a new FindUsersRequest instance.
                   * @param {Entities.Match.MatchExpression} expr   A matching expression that the system will use to retrieve the users.
                   * @param {any}                            [target=null] The name of a Group or a single SFSRoom object where to search for matching users; if null, the search is performed in the whole Zone.
                   * @param {number}                         [limit=0]  The maximum size of the list of users that will be returned by the userFindResult event. If 0, all the found users are returned.
                   */
  def this(expr: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.MatchNs.MatchExpression) = this()
  /**
                   * Creates a new FindUsersRequest instance.
                   * @param {Entities.Match.MatchExpression} expr   A matching expression that the system will use to retrieve the users.
                   * @param {any}                            [target=null] The name of a Group or a single SFSRoom object where to search for matching users; if null, the search is performed in the whole Zone.
                   * @param {number}                         [limit=0]  The maximum size of the list of users that will be returned by the userFindResult event. If 0, all the found users are returned.
                   */
  def this(expr: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.MatchNs.MatchExpression, target: js.Any) = this()
  /**
                   * Creates a new FindUsersRequest instance.
                   * @param {Entities.Match.MatchExpression} expr   A matching expression that the system will use to retrieve the users.
                   * @param {any}                            [target=null] The name of a Group or a single SFSRoom object where to search for matching users; if null, the search is performed in the whole Zone.
                   * @param {number}                         [limit=0]  The maximum size of the list of users that will be returned by the userFindResult event. If 0, all the found users are returned.
                   */
  def this(expr: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.MatchNs.MatchExpression, target: js.Any, limit: scala.Double) = this()
}

