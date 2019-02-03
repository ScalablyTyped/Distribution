package typings
package reactDashNativeDashNavigationLib.libDistAdaptersTouchablePreviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/adapters/TouchablePreview", "TouchablePreview")
@js.native
class TouchablePreview ()
  extends reactLib.reactMod.PureComponent[Props, js.Object, js.Any] {
  var onRef: js.Any = js.native
  var timeout: js.Any = js.native
  var touchStartedAt: js.Any = js.native
  def onPress(): scala.Unit = js.native
  def onPressIn(): scala.Unit | scala.Null = js.native
  def onTouchEnd(): scala.Unit = js.native
  def onTouchMove(event: GestureResponderEventWithForce): scala.Unit = js.native
  def onTouchStart(event: reactDashNativeLib.reactDashNativeMod.GestureResponderEvent): scala.Unit = js.native
}

/* static members */
@JSImport("react-native-navigation/lib/dist/adapters/TouchablePreview", "TouchablePreview")
@js.native
object TouchablePreview extends js.Object {
  var defaultProps: reactDashNativeDashNavigationLib.Anon_TouchableComponentTouchableWithoutFeedback = js.native
  var peeking: scala.Boolean = js.native
  var propTypes: reactDashNativeDashNavigationLib.Anon_Args = js.native
}

