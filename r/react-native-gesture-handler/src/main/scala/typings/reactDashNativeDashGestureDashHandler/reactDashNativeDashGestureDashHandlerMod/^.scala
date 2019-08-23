package typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod

import typings.react.reactMod.ComponentType
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-gesture-handler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createNativeWrapper(Component: ComponentType[_], config: NativeViewGestureHandlerProperties): ComponentType[_] = js.native
  def gestureHandlerRootHOC(Component: ComponentType[_]): ComponentType[_] = js.native
  def gestureHandlerRootHOC(Component: ComponentType[_], containerStyles: StyleProp[ViewStyle]): ComponentType[_] = js.native
}

