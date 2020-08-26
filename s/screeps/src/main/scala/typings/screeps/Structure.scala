package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parent object for structure classes
  */
@js.native
trait Structure[T /* <: StructureConstant */] extends RoomObject {
  /**
    * The current amount of hit points of the structure.
    */
  var hits: Double = js.native
  /**
    * The total amount of hit points of the structure.
    */
  var hitsMax: Double = js.native
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  var id: Id[this.type] = js.native
  /**
    * If you can get an instance of a Structure, you can see it.
    * If you can see the Structure, you can see the room it's in.
    */
  @JSName("room")
  var room_Structure: Room = js.native
  /**
    * One of the STRUCTURE_* constants.
    */
  var structureType: T = js.native
  /**
    * Destroy this structure immediately.
    */
  def destroy(): ScreepsReturnCode = js.native
  /**
    * Check whether this structure can be used. If the room controller level is not enough, then this method will return false, and the structure will be highlighted with red in the game.
    */
  def isActive(): Boolean = js.native
  /**
    * Toggle auto notification when the structure is under attack. The notification will be sent to your account email. Turned on by default.
    * @param enabled Whether to enable notification or disable.
    */
  def notifyWhenAttacked(enabled: Boolean): ScreepsReturnCode = js.native
}

object Structure {
  @scala.inline
  def apply[/* <: typings.screeps.StructureConstant */ T](
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: Id[Structure[T]],
    isActive: () => Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    pos: RoomPosition,
    room: Room,
    structureType: T
  ): Structure[T] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Structure[T]]
  }
  @scala.inline
  implicit class StructureOps[Self <: Structure[_], /* <: typings.screeps.StructureConstant */ T] (val x: Self with Structure[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestroy(value: () => ScreepsReturnCode): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setHits(value: Double): Self = this.set("hits", value.asInstanceOf[js.Any])
    @scala.inline
    def setHitsMax(value: Double): Self = this.set("hitsMax", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Id[Structure[T]]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsActive(value: () => Boolean): Self = this.set("isActive", js.Any.fromFunction0(value))
    @scala.inline
    def setNotifyWhenAttacked(value: Boolean => ScreepsReturnCode): Self = this.set("notifyWhenAttacked", js.Any.fromFunction1(value))
    @scala.inline
    def setRoom(value: Room): Self = this.set("room", value.asInstanceOf[js.Any])
    @scala.inline
    def setStructureType(value: T): Self = this.set("structureType", value.asInstanceOf[js.Any])
  }
  
}

