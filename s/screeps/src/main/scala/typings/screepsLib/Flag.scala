package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A flag. Flags can be used to mark particular spots in a room. Flags are visible to their owners only.
  */
@js.native
trait Flag extends RoomObject {
  /**
    * Flag color. One of the `COLOR_*` constants.
    */
  var color: ColorConstant = js.native
  /**
    * A shorthand to Memory.flags[flag.name]. You can use it for quick access the flag's specific memory data object.
    */
  var memory: FlagMemory = js.native
  /**
    * Flag’s name.
    *
    * You can choose the name while creating a new flag, and it cannot be changed later.
    *
    * This name is a hash key to access the spawn via the `Game.flags` object. The maximum name length is 60 characters.
    */
  var name: java.lang.String = js.native
  /**
    * Flag secondary color. One of the `COLOR_*` constants.
    */
  var secondaryColor: ColorConstant = js.native
  /**
    * Remove the flag.
    * @returns Result Code: OK
    */
  def remove(): OK = js.native
  /**
    * Set new color of the flag.
    * @param color One of the following constants: COLOR_WHITE, COLOR_GREY, COLOR_RED, COLOR_PURPLE, COLOR_BLUE, COLOR_CYAN, COLOR_GREEN, COLOR_YELLOW, COLOR_ORANGE, COLOR_BROWN
    * @parma secondaryColor Secondary color of the flag. One of the COLOR_* constants.
    * @returns Result Code: OK, ERR_INVALID_ARGS
    */
  def setColor(color: ColorConstant): OK | ERR_INVALID_ARGS = js.native
  def setColor(color: ColorConstant, secondaryColor: ColorConstant): OK | ERR_INVALID_ARGS = js.native
  def setPosition(pos: Anon_Pos): OK | ERR_INVALID_ARGS = js.native
  /**
    * Set new position of the flag.
    * @param pos Can be a RoomPosition object or any object containing RoomPosition.
    * @returns Result Code: OK, ERR_INVALID_TARGET
    */
  def setPosition(pos: RoomPosition): OK | ERR_INVALID_ARGS = js.native
  /**
    * Set new position of the flag.
    * @param x The X position in the room.
    * @param y The Y position in the room.
    * @returns Result Code: OK, ERR_INVALID_TARGET
    */
  def setPosition(x: scala.Double, y: scala.Double): OK | ERR_INVALID_ARGS = js.native
}

@JSGlobal("Flag")
@js.native
class FlagCls protected () extends Flag {
  def this(name: java.lang.String, color: ColorConstant, secondaryColor: ColorConstant, roomName: java.lang.String, x: scala.Double, y: scala.Double) = this()
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

