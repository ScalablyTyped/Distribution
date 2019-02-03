package typings
package smartDashFoxDashServerLib.SFS2XNs.UtilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Utils.ClientDisconnectionReason")
@js.native
class ClientDisconnectionReason () extends js.Object

/* static members */
@JSGlobal("SFS2X.Utils.ClientDisconnectionReason")
@js.native
object ClientDisconnectionReason extends js.Object {
  /** @type {string} Client was banned from the server. */
  var BAN: java.lang.String = js.native
  /** @type {string} Client was disconnected because it was idle for too long. */
  var IDLE: java.lang.String = js.native
  /** @type {string} Client was kicked out of the server. */
  var KICK: java.lang.String = js.native
  /** @type {string} The client manually disconnected from the server. */
  var MANUAL: java.lang.String = js.native
  /** @type {string} A generic network error occurred, and the client is unable to determine the cause of the disconnection. */
  var UNKNOWN: java.lang.String = js.native
}

