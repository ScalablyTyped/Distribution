package typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs

import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.SFSRoom
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.RoomSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.System.CreateRoomRequest")
@js.native
class CreateRoomRequest protected () extends js.Object {
  /**
    * Creates a new CreateRoomRequest instance.
    * @param {RoomSettings}     settings    An object containing the Room configuration settings.
    * @param {boolean}          {autoJoin=false}    If true, the Room is joined as soon as it is created.
    * @param {Entities.SFSRoom} {roomToLeave=null} A SFSRoom object representing the Room that should be left if the new Room is auto-joined.
    */
  def this(settings: RoomSettings) = this()
  def this(settings: RoomSettings, autoJoin: Boolean) = this()
  def this(settings: RoomSettings, autoJoin: Boolean, roomToLeave: SFSRoom) = this()
}

