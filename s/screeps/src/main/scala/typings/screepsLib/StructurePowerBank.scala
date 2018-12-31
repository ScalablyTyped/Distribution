package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Non-player structure. Contains power resource which can be obtained by destroying the structure. Hits the attacker creep back on each attack.
  */
trait StructurePowerBank extends OwnedStructure[STRUCTURE_POWER_BANK] {
  /**
    * The amount of power containing.
    */
  var power: scala.Double
  /**
    * The amount of game ticks when this structure will disappear.
    */
  var ticksToDecay: scala.Double
}

