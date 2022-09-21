package typings.screeps

import typings.screeps.anon.Pos
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A flag. Flags can be used to mark particular spots in a room. Flags are visible to their owners only.
  */
@js.native
trait Flag
  extends StObject
     with RoomObject {
  
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
    * This name is a hash key to access the flag via the `Game.flags` object. The maximum name length is 60 characters.
    */
  var name: String = js.native
  
  /**
    * Remove the flag.
    * @returns Result Code: OK
    */
  def remove(): OK = js.native
  
  /**
    * Flag secondary color. One of the `COLOR_*` constants.
    */
  var secondaryColor: ColorConstant = js.native
  
  /**
    * Set new color of the flag.
    * @param color One of the following constants: COLOR_WHITE, COLOR_GREY, COLOR_RED, COLOR_PURPLE, COLOR_BLUE, COLOR_CYAN, COLOR_GREEN, COLOR_YELLOW, COLOR_ORANGE, COLOR_BROWN
    * @parma secondaryColor Secondary color of the flag. One of the COLOR_* constants.
    * @returns Result Code: OK, ERR_INVALID_ARGS
    */
  def setColor(color: ColorConstant): OK | ERR_INVALID_ARGS = js.native
  def setColor(color: ColorConstant, secondaryColor: ColorConstant): OK | ERR_INVALID_ARGS = js.native
  
  /**
    * Set new position of the flag.
    * @param pos Can be a RoomPosition object or any object containing RoomPosition.
    * @returns Result Code: OK, ERR_INVALID_TARGET
    */
  def setPosition(pos: RoomPosition): OK | ERR_INVALID_ARGS = js.native
  def setPosition(pos: Pos): OK | ERR_INVALID_ARGS = js.native
  /**
    * Set new position of the flag.
    * @param x The X position in the room.
    * @param y The Y position in the room.
    * @returns Result Code: OK, ERR_INVALID_TARGET
    */
  def setPosition(x: Double, y: Double): OK | ERR_INVALID_ARGS = js.native
}
