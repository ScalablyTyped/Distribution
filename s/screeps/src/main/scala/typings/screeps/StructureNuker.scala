package typings.screeps

import org.scalablytyped.runtime.TopLevel
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
  var cooldown: Double
  /**
    * The amount of energy contained in this structure.
    */
  var energy: Double
  /**
    * The total amount of energy this structure can contain.
    */
  var energyCapacity: Double
  /**
    * The amount of energy contained in this structure.
    */
  var ghodium: Double
  /**
    * The total amount of energy this structure can contain.
    */
  var ghodiumCapacity: Double
  /**
    * Launch a nuke to the specified position.
    * @param pos The target room position.
    */
  def launchNuke(pos: RoomPosition): ScreepsReturnCode
}

@JSGlobal("StructureNuker")
@js.native
object StructureNuker extends TopLevel[StructureNukerConstructor]

