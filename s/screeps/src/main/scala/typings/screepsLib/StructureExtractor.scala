package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows to harvest mineral deposits.
  */
trait StructureExtractor extends OwnedStructure[STRUCTURE_EXTRACTOR] {
  /**
    * The amount of game ticks until the next harvest action is possible.
    */
  var cooldown: scala.Double
}

