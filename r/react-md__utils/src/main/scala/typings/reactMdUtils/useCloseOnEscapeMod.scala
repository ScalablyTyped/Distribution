package typings.reactMdUtils

import typings.react.mod.KeyboardEventHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/utils/types/wia-aria/useCloseOnEscape", JSImport.Namespace)
@js.native
object useCloseOnEscapeMod extends js.Object {
  def default[E /* <: HTMLElement */](onRequestClose: js.Function0[Unit], disabled: Boolean): js.UndefOr[KeyboardEventHandler[E]] = js.native
  def default[E /* <: HTMLElement */](onRequestClose: js.Function0[Unit], disabled: Boolean, onKeyDown: KeyboardEventHandler[E]): js.UndefOr[KeyboardEventHandler[E]] = js.native
}

