package typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableMod

import typings.reactDashNative.reactDashNativeMod.ImageStyle
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-animatable", "registerAnimation")
@js.native
object registerAnimation extends js.Object {
  def apply(name: String, animation: CustomAnimation[TextStyle with ViewStyle with ImageStyle]): Unit = js.native
}

