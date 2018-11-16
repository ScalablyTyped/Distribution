package typings
package stormDashReactDashDiagramsLib.distSrcActionsSelectingActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/actions/SelectingAction", "SelectingAction")
@js.native
class SelectingAction protected ()
  extends stormDashReactDashDiagramsLib.distSrcActionsBaseActionMod.BaseAction {
  def this(mouseX: scala.Double, mouseY: scala.Double) = this()
  var mouseX2: scala.Double = js.native
  var mouseY2: scala.Double = js.native
  def containsElement(
    x: scala.Double,
    y: scala.Double,
    diagramModel: stormDashReactDashDiagramsLib.distSrcModelsDiagramModelMod.DiagramModel
  ): scala.Boolean = js.native
  def getBoxDimensions(): stormDashReactDashDiagramsLib.Anon_Bottom = js.native
}

