package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Non-player structure. Spawns NPC Source Keepers that guards energy sources
  * and minerals in some rooms. This structure cannot be destroyed.
  */
trait StructureKeeperLair
  extends OwnedStructure[STRUCTURE_KEEPER_LAIR]
     with AnyOwnedStructure {
  /**
    * Time to spawning of the next Source Keeper.
    */
  var ticksToSpawn: js.UndefOr[scala.Double] = js.undefined
}

object StructureKeeperLair {
  @scala.inline
  def apply(
    destroy: js.Function0[ScreepsReturnCode],
    hits: scala.Double,
    hitsMax: scala.Double,
    id: java.lang.String,
    isActive: js.Function0[scala.Boolean],
    my: scala.Boolean,
    notifyWhenAttacked: js.Function1[scala.Boolean, ScreepsReturnCode],
    owner: Owner,
    pos: RoomPosition,
    room: Room,
    structureType: STRUCTURE_KEEPER_LAIR,
    ticksToSpawn: scala.Int | scala.Double = null
  ): StructureKeeperLair = {
    val __obj = js.Dynamic.literal(destroy = destroy, hits = hits, hitsMax = hitsMax, id = id, isActive = isActive, my = my, notifyWhenAttacked = notifyWhenAttacked, owner = owner, pos = pos, room = room, structureType = structureType)
    if (ticksToSpawn != null) __obj.updateDynamic("ticksToSpawn")(ticksToSpawn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureKeeperLair]
  }
}

