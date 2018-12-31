package typings
package smartDashFoxDashServerLib.SFS2XNs.RequestsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.RoomPermissions")
@js.native
/**
  * Creates a new RoomPermissions instance.
  */
class RoomPermissions () extends js.Object {
  /** @type {boolean} Sets whether changing the Room name after its creation is allowed or not. */
  var allowNameChange: scala.Boolean = js.native
  /** @type {boolean} Sets whether changing (or removing) the Room password after its creation is allowed or not. */
  var allowPasswordStateChange: scala.Boolean = js.native
  /** @type {boolean} Sets whether users inside the Room are allowed to send public messages or not. */
  var allowPublicMessages: scala.Boolean = js.native
  /** @type {boolean} Sets whether the Room capacity can be changed after its creation or not. */
  var aloowResizing: scala.Boolean = js.native
}

