package typings.reactNativeGestureHandler.mod

import typings.react.mod.Component
import typings.reactNative.mod.ScrollViewProperties
import typings.reactNativeGestureHandler.anon.Animated
import typings.reactNativeGestureHandler.anon.AnimatedBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-gesture-handler", "ScrollView")
@js.native
class ScrollView ()
  extends Component[NativeViewGestureHandlerProperties with ScrollViewProperties, js.Object, js.Any] {
  
  def scrollTo(): Unit = js.native
  def scrollTo(y: js.UndefOr[scala.Nothing], x: js.UndefOr[scala.Nothing], animated: Boolean): Unit = js.native
  def scrollTo(y: js.UndefOr[scala.Nothing], x: Double): Unit = js.native
  def scrollTo(y: js.UndefOr[scala.Nothing], x: Double, animated: Boolean): Unit = js.native
  def scrollTo(y: Double): Unit = js.native
  def scrollTo(y: Double, x: js.UndefOr[scala.Nothing], animated: Boolean): Unit = js.native
  def scrollTo(y: Double, x: Double): Unit = js.native
  def scrollTo(y: Double, x: Double, animated: Boolean): Unit = js.native
  def scrollTo(y: Animated): Unit = js.native
  def scrollTo(y: Animated, x: js.UndefOr[scala.Nothing], animated: Boolean): Unit = js.native
  def scrollTo(y: Animated, x: Double): Unit = js.native
  def scrollTo(y: Animated, x: Double, animated: Boolean): Unit = js.native
  
  def scrollToEnd(): Unit = js.native
  def scrollToEnd(options: AnimatedBoolean): Unit = js.native
}
