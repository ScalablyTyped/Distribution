package typings.screeps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Decreases movement cost to 1. Using roads allows creating creeps with less
  * `MOVE` body parts.
  */
trait StructureRoad
  extends Structure[STRUCTURE_ROAD]
     with AnyStructure
     with ConcreteStructure[js.Any] {
  /**
    * The amount of game ticks when this road will lose some hit points.
    */
  var ticksToDecay: Double
}

@JSGlobal("StructureRoad")
@js.native
object StructureRoad extends TopLevel[StructureRoadConstructor]

