package typings.atReachAlertDashDialog

import typings.atReachAlertDashDialog.atReachAlertDashDialogMod.AlertDialogContentProps
import typings.atReachAlertDashDialog.atReachAlertDashDialogMod.AlertDialogProps
import typings.atReachDialog.atReachDialogMod.DialogContentProps
import typings.atReachDialog.atReachDialogMod.DialogProps
import typings.react.reactMod.FC
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.HTMLProps
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@reach/alert-dialog", JSImport.Namespace)
@js.native
object atReachAlertDashDialogMod extends js.Object {
  val AlertDialog: FunctionComponent[AlertDialogProps] = js.native
  val AlertDialogContent: FC[AlertDialogContentProps] = js.native
  val AlertDialogDescription: FC[HTMLProps[HTMLDivElement]] = js.native
  val AlertDialogLabel: FC[HTMLProps[HTMLDivElement]] = js.native
  val AlertDialogOverlay: FC[AlertDialogProps] = js.native
  type AlertDialogContentProps = Anon_ChildrenReactNode with DialogContentProps
  type AlertDialogProps = Anon_Children with DialogProps
}

