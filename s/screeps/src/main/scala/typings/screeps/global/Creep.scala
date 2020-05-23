package typings.screeps.global

import org.scalablytyped.runtime.TopLevel
import typings.screeps.CreepConstructor
import typings.screeps.Id
import typings.screeps.RoomObjectEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Creep")
@js.native
class Creep protected ()
  extends typings.screeps.Creep {
  def this(id: Id[typings.screeps.Creep]) = this()
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

@JSGlobal("Creep")
@js.native
object Creep extends TopLevel[CreepConstructor]

