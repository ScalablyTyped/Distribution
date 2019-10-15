package typings.smartDashFoxDashServer.SFS2X.Requests.System

import typings.smartDashFoxDashServer.SFS2X.Entities.SFSRoom
import typings.smartDashFoxDashServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.System.ObjectMessageRequest")
@js.native
class ObjectMessageRequest protected () extends js.Object {
  /**
    * Creates a new ObjectMessageRequest instance.
    * @param {Object}             obj        An object containing custom parameters to be sent to the message recipients.
    * @param {Entities.SFSRoom}   [targetRoom=null] The SFSRoom object corresponding to the Room where the message should be dispatched; if null, the last Room joined by the user is used.
    * @param {Entities.SFSUser[]} [recipients=null] A list of SFSUser objects corresponding to the message recipients; if null, the message is sent to all users in the target Room (except the sender themselves).
    */
  def this(obj: js.Object) = this()
  def this(obj: js.Object, targetRoom: SFSRoom) = this()
  def this(obj: js.Object, targetRoom: SFSRoom, recipients: js.Array[SFSUser]) = this()
}

