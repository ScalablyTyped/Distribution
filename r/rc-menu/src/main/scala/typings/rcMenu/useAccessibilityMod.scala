package typings.rcMenu

import typings.rcMenu.interfaceMod.MenuMode
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.RefObject
import typings.std.HTMLElement
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useAccessibilityMod {
  
  @JSImport("rc-menu/es/hooks/useAccessibility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: HTMLElement */](
    mode: MenuMode,
    activeKey: String,
    isRtl: Boolean,
    id: String,
    containerRef: RefObject[HTMLUListElement],
    getKeys: js.Function0[js.Array[String]],
    getKeyPath: js.Function2[/* key */ String, /* includeOverflow */ js.UndefOr[Boolean], js.Array[String]],
    triggerActiveKey: js.Function1[/* key */ String, Unit],
    triggerAccessibilityOpen: js.Function2[/* key */ String, /* open */ js.UndefOr[Boolean], Unit]
  ): KeyboardEventHandler[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(mode.asInstanceOf[js.Any], activeKey.asInstanceOf[js.Any], isRtl.asInstanceOf[js.Any], id.asInstanceOf[js.Any], containerRef.asInstanceOf[js.Any], getKeys.asInstanceOf[js.Any], getKeyPath.asInstanceOf[js.Any], triggerActiveKey.asInstanceOf[js.Any], triggerAccessibilityOpen.asInstanceOf[js.Any])).asInstanceOf[KeyboardEventHandler[T]]
  inline def default[T /* <: HTMLElement */](
    mode: MenuMode,
    activeKey: String,
    isRtl: Boolean,
    id: String,
    containerRef: RefObject[HTMLUListElement],
    getKeys: js.Function0[js.Array[String]],
    getKeyPath: js.Function2[/* key */ String, /* includeOverflow */ js.UndefOr[Boolean], js.Array[String]],
    triggerActiveKey: js.Function1[/* key */ String, Unit],
    triggerAccessibilityOpen: js.Function2[/* key */ String, /* open */ js.UndefOr[Boolean], Unit],
    originOnKeyDown: KeyboardEventHandler[T]
  ): KeyboardEventHandler[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(mode.asInstanceOf[js.Any], activeKey.asInstanceOf[js.Any], isRtl.asInstanceOf[js.Any], id.asInstanceOf[js.Any], containerRef.asInstanceOf[js.Any], getKeys.asInstanceOf[js.Any], getKeyPath.asInstanceOf[js.Any], triggerActiveKey.asInstanceOf[js.Any], triggerAccessibilityOpen.asInstanceOf[js.Any], originOnKeyDown.asInstanceOf[js.Any])).asInstanceOf[KeyboardEventHandler[T]]
}
