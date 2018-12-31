package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object with additional options for the spawning process.
  */
trait SpawnOptions extends js.Object {
  /**
    * Set desired directions where the creep should move when spawned.
    * An array with the direction constants.
    */
  var directions: js.UndefOr[js.Array[DirectionConstant]] = js.undefined
  /**
    * If dryRun is <code>true</code>, the operation will only check if it is possible to create a creep.
    */
  var dryRun: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Array of spawns/extensions from which to draw energy for the spawning process.
    * Structures will be used according to the array order.
    */
  var energyStructures: js.UndefOr[js.Array[StructureSpawn | StructureExtension]] = js.undefined
  /**
    * Memory of the new creep. If provided, it will be immediately stored into Memory.creeps[name].
    */
  var memory: js.UndefOr[CreepMemory] = js.undefined
}

