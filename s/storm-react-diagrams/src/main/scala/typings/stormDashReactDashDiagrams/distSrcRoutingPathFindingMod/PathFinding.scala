package typings.stormDashReactDashDiagrams.distSrcRoutingPathFindingMod

import typings.stormDashReactDashDiagrams.Anon_End
import typings.stormDashReactDashDiagrams.Anon_X
import typings.stormDashReactDashDiagrams.distSrcMainMod.DiagramEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathFinding extends js.Object {
  var diagramEngine: DiagramEngine
  var instance: js.Any
  /**
    * Taking as argument a fully unblocked walking matrix, this method
    * finds a direct path from point A to B.
    */
  def calculateDirectPath(from: Anon_X, to: Anon_X): js.Array[js.Array[Double]]
  /**
    * Puts everything together: merges the paths from/to the centre of the ports,
    * with the path calculated around other elements.
    */
  def calculateDynamicPath(
    routingMatrix: js.Array[js.Array[Double]],
    start: Anon_X,
    end: Anon_X,
    pathToStart: js.Array[js.Array[Double]],
    pathToEnd: js.Array[js.Array[Double]]
  ): js.Any
  /**
    * Using @link{#calculateDirectPath}'s result as input, we here
    * determine the first walkable point found in the matrix that includes
    * blocked paths.
    */
  def calculateLinkStartEndCoords(matrix: js.Array[js.Array[Double]], path: js.Array[js.Array[Double]]): Anon_End
}

object PathFinding {
  @scala.inline
  def apply(
    calculateDirectPath: (Anon_X, Anon_X) => js.Array[js.Array[Double]],
    calculateDynamicPath: (js.Array[js.Array[Double]], Anon_X, Anon_X, js.Array[js.Array[Double]], js.Array[js.Array[Double]]) => js.Any,
    calculateLinkStartEndCoords: (js.Array[js.Array[Double]], js.Array[js.Array[Double]]) => Anon_End,
    diagramEngine: DiagramEngine,
    instance: js.Any
  ): PathFinding = {
    val __obj = js.Dynamic.literal(calculateDirectPath = js.Any.fromFunction2(calculateDirectPath), calculateDynamicPath = js.Any.fromFunction5(calculateDynamicPath), calculateLinkStartEndCoords = js.Any.fromFunction2(calculateLinkStartEndCoords), diagramEngine = diagramEngine, instance = instance)
  
    __obj.asInstanceOf[PathFinding]
  }
}

