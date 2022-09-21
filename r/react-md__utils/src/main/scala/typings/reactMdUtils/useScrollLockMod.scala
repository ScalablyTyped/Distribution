package typings.reactMdUtils

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useScrollLockMod {
  
  @JSImport("@react-md/utils/types/wia-aria/useScrollLock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils/types/wia-aria/useScrollLock", "DATA_RMD_NOSCROLL")
  @js.native
  val DATA_RMD_NOSCROLL: /* "data-rmd-noscroll" */ String = js.native
  
  inline def disableScrollLock(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableScrollLock")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def enableScrollLock(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableScrollLock")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useScrollLock(enabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollLock")(enabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useScrollLock(enabled: Boolean, selectorOrElement: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useScrollLock")(enabled.asInstanceOf[js.Any], selectorOrElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useScrollLock(enabled: Boolean, selectorOrElement: js.Function0[HTMLElement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useScrollLock")(enabled.asInstanceOf[js.Any], selectorOrElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useScrollLock(enabled: Boolean, selectorOrElement: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useScrollLock")(enabled.asInstanceOf[js.Any], selectorOrElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
