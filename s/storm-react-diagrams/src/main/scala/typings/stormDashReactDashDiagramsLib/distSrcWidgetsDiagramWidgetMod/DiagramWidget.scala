package typings
package stormDashReactDashDiagramsLib.distSrcWidgetsDiagramWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/widgets/DiagramWidget", "DiagramWidget")
@js.native
class DiagramWidget protected ()
  extends stormDashReactDashDiagramsLib.distSrcWidgetsBaseWidgetMod.BaseWidget[DiagramProps, DiagramState] {
  def this(props: DiagramProps) = this()
  @JSName("componentDidMount")
  def componentDidMount_MDiagramWidget(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDiagramWidget(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MDiagramWidget(nextProps: DiagramProps): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MDiagramWidget(): scala.Unit = js.native
  @JSName("componentWillUpdate")
  def componentWillUpdate_MDiagramWidget(nextProps: DiagramProps): scala.Unit = js.native
  def drawSelectionBox(): reactLib.reactMod.Global.JSXNs.Element = js.native
  def fireAction(): scala.Unit = js.native
  /**
    * Gets a model and element under the mouse cursor
    */
  def getMouseElement(event: js.Any): stormDashReactDashDiagramsLib.Anon_Model = js.native
  def onKeyUp(event: js.Any): scala.Unit = js.native
  def onKeyUpPointer(`this`: stdLib.Window, ev: reactLib.KeyboardEvent): scala.Unit = js.native
  def onMouseMove(event: js.Any): scala.Unit = js.native
  def onMouseUp(event: js.Any): scala.Unit = js.native
  def startFiringAction(action: stormDashReactDashDiagramsLib.distSrcActionsBaseActionMod.BaseAction): scala.Unit = js.native
  def stopFiringAction(): scala.Unit = js.native
  def stopFiringAction(shouldSkipEvent: scala.Boolean): scala.Unit = js.native
}

@JSImport("storm-react-diagrams/dist/src/widgets/DiagramWidget", "DiagramWidget")
@js.native
object DiagramWidget extends js.Object {
  var defaultProps: stormDashReactDashDiagramsLib.distSrcWidgetsDiagramWidgetMod.DiagramProps = js.native
}

