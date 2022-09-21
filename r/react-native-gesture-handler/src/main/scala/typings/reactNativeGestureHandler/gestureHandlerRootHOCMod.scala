package typings.reactNativeGestureHandler

import typings.react.mod.ComponentType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gestureHandlerRootHOCMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/gestureHandlerRootHOC", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P](Component: ComponentType[P]): ComponentType[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[P]]
  inline def default[P](Component: ComponentType[P], containerStyles: StyleProp[ViewStyle]): ComponentType[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any], containerStyles.asInstanceOf[js.Any])).asInstanceOf[ComponentType[P]]
}
