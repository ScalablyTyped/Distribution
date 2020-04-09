package typings.screeps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Blocks movement of hostile creeps, and defends your creeps and structures on
  * the same tile. Can be used as a controllable gate.
  */
trait StructureRampart
  extends OwnedStructure[STRUCTURE_RAMPART]
     with AnyOwnedStructure
     with ConcreteStructure[js.Any] {
  /**
    * If false (default), only your creeps can step on the same square. If true, any hostile creeps can pass through.
    */
  var isPublic: Boolean
  /**
    * The amount of game ticks when this rampart will lose some hit points.
    */
  var ticksToDecay: Double
  /**
    * Make this rampart public to allow other players' creeps to pass through.
    * @param isPublic Whether this rampart should be public or non-public
    */
  def setPublic(isPublic: Boolean): js.UndefOr[scala.Nothing]
}

@JSGlobal("StructureRampart")
@js.native
object StructureRampart extends TopLevel[StructureRampartConstructor]

