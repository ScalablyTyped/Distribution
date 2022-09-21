package typings.reactNativeTabView

import typings.react.mod.ReactElement
import typings.reactNativeTabView.pagerViewAdapterMod.Props
import typings.reactNativeTabView.typesMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagerIosMod {
  
  @JSImport("react-native-tab-view/lib/typescript/Pager.ios", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: Route */](
    hasKeyboardDismissModeSwipeEnabledNavigationStateOnIndexChangeOnSwipeStartOnSwipeEndChildrenStyleRest: Props[T]
  ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasKeyboardDismissModeSwipeEnabledNavigationStateOnIndexChangeOnSwipeStartOnSwipeEndChildrenStyleRest.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
}
