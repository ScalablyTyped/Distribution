package typings.atReachDialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atReachDialogMod {
  import typings.atReachDialog.Anon_Children
  import typings.atReachDialog.Anon_ChildrenReactNode
  import typings.atReachDialog.Anon_InitialFocusRef
  import typings.react.reactMod.HTMLProps
  import typings.std.HTMLDivElement

  type DialogContentProps = Anon_ChildrenReactNode with HTMLProps[HTMLDivElement]
  type DialogOverlayProps = Anon_InitialFocusRef with DialogProps
  type DialogProps = Anon_Children with HTMLProps[HTMLDivElement]
}
