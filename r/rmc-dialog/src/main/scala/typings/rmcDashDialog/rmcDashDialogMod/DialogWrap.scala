package typings.rmcDashDialog.rmcDashDialogMod

import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import typings.rmcDashDialog.Anon_Visible
import typings.rmcDashDialog.libIDialogPropTypesMod.IDialogPropTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogWrap
  extends Component[IDialogPropTypes, js.Any, js.Any] {
  var _component: js.Any = js.native
  var container: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MDialogWrap(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDialogWrap(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MDialogWrap(): Unit = js.native
  def getComponent(visible: js.Any): Element = js.native
  def getContainer(): js.Any = js.native
  def removeContainer(): Unit = js.native
  def renderDialog(visible: js.Any): Unit = js.native
  def saveRef(node: js.Any): Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MDialogWrap(hasVisible: Anon_Visible): Boolean = js.native
}

