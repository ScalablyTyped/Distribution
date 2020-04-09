package typings.screeps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows to harvest mineral deposits.
  */
trait StructureExtractor
  extends OwnedStructure[STRUCTURE_EXTRACTOR]
     with AnyOwnedStructure
     with ConcreteStructure[js.Any] {
  /**
    * The amount of game ticks until the next harvest action is possible.
    */
  var cooldown: Double
}

@JSGlobal("StructureExtractor")
@js.native
object StructureExtractor extends TopLevel[StructureExtractorConstructor]

