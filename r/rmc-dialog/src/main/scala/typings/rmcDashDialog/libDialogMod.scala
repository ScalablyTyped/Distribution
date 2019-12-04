package typings.rmcDashDialog

import typings.react.reactMod.Component
import typings.react.reactMod._Global_.JSX.Element
import typings.rmcDashDialog.libDialogMod.Dialog
import typings.rmcDashDialog.libIDialogPropTypesMod.IDialogPropTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-dialog/lib/Dialog", JSImport.Namespace)
@js.native
object libDialogMod extends js.Object {
  @js.native
  trait Dialog
    extends Component[IDialogPropTypes, js.Any, js.Any] {
    var bodyRef: js.Any = js.native
    var dialogRef: js.Any = js.native
    var footerRef: js.Any = js.native
    var headerRef: js.Any = js.native
    var wrapRef: js.Any = js.native
    def close(e: js.Any): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDialog(): Unit = js.native
    def getDialogElement(): Element = js.native
    def getMaskElement(): js.Any = js.native
    def getMaskStyle(): js.Any = js.native
    def getMaskTransitionName(): js.UndefOr[String] = js.native
    def getTransitionName(): js.UndefOr[String] = js.native
    def getWrapStyle(): js.Any = js.native
    def getZIndexStyle(): js.Any = js.native
    def onAnimateAppear(): Unit = js.native
    def onAnimateLeave(): Unit = js.native
    def onMaskClick(e: js.Any): Unit = js.native
  }
  
  @js.native
  class default () extends Dialog
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Anon_AfterClose = js.native
  }
  
}

