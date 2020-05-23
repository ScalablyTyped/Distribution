package typings.smartFoxServer.global.SFS2X.Requests

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.RoomEvents")
@js.native
/**
  * Creates a new RoomEvents instance.
  */
class RoomEvents ()
  extends typings.smartFoxServer.SFS2X.Requests.RoomEvents {
  /** @type {boolean} Sets whether or not the userCountChange event should be dispatched whenever the users (or players+spectators) count changes in the Room. */
  /* CompleteClass */
  override var allowUserCountChance: Boolean = js.native
  /** @type {boolean} Sets whether the userEnterRoom event should be dispatched whenever a user joins the Room or not. */
  /* CompleteClass */
  override var allowUserEnter: Boolean = js.native
  /** @type {boolean} Sets whether the userExitRoom event should be dispatched whenever a user leaves the Room or not. */
  /* CompleteClass */
  override var allowUserExit: Boolean = js.native
  /** @type {boolean} Sets whether or not the userVariablesUpdate event should be dispatched whenever a user in the Room updates their User Variables */
  /* CompleteClass */
  override var allowUserVariablesUpdate: Boolean = js.native
}

