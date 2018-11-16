package typings
package stormDashReactDashDiagramsLib.distSrcActionsMoveItemsActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/actions/MoveItemsAction", "MoveItemsAction")
@js.native
class MoveItemsAction protected ()
  extends stormDashReactDashDiagramsLib.distSrcActionsBaseActionMod.BaseAction {
  def this(mouseX: scala.Double, mouseY: scala.Double, diagramEngine: stormDashReactDashDiagramsLib.distSrcDiagramEngineMod.DiagramEngine) = this()
  var moved: scala.Boolean = js.native
  var selectionModels: js.Array[stormDashReactDashDiagramsLib.distSrcModelsSelectionModelMod.SelectionModel] = js.native
}

