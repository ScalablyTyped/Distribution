package typings
package stormDashReactDashDiagramsLib.distSrcRoutingPathFindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathFinding extends js.Object {
  var diagramEngine: stormDashReactDashDiagramsLib.distSrcMainMod.DiagramEngine
  var instance: js.Any
  /**
    * Taking as argument a fully unblocked walking matrix, this method
    * finds a direct path from point A to B.
    */
  def calculateDirectPath(from: stormDashReactDashDiagramsLib.Anon_Y, to: stormDashReactDashDiagramsLib.Anon_Y): js.Array[js.Array[scala.Double]]
  /**
    * Puts everything together: merges the paths from/to the centre of the ports,
    * with the path calculated around other elements.
    */
  def calculateDynamicPath(
    routingMatrix: js.Array[js.Array[scala.Double]],
    start: stormDashReactDashDiagramsLib.Anon_Y,
    end: stormDashReactDashDiagramsLib.Anon_Y,
    pathToStart: js.Array[js.Array[scala.Double]],
    pathToEnd: js.Array[js.Array[scala.Double]]
  ): js.Any
  /**
    * Using @link{#calculateDirectPath}'s result as input, we here
    * determine the first walkable point found in the matrix that includes
    * blocked paths.
    */
  def calculateLinkStartEndCoords(matrix: js.Array[js.Array[scala.Double]], path: js.Array[js.Array[scala.Double]]): stormDashReactDashDiagramsLib.Anon_PathToStart
}

