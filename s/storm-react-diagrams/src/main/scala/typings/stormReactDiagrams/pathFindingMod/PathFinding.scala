package typings.stormReactDiagrams.pathFindingMod

import typings.stormReactDiagrams.AnonEnd
import typings.stormReactDiagrams.AnonX
import typings.stormReactDiagrams.mod.DiagramEngine
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
  def calculateDirectPath(from: AnonX, to: AnonX): js.Array[js.Array[Double]]
  /**
    * Puts everything together: merges the paths from/to the centre of the ports,
    * with the path calculated around other elements.
    */
  def calculateDynamicPath(
    routingMatrix: js.Array[js.Array[Double]],
    start: AnonX,
    end: AnonX,
    pathToStart: js.Array[js.Array[Double]],
    pathToEnd: js.Array[js.Array[Double]]
  ): js.Any
  /**
    * Using @link{#calculateDirectPath}'s result as input, we here
    * determine the first walkable point found in the matrix that includes
    * blocked paths.
    */
  def calculateLinkStartEndCoords(matrix: js.Array[js.Array[Double]], path: js.Array[js.Array[Double]]): AnonEnd
}

object PathFinding {
  @scala.inline
  def apply(
    calculateDirectPath: (AnonX, AnonX) => js.Array[js.Array[Double]],
    calculateDynamicPath: (js.Array[js.Array[Double]], AnonX, AnonX, js.Array[js.Array[Double]], js.Array[js.Array[Double]]) => js.Any,
    calculateLinkStartEndCoords: (js.Array[js.Array[Double]], js.Array[js.Array[Double]]) => AnonEnd,
    diagramEngine: DiagramEngine,
    instance: js.Any
  ): PathFinding = {
    val __obj = js.Dynamic.literal(calculateDirectPath = js.Any.fromFunction2(calculateDirectPath), calculateDynamicPath = js.Any.fromFunction5(calculateDynamicPath), calculateLinkStartEndCoords = js.Any.fromFunction2(calculateLinkStartEndCoords), diagramEngine = diagramEngine.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PathFinding]
  }
}

