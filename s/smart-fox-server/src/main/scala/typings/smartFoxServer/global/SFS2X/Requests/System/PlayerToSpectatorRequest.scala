package typings.smartFoxServer.global.SFS2X.Requests.System

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SFS2X.Requests.System.PlayerToSpectatorRequest")
@js.native
/**
  * Creates a new SpectatorToPlayerRequest instance.
  * @param {Entities.SFSRoom} [targetRoom=null] The SFSRoom object corresponding to the Room in which the spectator should be turned to player. If null, the last Room joined by the user is used.
  */
class PlayerToSpectatorRequest ()
  extends typings.smartFoxServer.SFS2X.Requests.System.PlayerToSpectatorRequest {
  def this(targetRoom: SFSRoom) = this()
}
