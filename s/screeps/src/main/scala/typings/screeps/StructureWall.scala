package typings.screeps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Blocks movement of all creeps.
  */
trait StructureWall
  extends Structure[STRUCTURE_WALL]
     with AnyStructure {
  /**
    * The amount of game ticks when the wall will disappear (only for automatically placed border walls at the start of the game).
    */
  var ticksToLive: Double
}

@JSGlobal("StructureWall")
@js.native
object StructureWall extends TopLevel[StructureWallConstructor]

