package typings
package smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.System.FindRoomsRequest")
@js.native
class FindRoomsRequest protected () extends js.Object {
  /**
    * Creates a new FindRoomsRequest instance.
    * @param {Entities.Match.MatchExpression} expr    A matching expression that the system will use to retrieve the Rooms.
    * @param {string}                         {groupId=null} The name of the Group where to search for matching Rooms; if null, the search is performed in the whole Zone.
    * @param {number}                         [limit=0]   The maximum size of the list of Rooms that will be returned by the roomFindResult event. If 0, all the found Rooms are returned.
    */
  def this(expr: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.MatchNs.MatchExpression) = this()
  def this(expr: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.MatchNs.MatchExpression, groupId: java.lang.String) = this()
  def this(expr: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.MatchNs.MatchExpression, groupId: java.lang.String, limit: scala.Double) = this()
}

