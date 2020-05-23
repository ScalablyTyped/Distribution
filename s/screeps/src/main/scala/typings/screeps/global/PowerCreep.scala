package typings.screeps.global

import org.scalablytyped.runtime.TopLevel
import typings.screeps.Id
import typings.screeps.PowerCreepConstructor
import typings.screeps.RoomObjectEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerCreep")
@js.native
class PowerCreep protected ()
  extends typings.screeps.PowerCreep {
  def this(id: Id[typings.screeps.PowerCreep]) = this()
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  override var effects: js.Array[RoomObjectEffect] = js.native
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  override var pos: typings.screeps.RoomPosition = js.native
}

@JSGlobal("PowerCreep")
@js.native
object PowerCreep extends TopLevel[PowerCreepConstructor]

