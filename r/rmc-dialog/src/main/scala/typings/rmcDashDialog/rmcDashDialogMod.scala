package typings.rmcDashDialog

import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSX.Element
import typings.rmcDashDialog.libIDialogPropTypesMod.IDialogPropTypes
import typings.rmcDashDialog.rmcDashDialogMod.DialogWrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-dialog", JSImport.Namespace)
@js.native
object rmcDashDialogMod extends js.Object {
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
  
  @js.native
  class default () extends DialogWrap
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Anon_OnClose = js.native
  }
  
}

