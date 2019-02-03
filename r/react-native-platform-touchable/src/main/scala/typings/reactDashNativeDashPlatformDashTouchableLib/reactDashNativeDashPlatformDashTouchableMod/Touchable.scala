package typings
package reactDashNativeDashPlatformDashTouchableLib.reactDashNativeDashPlatformDashTouchableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-platform-touchable", "Touchable")
@js.native
class Touchable ()
  extends reactLib.reactMod.Component[PlatformTouchableProps, js.Object, js.Any] {
  // TouchableOpacity (default iOS)
  def setOpacityTo(value: scala.Double): scala.Unit = js.native
}

/* static members */
@JSImport("react-native-platform-touchable", "Touchable")
@js.native
object Touchable extends js.Object {
  def Ripple(color: java.lang.String): reactDashNativeLib.reactDashNativeMod.RippleBackgroundPropType = js.native
  def Ripple(color: java.lang.String, borderless: scala.Boolean): reactDashNativeLib.reactDashNativeMod.RippleBackgroundPropType = js.native
  // TouchableNativeFeedback (default Android)
  def SelectableBackground(): reactDashNativeLib.reactDashNativeMod.ThemeAttributeBackgroundPropType = js.native
  def SelectableBackgroundBorderless(): reactDashNativeLib.reactDashNativeMod.ThemeAttributeBackgroundPropType = js.native
  def canUseNativeForeground(): scala.Boolean = js.native
}

