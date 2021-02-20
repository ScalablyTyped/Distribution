package typings.reactMdUtils

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usePreviousFocusMod {
  
  @JSImport("@react-md/utils/types/wia-aria/usePreviousFocus", "usePreviousFocus")
  @js.native
  def usePreviousFocus(disabled: Boolean): Unit = js.native
  @JSImport("@react-md/utils/types/wia-aria/usePreviousFocus", "usePreviousFocus")
  @js.native
  def usePreviousFocus(disabled: Boolean, fallback: js.UndefOr[FocusFallback], previousElement: HTMLElement): Unit = js.native
  @JSImport("@react-md/utils/types/wia-aria/usePreviousFocus", "usePreviousFocus")
  @js.native
  def usePreviousFocus(disabled: Boolean, fallback: FocusFallback): Unit = js.native
  
  type FocusFallback = js.UndefOr[String | HTMLElement | (js.Function0[HTMLElement | Null]) | Null]
}
