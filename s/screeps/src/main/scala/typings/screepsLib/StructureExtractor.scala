package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows to harvest mineral deposits.
  */
trait StructureExtractor
  extends OwnedStructure[STRUCTURE_EXTRACTOR]
     with AnyOwnedStructure {
  /**
    * The amount of game ticks until the next harvest action is possible.
    */
  var cooldown: scala.Double
}

object StructureExtractor {
  @scala.inline
  def apply(
    cooldown: scala.Double,
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
    structureType: STRUCTURE_EXTRACTOR
  ): StructureExtractor = {
    val __obj = js.Dynamic.literal(cooldown = cooldown, destroy = destroy, hits = hits, hitsMax = hitsMax, id = id, isActive = isActive, my = my, notifyWhenAttacked = notifyWhenAttacked, owner = owner, pos = pos, room = room, structureType = structureType)
  
    __obj.asInstanceOf[StructureExtractor]
  }
}

