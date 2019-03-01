package typings
package screepsLib

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
  var hits: scala.Double
  /**
    * The total amount of hit points of the structure.
    */
  var hitsMax: scala.Double
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  var id: java.lang.String
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
  def isActive(): scala.Boolean
  /**
    * Toggle auto notification when the structure is under attack. The notification will be sent to your account email. Turned on by default.
    * @param enabled Whether to enable notification or disable.
    */
  def notifyWhenAttacked(enabled: scala.Boolean): ScreepsReturnCode
}

object Structure {
  @scala.inline
  def apply[T /* <: StructureConstant */](
    destroy: js.Function0[ScreepsReturnCode],
    hits: scala.Double,
    hitsMax: scala.Double,
    id: java.lang.String,
    isActive: js.Function0[scala.Boolean],
    notifyWhenAttacked: js.Function1[scala.Boolean, ScreepsReturnCode],
    pos: RoomPosition,
    room: Room,
    structureType: T
  ): Structure[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("hits")(hits)
    __obj.updateDynamic("hitsMax")(hitsMax)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isActive")(isActive)
    __obj.updateDynamic("notifyWhenAttacked")(notifyWhenAttacked)
    __obj.updateDynamic("pos")(pos)
    __obj.updateDynamic("room")(room)
    __obj.updateDynamic("structureType")(structureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Structure[T]]
  }
}

