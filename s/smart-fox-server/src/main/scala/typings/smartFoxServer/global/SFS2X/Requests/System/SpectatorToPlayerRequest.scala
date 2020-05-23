package typings.smartFoxServer.global.SFS2X.Requests.System

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.System.SpectatorToPlayerRequest")
@js.native
class SpectatorToPlayerRequest protected ()
  extends typings.smartFoxServer.SFS2X.Requests.System.SpectatorToPlayerRequest {
  /**
    * Creates a new SpectatorToPlayerRequest instance.
    * @param {Entities.SFSRoom} targetRoom The SFSRoom object corresponding to the Room in which the spectator should be turned to player. If null, the last Room joined by the user is used.
    */
  def this(targetRoom: SFSRoom) = this()
}

