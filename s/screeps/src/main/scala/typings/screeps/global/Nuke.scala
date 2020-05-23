package typings.screeps.global

import org.scalablytyped.runtime.TopLevel
import typings.screeps.Id
import typings.screeps.NukeConstructor
import typings.screeps.RoomObjectEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Nuke")
@js.native
class Nuke protected ()
  extends typings.screeps.Nuke {
  def this(id: Id[typings.screeps.Nuke]) = this()
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  override var effects: js.Array[RoomObjectEffect] = js.native
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  /* CompleteClass */
  override var id: Id[this.type] = js.native
  /**
    * The name of the room where this nuke has been launched from.
    */
  /* CompleteClass */
  override var launchRoomName: String = js.native
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  override var pos: typings.screeps.RoomPosition = js.native
  /**
    * The remaining landing time.
    */
  /* CompleteClass */
  override var timeToLand: Double = js.native
}

@JSGlobal("Nuke")
@js.native
object Nuke extends TopLevel[NukeConstructor]

