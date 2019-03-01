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
    destroy: js.Function0[ScreepsReturnCode],
    hits: scala.Double,
    hitsMax: scala.Double,
    id: java.lang.String,
    isActive: js.Function0[scala.Boolean],
    notifyWhenAttacked: js.Function1[scala.Boolean, ScreepsReturnCode],
    pos: RoomPosition,
    room: Room,
    store: StoreDefinition,
    storeCapacity: scala.Double,
    structureType: STRUCTURE_CONTAINER,
    ticksToDecay: scala.Double
  ): StructureContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("hits")(hits)
    __obj.updateDynamic("hitsMax")(hitsMax)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isActive")(isActive)
    __obj.updateDynamic("notifyWhenAttacked")(notifyWhenAttacked)
    __obj.updateDynamic("pos")(pos)
    __obj.updateDynamic("room")(room)
    __obj.updateDynamic("store")(store)
    __obj.updateDynamic("storeCapacity")(storeCapacity)
    __obj.updateDynamic("structureType")(structureType)
    __obj.updateDynamic("ticksToDecay")(ticksToDecay)
    __obj.asInstanceOf[StructureContainer]
  }
}

