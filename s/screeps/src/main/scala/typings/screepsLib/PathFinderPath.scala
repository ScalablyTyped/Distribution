package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * An object containing:
 * path - An array of RoomPosition objects.
 * ops - Total number of operations performed before this path was calculated.
 * cost - The total cost of the path as derived from `plainCost`, `swampCost` and any given CostMatrix instances.
 * incomplete - If the pathfinder fails to find a complete path, this will be true.
 *   Note that `path` will still be populated with a partial path which represents the closest path it could find given the search parameters.
 */

trait PathFinderPath extends js.Object {
  /**
       * The total cost of the path as derived from `plainCost`, `swampCost` and any given CostMatrix instances.
       */
  var cost: scala.Double
  /**
       * If the pathfinder fails to find a complete path, this will be true.
       *
       * Note that `path` will still be populated with a partial path which represents the closest path it could find given the search parameters.
       */
  var incomplete: scala.Boolean
  /**
       * Total number of operations performed before this path was calculated.
       */
  var ops: scala.Double
  /**
       * An array of RoomPosition objects.
       */
  var path: js.Array[RoomPosition]
}

