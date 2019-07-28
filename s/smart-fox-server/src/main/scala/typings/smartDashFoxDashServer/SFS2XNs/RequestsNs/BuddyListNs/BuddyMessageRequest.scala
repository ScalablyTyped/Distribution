package typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.BuddyListNs

import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.SFSBuddy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.BuddyList.BuddyMessageRequest")
@js.native
class BuddyMessageRequest protected () extends js.Object {
  /**
    * Creates a new BuddyMessageRequest instance.
    * @param {string}            message     The message to be sent to a buddy.
    * @param {Entities.SFSBuddy} targetBuddy The SFSBuddy object corresponding to the message recipient.
    * @param {Object}            [parms=null]       An object containing additional custom parameters (e.g. the message color, an emoticon id, etc).
    */
  def this(message: String, targetBuddy: SFSBuddy) = this()
  def this(message: String, targetBuddy: SFSBuddy, parms: js.Object) = this()
}

