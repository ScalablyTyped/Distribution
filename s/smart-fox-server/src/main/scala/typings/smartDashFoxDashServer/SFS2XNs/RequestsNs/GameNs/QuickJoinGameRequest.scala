package typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.GameNs

import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.MatchNs.MatchExpression
import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.Game.QuickJoinGameRequest")
@js.native
class QuickJoinGameRequest protected () extends js.Object {
  /**
    * Creates a new QuickJoinGameRequest instance.
    * @param {Entities.SFSRoom[]} whereToSearch An array of SFSRoom objects or an array of Group names to which the matching expression should be applied. The maximum number of elements that this array can contain is 32.
    * @param {Entities.SFSRoom}   [roomToLeave=null]   A SFSRoom object representing the Room that the user should leave when joining the game.
    */
  def this(whereToSearch: js.Array[SFSRoom]) = this()
  /**
    * Creates a new QuickJoinGameRequest instance.
    * @param {Entities.Match.MatchExpression} matchExpression A matching expression that the system will use to search a Game Room where to join the current user.
    * @param {Entities.SFSRoom[]} whereToSearch An array of SFSRoom objects or an array of Group names to which the matching expression should be applied. The maximum number of elements that this array can contain is 32.
    * @param {Entities.SFSRoom}               [roomToLeave=null]     A SFSRoom object representing the Room that the user should leave when joining the game.
    */
  def this(matchExpression: MatchExpression, whereToSearch: js.Array[SFSRoom]) = this()
  def this(whereToSearch: js.Array[SFSRoom], roomToLeave: SFSRoom) = this()
  def this(matchExpression: MatchExpression, whereToSearch: js.Array[SFSRoom], roomToLeave: SFSRoom) = this()
}

