package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Blocks movement of all creeps.
  */
trait StructureWall extends Structure[STRUCTURE_WALL] {
  /**
    * The amount of game ticks when the wall will disappear (only for automatically placed border walls at the start of the game).
    */
  var ticksToLive: scala.Double
}

