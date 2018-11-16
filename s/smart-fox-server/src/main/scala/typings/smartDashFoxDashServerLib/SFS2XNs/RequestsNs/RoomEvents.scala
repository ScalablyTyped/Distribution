package typings
package smartDashFoxDashServerLib.SFS2XNs.RequestsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.RoomEvents")
@js.native
class RoomEvents () extends js.Object {
  /** @type {boolean} Sets whether or not the userCountChange event should be dispatched whenever the users (or players+spectators) count changes in the Room. */
  var allowUserCountChance: scala.Boolean = js.native
  /** @type {boolean} Sets whether the userEnterRoom event should be dispatched whenever a user joins the Room or not. */
  var allowUserEnter: scala.Boolean = js.native
  /** @type {boolean} Sets whether the userExitRoom event should be dispatched whenever a user leaves the Room or not. */
  var allowUserExit: scala.Boolean = js.native
  /** @type {boolean} Sets whether or not the userVariablesUpdate event should be dispatched whenever a user in the Room updates his User Variables */
  var allowUserVariablesUpdate: scala.Boolean = js.native
}

