package typings
package smartDashFoxDashServerLib.SFS2XNs.RequestsNs.GameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.Game.InviteUsersRequest")
@js.native
class InviteUsersRequest protected () extends js.Object {
  /**
                   * Creates a new InviteUsersRequest instance.
                   * @param {Entities.SFSUser[]} invitedUsers     A list of SFSUser objects, each representing a user to send the invitation to.
                   * @param {number}             secondsForAnswer The number of seconds available to each invited user to reply to the invitation (recommended range: 15 to 40 seconds).
                   * @param {Object}             [params=null]           An object containing custom parameters containing additional invitation details.
                   */
  def this(invitedUsers: js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser], secondsForAnswer: scala.Double) = this()
  /**
                   * Creates a new InviteUsersRequest instance.
                   * @param {Entities.SFSUser[]} invitedUsers     A list of SFSUser objects, each representing a user to send the invitation to.
                   * @param {number}             secondsForAnswer The number of seconds available to each invited user to reply to the invitation (recommended range: 15 to 40 seconds).
                   * @param {Object}             [params=null]           An object containing custom parameters containing additional invitation details.
                   */
  def this(invitedUsers: js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser], secondsForAnswer: scala.Double, params: js.Object) = this()
}

