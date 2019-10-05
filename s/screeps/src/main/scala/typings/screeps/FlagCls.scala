package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Flag")
@js.native
class FlagCls protected () extends Flag {
  def this(
    name: String,
    color: ColorConstant,
    secondaryColor: ColorConstant,
    roomName: String,
    x: Double,
    y: Double
  ) = this()
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  override var effects: js.Array[RoomObjectEffect] = js.native
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  override var pos: RoomPosition = js.native
}

