package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Decreases movement cost to 1. Using roads allows creating creeps with less
  * `MOVE` body parts.
  */
trait StructureRoad
  extends Structure[STRUCTURE_ROAD]
     with AnyStructure {
  /**
    * The amount of game ticks when this road will lose some hit points.
    */
  var ticksToDecay: scala.Double
}

@JSGlobal("StructureRoad")
@js.native
class StructureRoadCls protected () extends StructureRoad {
  def this(id: java.lang.String) = this()
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  override var effects: js.Array[RoomObjectEffect] = js.native
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
    * If you can get an instance of a Structure, you can see it.
    * If you can see the Structure, you can see the room it's in.
    */
  /* CompleteClass */
  @JSName("room")
  override var room_Structure: Room = js.native
  /**
    * One of the STRUCTURE_* constants.
    */
  /* CompleteClass */
  override var structureType: STRUCTURE_ROAD = js.native
  /**
    * The amount of game ticks when this road will lose some hit points.
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

object StructureRoad {
  @scala.inline
  def apply(
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    hits: scala.Double,
    hitsMax: scala.Double,
    id: java.lang.String,
    isActive: () => scala.Boolean,
    notifyWhenAttacked: scala.Boolean => ScreepsReturnCode,
    pos: RoomPosition,
    room: Room,
    structureType: STRUCTURE_ROAD,
    ticksToDecay: scala.Double
  ): StructureRoad = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), effects = effects, hits = hits, hitsMax = hitsMax, id = id, isActive = js.Any.fromFunction0(isActive), notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos, room = room, structureType = structureType, ticksToDecay = ticksToDecay)
  
    __obj.asInstanceOf[StructureRoad]
  }
}

