package typings.stormReactDiagrams.diagramWidgetMod

import typings.react.mod._Global_.JSX.Element
import typings.std.KeyboardEvent
import typings.stormReactDiagrams.AnonElement
import typings.stormReactDiagrams.baseActionMod.BaseAction
import typings.stormReactDiagrams.baseWidgetMod.BaseWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/widgets/DiagramWidget", "DiagramWidget")
@js.native
class DiagramWidget protected () extends BaseWidget[DiagramProps, DiagramState] {
  def this(props: DiagramProps) = this()
  @JSName("componentDidMount")
  def componentDidMount_MDiagramWidget(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDiagramWidget(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MDiagramWidget(nextProps: DiagramProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MDiagramWidget(): Unit = js.native
  @JSName("componentWillUpdate")
  def componentWillUpdate_MDiagramWidget(nextProps: DiagramProps): Unit = js.native
  def drawSelectionBox(): Element = js.native
  def fireAction(): Unit = js.native
  /**
    * Gets a model and element under the mouse cursor
    */
  def getMouseElement(event: js.Any): AnonElement = js.native
  def onKeyUp(event: js.Any): Unit = js.native
  def onKeyUpPointer(ev: KeyboardEvent): Unit = js.native
  def onMouseMove(event: js.Any): Unit = js.native
  def onMouseUp(event: js.Any): Unit = js.native
  def startFiringAction(action: BaseAction): Unit = js.native
  def stopFiringAction(): Unit = js.native
  def stopFiringAction(shouldSkipEvent: Boolean): Unit = js.native
}

/* static members */
@JSImport("storm-react-diagrams/dist/src/widgets/DiagramWidget", "DiagramWidget")
@js.native
object DiagramWidget extends js.Object {
  var defaultProps: DiagramProps = js.native
}

