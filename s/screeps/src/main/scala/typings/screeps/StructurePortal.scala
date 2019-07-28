package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A non-player structure.
  * Instantly teleports your creeps to a distant room acting as a room exit tile.
  * Portals appear randomly in the central room of each sector.
  */
trait StructurePortal
  extends Structure[STRUCTURE_PORTAL]
     with AnyStructure {
  /**
    * If this is an inter-room portal, then this property contains a RoomPosition object leading to the point in the destination room.
    * If this is an inter-shard portal, then this property contains an object with shard and room string properties.
    * Exact coordinates are undetermined, the creep will appear at any free spot in the destination room.
    */
  var destination: RoomPosition | Anon_RoomShard
  /**
    * The amount of game ticks when the portal disappears, or undefined when the portal is stable.
    */
  var ticksToDecay: js.UndefOr[Double] = js.undefined
}

@JSGlobal("StructurePortal")
@js.native
class StructurePortalCls protected () extends StructurePortal {
  def this(id: String) = this()
  /**
    * If this is an inter-room portal, then this property contains a RoomPosition object leading to the point in the destination room.
    * If this is an inter-shard portal, then this property contains an object with shard and room string properties.
    * Exact coordinates are undetermined, the creep will appear at any free spot in the destination room.
    */
  /* CompleteClass */
  override var destination: RoomPosition | Anon_RoomShard = js.native
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  override var effects: js.Array[RoomObjectEffect] = js.native
  /**
    * The current amount of hit points of the structure.
    */
  /* CompleteClass */
  override var hits: Double = js.native
  /**
    * The total amount of hit points of the structure.
    */
  /* CompleteClass */
  override var hitsMax: Double = js.native
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  /* CompleteClass */
  override var id: String = js.native
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
  override var structureType: STRUCTURE_PORTAL = js.native
  /**
    * Destroy this structure immediately.
    */
  /* CompleteClass */
  override def destroy(): ScreepsReturnCode = js.native
  /**
    * Check whether this structure can be used. If the room controller level is not enough, then this method will return false, and the structure will be highlighted with red in the game.
    */
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  /**
    * Toggle auto notification when the structure is under attack. The notification will be sent to your account email. Turned on by default.
    * @param enabled Whether to enable notification or disable.
    */
  /* CompleteClass */
  override def notifyWhenAttacked(enabled: Boolean): ScreepsReturnCode = js.native
}

object StructurePortal {
  @scala.inline
  def apply(
    destination: RoomPosition | Anon_RoomShard,
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: String,
    isActive: () => Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    pos: RoomPosition,
    room: Room,
    structureType: STRUCTURE_PORTAL,
    ticksToDecay: Int | Double = null
  ): StructurePortal = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), effects = effects, hits = hits, hitsMax = hitsMax, id = id, isActive = js.Any.fromFunction0(isActive), notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos, room = room, structureType = structureType)
    if (ticksToDecay != null) __obj.updateDynamic("ticksToDecay")(ticksToDecay.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructurePortal]
  }
}

