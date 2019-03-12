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

