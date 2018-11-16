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

trait StructureExtension extends OwnedStructure[STRUCTURE_EXTENSION] {
  /**
       * The amount of energy containing in the extension.
       */
  var energy: scala.Double
  /**
       * The total amount of energy the extension can contain.
       */
  var energyCapacity: scala.Double
}

