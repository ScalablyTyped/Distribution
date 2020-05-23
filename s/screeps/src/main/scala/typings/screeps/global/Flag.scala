package typings.screeps.global

import org.scalablytyped.runtime.TopLevel
import typings.screeps.ColorConstant
import typings.screeps.FlagConstructor
import typings.screeps.RoomObjectEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Flag")
@js.native
class Flag protected ()
  extends typings.screeps.Flag {
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
  override var pos: typings.screeps.RoomPosition = js.native
}

@JSGlobal("Flag")
@js.native
object Flag extends TopLevel[FlagConstructor]

