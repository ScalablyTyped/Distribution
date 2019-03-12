package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Launches a nuke to another room dealing huge damage to the landing area.
  * Each launch has a cooldown and requires energy and ghodium resources. Launching
  * creates a Nuke object at the target room position which is visible to any player
  * until it is landed. Incoming nuke cannot be moved or cancelled. Nukes cannot
  * be launched from or to novice rooms.
  */
trait StructureNuker
  extends OwnedStructure[STRUCTURE_NUKER]
     with AnyOwnedStructure {
  /**
    * The amount of game ticks the link has to wait until the next transfer is possible.
    */
  var cooldown: scala.Double
  /**
    * The amount of energy contained in this structure.
    */
  var energy: scala.Double
  /**
    * The total amount of energy this structure can contain.
    */
  var energyCapacity: scala.Double
  /**
    * The amount of energy contained in this structure.
    */
  var ghodium: scala.Double
  /**
    * The total amount of energy this structure can contain.
    */
  var ghodiumCapacity: scala.Double
  /**
    * Launch a nuke to the specified position.
    * @param pos The target room position.
    */
  def launchNuke(pos: RoomPosition): ScreepsReturnCode
}

object StructureNuker {
  @scala.inline
  def apply(
    cooldown: scala.Double,
    destroy: () => ScreepsReturnCode,
    energy: scala.Double,
    energyCapacity: scala.Double,
    ghodium: scala.Double,
    ghodiumCapacity: scala.Double,
    hits: scala.Double,
    hitsMax: scala.Double,
    id: java.lang.String,
    isActive: () => scala.Boolean,
    launchNuke: RoomPosition => ScreepsReturnCode,
    my: scala.Boolean,
    notifyWhenAttacked: scala.Boolean => ScreepsReturnCode,
    owner: Owner,
    pos: RoomPosition,
    room: Room,
    structureType: STRUCTURE_NUKER
  ): StructureNuker = {
    val __obj = js.Dynamic.literal(cooldown = cooldown, destroy = js.Any.fromFunction0(destroy), energy = energy, energyCapacity = energyCapacity, ghodium = ghodium, ghodiumCapacity = ghodiumCapacity, hits = hits, hitsMax = hitsMax, id = id, isActive = js.Any.fromFunction0(isActive), launchNuke = js.Any.fromFunction1(launchNuke), my = my, notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), owner = owner, pos = pos, room = room, structureType = structureType)
  
    __obj.asInstanceOf[StructureNuker]
  }
}

