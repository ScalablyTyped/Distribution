package typings.screeps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parent object for structure classes
  */
trait Structure[T /* <: StructureConstant */] extends RoomObject {
  /**
    * The current amount of hit points of the structure.
    */
  var hits: Double
  /**
    * The total amount of hit points of the structure.
    */
  var hitsMax: Double
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  var id: String
  /**
    * If you can get an instance of a Structure, you can see it.
    * If you can see the Structure, you can see the room it's in.
    */
  @JSName("room")
  var room_Structure: Room
  /**
    * One of the STRUCTURE_* constants.
    */
  var structureType: T
  /**
    * Destroy this structure immediately.
    */
  def destroy(): ScreepsReturnCode
  /**
    * Check whether this structure can be used. If the room controller level is not enough, then this method will return false, and the structure will be highlighted with red in the game.
    */
  def isActive(): Boolean
  /**
    * Toggle auto notification when the structure is under attack. The notification will be sent to your account email. Turned on by default.
    * @param enabled Whether to enable notification or disable.
    */
  def notifyWhenAttacked(enabled: Boolean): ScreepsReturnCode
}

@JSGlobal("Structure")
@js.native
object Structure extends TopLevel[StructureConstructor]

