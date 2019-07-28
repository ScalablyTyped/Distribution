package typings.stormDashReactDashDiagrams.distSrcActionsMoveItemsActionMod

import typings.stormDashReactDashDiagrams.distSrcActionsBaseActionMod.BaseAction
import typings.stormDashReactDashDiagrams.distSrcDiagramEngineMod.DiagramEngine
import typings.stormDashReactDashDiagrams.distSrcModelsSelectionModelMod.SelectionModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/actions/MoveItemsAction", "MoveItemsAction")
@js.native
class MoveItemsAction protected () extends BaseAction {
  def this(mouseX: Double, mouseY: Double, diagramEngine: DiagramEngine) = this()
  var moved: Boolean = js.native
  var selectionModels: js.Array[SelectionModel] = js.native
}

