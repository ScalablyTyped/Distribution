package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides visibility into a distant room from your script.
  */
trait StructureObserver
  extends OwnedStructure[STRUCTURE_OBSERVER]
     with AnyOwnedStructure {
  /**
    * Provide visibility into a distant room from your script. The target room object will be available on the next tick. The maximum range is 5 rooms.
    * @param roomName
    */
  def observeRoom(roomName: java.lang.String): ScreepsReturnCode
}

object StructureObserver {
  @scala.inline
  def apply(
    destroy: js.Function0[ScreepsReturnCode],
    hits: scala.Double,
    hitsMax: scala.Double,
    id: java.lang.String,
    isActive: js.Function0[scala.Boolean],
    my: scala.Boolean,
    notifyWhenAttacked: js.Function1[scala.Boolean, ScreepsReturnCode],
    observeRoom: js.Function1[java.lang.String, ScreepsReturnCode],
    owner: Owner,
    pos: RoomPosition,
    room: Room,
    structureType: STRUCTURE_OBSERVER
  ): StructureObserver = {
    val __obj = js.Dynamic.literal(destroy = destroy, hits = hits, hitsMax = hitsMax, id = id, isActive = isActive, my = my, notifyWhenAttacked = notifyWhenAttacked, observeRoom = observeRoom, owner = owner, pos = pos, room = room, structureType = structureType)
  
    __obj.asInstanceOf[StructureObserver]
  }
}

