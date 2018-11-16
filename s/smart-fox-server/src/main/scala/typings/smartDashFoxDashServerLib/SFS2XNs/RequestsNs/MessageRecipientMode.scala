package typings
package smartDashFoxDashServerLib.SFS2XNs.RequestsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.MessageRecipientMode")
@js.native
class MessageRecipientMode protected () extends js.Object {
  /**
               * Creates a new MessageRecipientMode instance.
               * @param {number} mode   One of the costants contained in this class, describing the recipient mode.
               * @param {any}    target The moderator/administrator message recipient/s, according to the selected recipient mode.
               */
  def this(mode: scala.Double, target: js.Any) = this()
  /** @type {number} Returns the selected recipient mode. */
  var mode: scala.Double = js.native
  /** @type {any} Returns the moderator/administrator message target, according to the selected recipient mode. */
  var target: js.Any = js.native
}

@JSGlobal("SFS2X.Requests.MessageRecipientMode")
@js.native
object MessageRecipientMode extends js.Object {
  /** @type {number} The moderator/administrator message will be sent to all the clients who subscribed a specific Room Group. */
  var TO_GROUP: scala.Double = js.native
  /** @type {number} The moderator/administrator message will be sent to all the users in a specific Room. */
  var TO_ROOM: scala.Double = js.native
  /** @type {number} The moderator/administrator message will be sent to a specific user. */
  var TO_USER: scala.Double = js.native
  /** @type {number} The moderator/administrator message will be sent to all the users in the Zone. */
  var TO_ZONE: scala.Double = js.native
}

