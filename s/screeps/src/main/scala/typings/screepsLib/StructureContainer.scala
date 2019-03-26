package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains up to 2,000 resource units. Can be constructed in neutral rooms. Decays for 5,000 hits per 100 ticks.
  */
trait StructureContainer
  extends Structure[STRUCTURE_CONTAINER]
     with AnyStructure {
  /**
    * An object with the structure contents. Each object key is one of the RESOURCE_* constants, values are resources
    * amounts. Use _.sum(structure.store) to get the total amount of contents
    */
  var store: StoreDefinition
  /**
    * The total amount of resources the structure can contain.
    */
  var storeCapacity: scala.Double
  /**
    * The amount of game ticks when this container will lose some hit points.
    */
  var ticksToDecay: scala.Double
}

@JSGlobal("StructureContainer")
@js.native
class StructureContainerCls protected () extends StructureContainer {
  def this(id: java.lang.String) = this()
  /**
    * The current amount of hit points of the structure.
    */
  /* CompleteClass */
  override var hits: scala.Double = js.native
  /**
    * The total amount of hit points of the structure.
    */
  /* CompleteClass */
  override var hitsMax: scala.Double = js.native
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  /* CompleteClass */
  override var id: java.lang.String = js.native
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  override var pos: RoomPosition = js.native
  /**
    * The link to the Room object. May be undefined in case if an object is a
    * flag or a construction site and is placed in a room that is not visible
    * to you.
    */
  /* CompleteClass */
  override var room: js.UndefOr[Room] = js.native
  /**
    * If you can get an instance of a Structure, you can see it.
    * If you can see the Structure, you can see the room it's in.
    */
  /* CompleteClass */
  @JSName("room")
  override var room_Structure: Room = js.native
  /**
    * An object with the structure contents. Each object key is one of the RESOURCE_* constants, values are resources
    * amounts. Use _.sum(structure.store) to get the total amount of contents
    */
  /* CompleteClass */
  override var store: StoreDefinition = js.native
  /**
    * The total amount of resources the structure can contain.
    */
  /* CompleteClass */
  override var storeCapacity: scala.Double = js.native
  /**
    * One of the STRUCTURE_* constants.
    */
  /* CompleteClass */
  override var structureType: STRUCTURE_CONTAINER = js.native
  /**
    * The amount of game ticks when this container will lose some hit points.
    */
  /* CompleteClass */
  override var ticksToDecay: scala.Double = js.native
  /**
    * Destroy this structure immediately.
    */
  /* CompleteClass */
  override def destroy(): ScreepsReturnCode = js.native
  /**
    * Check whether this structure can be used. If the room controller level is not enough, then this method will return false, and the structure will be highlighted with red in the game.
    */
  /* CompleteClass */
  override def isActive(): scala.Boolean = js.native
  /**
    * Toggle auto notification when the structure is under attack. The notification will be sent to your account email. Turned on by default.
    * @param enabled Whether to enable notification or disable.
    */
  /* CompleteClass */
  override def notifyWhenAttacked(enabled: scala.Boolean): ScreepsReturnCode = js.native
}

object StructureContainer {
  @scala.inline
  def apply(
    destroy: () => ScreepsReturnCode,
    hits: scala.Double,
    hitsMax: scala.Double,
    id: java.lang.String,
    isActive: () => scala.Boolean,
    notifyWhenAttacked: scala.Boolean => ScreepsReturnCode,
    pos: RoomPosition,
    room: Room,
    store: StoreDefinition,
    storeCapacity: scala.Double,
    structureType: STRUCTURE_CONTAINER,
    ticksToDecay: scala.Double
  ): StructureContainer = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), hits = hits, hitsMax = hitsMax, id = id, isActive = js.Any.fromFunction0(isActive), notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos, room = room, store = store, storeCapacity = storeCapacity, structureType = structureType, ticksToDecay = ticksToDecay)
  
    __obj.asInstanceOf[StructureContainer]
  }
}

