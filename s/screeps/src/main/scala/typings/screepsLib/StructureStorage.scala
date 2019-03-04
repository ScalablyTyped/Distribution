package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A structure that can store huge amount of resource units. Only one structure
  * per room is allowed that can be addressed by `Room.storage` property.
  */
trait StructureStorage
  extends OwnedStructure[STRUCTURE_STORAGE]
     with AnyOwnedStructure {
  /**
    * An object with the storage contents.
    */
  var store: StoreDefinition
  /**
    * The total amount of resources the storage can contain.
    */
  var storeCapacity: scala.Double
}

object StructureStorage {
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
    store: StoreDefinition,
    storeCapacity: scala.Double,
    structureType: STRUCTURE_STORAGE
  ): StructureStorage = {
    val __obj = js.Dynamic.literal(destroy = destroy, hits = hits, hitsMax = hitsMax, id = id, isActive = isActive, my = my, notifyWhenAttacked = notifyWhenAttacked, owner = owner, pos = pos, room = room, store = store, storeCapacity = storeCapacity, structureType = structureType)
  
    __obj.asInstanceOf[StructureStorage]
  }
}

