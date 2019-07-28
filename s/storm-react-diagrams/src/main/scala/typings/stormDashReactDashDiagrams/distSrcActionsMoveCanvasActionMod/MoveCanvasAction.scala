package typings.stormDashReactDashDiagrams.distSrcActionsMoveCanvasActionMod

import typings.stormDashReactDashDiagrams.distSrcActionsBaseActionMod.BaseAction
import typings.stormDashReactDashDiagrams.distSrcModelsDiagramModelMod.DiagramModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/actions/MoveCanvasAction", "MoveCanvasAction")
@js.native
class MoveCanvasAction protected () extends BaseAction {
  def this(mouseX: Double, mouseY: Double, diagramModel: DiagramModel) = this()
  var initialOffsetX: Double = js.native
  var initialOffsetY: Double = js.native
}

