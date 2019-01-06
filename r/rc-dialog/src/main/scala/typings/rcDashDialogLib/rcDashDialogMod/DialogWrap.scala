package typings
package rcDashDialogLib.rcDashDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogWrap
  extends reactLib.reactMod.Component[rcDashDialogLib.libIDialogPropTypesMod.IDialogPropTypes, js.Any, js.Any] {
  var _component: reactLib.reactMod.ReactNs.ReactElement[_] = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MDialogWrap(): scala.Unit = js.native
  def getComponent(): reactLib.reactMod.Global.JSXNs.Element = js.native
  def getComponent(extra: js.Object): reactLib.reactMod.Global.JSXNs.Element = js.native
  def getContainer(): reactLib.HTMLDivElement = js.native
  def removeContainer(): scala.Unit = js.native
  def renderComponent(props: js.Any): scala.Unit = js.native
  def saveDialog(node: js.Any): scala.Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MDialogWrap(hasVisibleForceRender: rcDashDialogLib.Anon_ForceRender): scala.Boolean = js.native
}

