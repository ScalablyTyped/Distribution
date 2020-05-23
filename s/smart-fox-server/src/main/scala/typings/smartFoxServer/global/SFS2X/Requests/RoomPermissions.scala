package typings.smartFoxServer.global.SFS2X.Requests

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.RoomPermissions")
@js.native
/**
  * Creates a new RoomPermissions instance.
  */
class RoomPermissions ()
  extends typings.smartFoxServer.SFS2X.Requests.RoomPermissions {
  /** @type {boolean} Sets whether changing the Room name after its creation is allowed or not. */
  /* CompleteClass */
  override var allowNameChange: Boolean = js.native
  /** @type {boolean} Sets whether changing (or removing) the Room password after its creation is allowed or not. */
  /* CompleteClass */
  override var allowPasswordStateChange: Boolean = js.native
  /** @type {boolean} Sets whether users inside the Room are allowed to send public messages or not. */
  /* CompleteClass */
  override var allowPublicMessages: Boolean = js.native
  /** @type {boolean} Sets whether the Room capacity can be changed after its creation or not. */
  /* CompleteClass */
  override var aloowResizing: Boolean = js.native
}

