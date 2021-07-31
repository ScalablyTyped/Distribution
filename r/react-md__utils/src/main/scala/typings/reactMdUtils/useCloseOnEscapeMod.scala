package typings.reactMdUtils

import typings.react.mod.KeyboardEventHandler
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useCloseOnEscapeMod {
  
  @JSImport("@react-md/utils/types/wia-aria/useCloseOnEscape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useCloseOnEscape[E /* <: HTMLElement */](onRequestClose: js.Function0[Unit], disabled: Boolean): js.UndefOr[KeyboardEventHandler[E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCloseOnEscape")(onRequestClose.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[KeyboardEventHandler[E]]]
  @scala.inline
  def useCloseOnEscape[E /* <: HTMLElement */](onRequestClose: js.Function0[Unit], disabled: Boolean, onKeyDown: KeyboardEventHandler[E]): js.UndefOr[KeyboardEventHandler[E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCloseOnEscape")(onRequestClose.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], onKeyDown.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[KeyboardEventHandler[E]]]
}
