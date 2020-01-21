package typings.reachDialog

import typings.react.mod.FC
import typings.react.mod.HTMLProps
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@reach/dialog", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val Dialog: FC[DialogProps] = js.native
  val DialogContent: FC[DialogContentProps] = js.native
  val DialogOverlay: FC[DialogOverlayProps] = js.native
  type DialogContentProps = AnonChildrenReactNode with HTMLProps[HTMLDivElement]
  type DialogOverlayProps = AnonInitialFocusRef with DialogProps
  type DialogProps = AnonChildren with HTMLProps[HTMLDivElement]
}

