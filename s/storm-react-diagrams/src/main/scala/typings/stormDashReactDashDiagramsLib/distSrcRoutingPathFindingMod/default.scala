package typings
package stormDashReactDashDiagramsLib.distSrcRoutingPathFindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/routing/PathFinding", JSImport.Default)
@js.native
class default protected () extends PathFinding {
  def this(diagramEngine: stormDashReactDashDiagramsLib.distSrcMainMod.DiagramEngine) = this()
  /* CompleteClass */
  override var diagramEngine: stormDashReactDashDiagramsLib.distSrcMainMod.DiagramEngine = js.native
  /* CompleteClass */
  override var instance: js.Any = js.native
  /**
    * Taking as argument a fully unblocked walking matrix, this method
    * finds a direct path from point A to B.
    */
  /* CompleteClass */
  override def calculateDirectPath(from: stormDashReactDashDiagramsLib.Anon_X, to: stormDashReactDashDiagramsLib.Anon_X): js.Array[js.Array[scala.Double]] = js.native
  /**
    * Puts everything together: merges the paths from/to the centre of the ports,
    * with the path calculated around other elements.
    */
  /* CompleteClass */
  override def calculateDynamicPath(
    routingMatrix: js.Array[js.Array[scala.Double]],
    start: stormDashReactDashDiagramsLib.Anon_X,
    end: stormDashReactDashDiagramsLib.Anon_X,
    pathToStart: js.Array[js.Array[scala.Double]],
    pathToEnd: js.Array[js.Array[scala.Double]]
  ): js.Any = js.native
  /**
    * Using @link{#calculateDirectPath}'s result as input, we here
    * determine the first walkable point found in the matrix that includes
    * blocked paths.
    */
  /* CompleteClass */
  override def calculateLinkStartEndCoords(matrix: js.Array[js.Array[scala.Double]], path: js.Array[js.Array[scala.Double]]): stormDashReactDashDiagramsLib.Anon_End = js.native
}

