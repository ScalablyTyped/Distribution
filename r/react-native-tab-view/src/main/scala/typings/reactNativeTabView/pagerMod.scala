package typings.reactNativeTabView

import typings.react.mod.ReactElement
import typings.reactNativeTabView.panResponderAdapterMod.Props
import typings.reactNativeTabView.typesMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagerMod {
  
  @JSImport("react-native-tab-view/lib/typescript/Pager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: Route */](
    hasLayoutKeyboardDismissModeSwipeEnabledNavigationStateOnIndexChangeOnSwipeStartOnSwipeEndChildrenStyle: Props[T]
  ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasLayoutKeyboardDismissModeSwipeEnabledNavigationStateOnIndexChangeOnSwipeStartOnSwipeEndChildrenStyle.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
}
