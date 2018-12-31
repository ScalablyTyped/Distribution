package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Blocks movement of hostile creeps, and defends your creeps and structures on
  * the same tile. Can be used as a controllable gate.
  */
trait StructureRampart extends OwnedStructure[STRUCTURE_RAMPART] {
  /**
    * If false (default), only your creeps can step on the same square. If true, any hostile creeps can pass through.
    */
  var isPublic: scala.Boolean
  /**
    * The amount of game ticks when this rampart will lose some hit points.
    */
  var ticksToDecay: scala.Double
  /**
    * Make this rampart public to allow other players' creeps to pass through.
    * @param isPublic Whether this rampart should be public or non-public
    */
  def setPublic(isPublic: scala.Boolean): js.UndefOr[scala.Nothing]
}

