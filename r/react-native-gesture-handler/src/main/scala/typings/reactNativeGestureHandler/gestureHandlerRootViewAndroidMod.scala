package typings.reactNativeGestureHandler

import typings.react.mod.PropsWithChildren
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gestureHandlerRootViewAndroidMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/GestureHandlerRootView.android", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: GestureHandlerRootViewProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type GestureHandlerRootViewProps = PropsWithChildren[ViewProps]
}
