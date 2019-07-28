package typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.MMONs

import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.DataNs.Vec3D
import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.MMORoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.MMO.SetUserPositionRequest")
@js.native
class SetUserPositionRequest protected () extends js.Object {
  /**
    * Creates a new SetUserPositionRequest instance.
    * @param {Entities.Data.Vec3D} pos        The user position.
    * @param {Entities.MMORoom}    [targetRoom=null] The MMORoom object corresponding to the Room where the position should be set; if null, the last Room joined by the user is used.
    */
  def this(pos: Vec3D) = this()
  def this(pos: Vec3D, targetRoom: MMORoom) = this()
}

