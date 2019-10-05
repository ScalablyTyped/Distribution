package typings.atReachDialog

import typings.atReachDialog.atReachDialogMod.DialogContentProps
import typings.atReachDialog.atReachDialogMod.DialogOverlayProps
import typings.atReachDialog.atReachDialogMod.DialogProps
import typings.react.reactMod.FC
import typings.react.reactMod.HTMLProps
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@reach/dialog", JSImport.Namespace)
@js.native
object atReachDialogMod extends js.Object {
  val Dialog: FC[DialogProps] = js.native
  val DialogContent: FC[DialogContentProps] = js.native
  val DialogOverlay: FC[DialogOverlayProps] = js.native
  type DialogContentProps = Anon_ChildrenReactNode with HTMLProps[HTMLDivElement]
  type DialogOverlayProps = Anon_InitialFocusRef with DialogProps
  type DialogProps = Anon_Children with HTMLProps[HTMLDivElement]
}

