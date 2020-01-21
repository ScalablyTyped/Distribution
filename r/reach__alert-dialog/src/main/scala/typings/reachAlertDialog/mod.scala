package typings.reachAlertDialog

import typings.reachDialog.mod.DialogContentProps
import typings.reachDialog.mod.DialogProps
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLProps
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@reach/alert-dialog", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val AlertDialog: FunctionComponent[AlertDialogProps] = js.native
  val AlertDialogContent: FC[AlertDialogContentProps] = js.native
  val AlertDialogDescription: FC[HTMLProps[HTMLDivElement]] = js.native
  val AlertDialogLabel: FC[HTMLProps[HTMLDivElement]] = js.native
  val AlertDialogOverlay: FC[AlertDialogProps] = js.native
  type AlertDialogContentProps = AnonChildrenReactNode with DialogContentProps
  type AlertDialogProps = AnonChildren with DialogProps
}

