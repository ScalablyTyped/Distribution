package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains energy which can be spent on spawning bigger creeps. Extensions can
  * be placed anywhere in the room, any spawns will be able to use them regardless
  * of distance.
  */
trait StructureExtension
  extends OwnedStructure[STRUCTURE_EXTENSION]
     with AnyOwnedStructure {
  /**
    * The amount of energy containing in the extension.
    */
  var energy: scala.Double
  /**
    * The total amount of energy the extension can contain.
    */
  var energyCapacity: scala.Double
}

object StructureExtension {
  @scala.inline
  def apply(
    destroy: js.Function0[ScreepsReturnCode],
    energy: scala.Double,
    energyCapacity: scala.Double,
    hits: scala.Double,
    hitsMax: scala.Double,
    id: java.lang.String,
    isActive: js.Function0[scala.Boolean],
    my: scala.Boolean,
    notifyWhenAttacked: js.Function1[scala.Boolean, ScreepsReturnCode],
    owner: Owner,
    pos: RoomPosition,
    room: Room,
    structureType: STRUCTURE_EXTENSION
  ): StructureExtension = {
    val __obj = js.Dynamic.literal(destroy = destroy, energy = energy, energyCapacity = energyCapacity, hits = hits, hitsMax = hitsMax, id = id, isActive = isActive, my = my, notifyWhenAttacked = notifyWhenAttacked, owner = owner, pos = pos, room = room, structureType = structureType)
  
    __obj.asInstanceOf[StructureExtension]
  }
}

