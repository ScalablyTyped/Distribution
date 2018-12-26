package typings
package rmcDashDialogLib.rmcDashDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogWrap
  extends reactLib.reactMod.Component[rmcDashDialogLib.libIDialogPropTypesMod.IDialogPropTypes, js.Any, js.Any] {
  var _component: js.Any = js.native
  var container: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MDialogWrap(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDialogWrap(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MDialogWrap(): scala.Unit = js.native
  def getComponent(visible: js.Any): reactLib.reactMod.Global.JSXNs.Element = js.native
  def getContainer(): js.Any = js.native
  def removeContainer(): scala.Unit = js.native
  def renderDialog(visible: js.Any): scala.Unit = js.native
  def saveRef(node: js.Any): scala.Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MDialogWrap(hasVisible: rmcDashDialogLib.Anon_Visible): scala.Boolean = js.native
}

