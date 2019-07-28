package typings.stormDashReactDashDiagrams.distSrcActionsSelectingActionMod

import typings.stormDashReactDashDiagrams.Anon_Bottom
import typings.stormDashReactDashDiagrams.distSrcActionsBaseActionMod.BaseAction
import typings.stormDashReactDashDiagrams.distSrcModelsDiagramModelMod.DiagramModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/actions/SelectingAction", "SelectingAction")
@js.native
class SelectingAction protected () extends BaseAction {
  def this(mouseX: Double, mouseY: Double) = this()
  var mouseX2: Double = js.native
  var mouseY2: Double = js.native
  def containsElement(x: Double, y: Double, diagramModel: DiagramModel): Boolean = js.native
  def getBoxDimensions(): Anon_Bottom = js.native
}

