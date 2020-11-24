package typings.reactNativePlatformTouchable.mod

import typings.reactNative.mod.RippleBackgroundPropType
import typings.reactNative.mod.ThemeAttributeBackgroundPropType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-platform-touchable", JSImport.Default)
@js.native
class default () extends Touchable
/* static members */
@JSImport("react-native-platform-touchable", JSImport.Default)
@js.native
object default extends js.Object {
  
  def Ripple(color: String): RippleBackgroundPropType = js.native
  def Ripple(color: String, borderless: Boolean): RippleBackgroundPropType = js.native
  
  // TouchableNativeFeedback (default Android)
  def SelectableBackground(): ThemeAttributeBackgroundPropType = js.native
  
  def SelectableBackgroundBorderless(): ThemeAttributeBackgroundPropType = js.native
  
  def canUseNativeForeground(): Boolean = js.native
}
