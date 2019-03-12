package typings
package screepsLib

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
  var ticksToDecay: js.UndefOr[scala.Double]
}

object StructurePortal {
  @scala.inline
  def apply(
    destination: RoomPosition | Anon_RoomShard,
    destroy: () => ScreepsReturnCode,
    hits: scala.Double,
    hitsMax: scala.Double,
    id: java.lang.String,
    isActive: () => scala.Boolean,
    notifyWhenAttacked: scala.Boolean => ScreepsReturnCode,
    pos: RoomPosition,
    room: Room,
    structureType: STRUCTURE_PORTAL,
    ticksToDecay: scala.Int | scala.Double = null
  ): StructurePortal = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), hits = hits, hitsMax = hitsMax, id = id, isActive = js.Any.fromFunction0(isActive), notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos, room = room, structureType = structureType)
    if (ticksToDecay != null) __obj.updateDynamic("ticksToDecay")(ticksToDecay.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructurePortal]
  }
}

