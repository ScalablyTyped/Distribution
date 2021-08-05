package typings.reactMdUtils

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usePreviousFocusMod {
  
  @JSImport("@react-md/utils/types/wia-aria/usePreviousFocus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def usePreviousFocus(disabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousFocus")(disabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def usePreviousFocus(disabled: Boolean, fallback: Unit, previousElement: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousFocus")(disabled.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], previousElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def usePreviousFocus(disabled: Boolean, fallback: FocusFallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousFocus")(disabled.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def usePreviousFocus(disabled: Boolean, fallback: FocusFallback, previousElement: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousFocus")(disabled.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], previousElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type FocusFallback = js.UndefOr[String | HTMLElement | (js.Function0[HTMLElement | Null]) | Null]
}
