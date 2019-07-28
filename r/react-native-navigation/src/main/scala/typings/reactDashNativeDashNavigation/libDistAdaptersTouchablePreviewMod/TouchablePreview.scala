package typings.reactDashNativeDashNavigation.libDistAdaptersTouchablePreviewMod

import typings.react.reactMod.PureComponent
import typings.reactDashNative.reactDashNativeMod.GestureResponderEvent
import typings.reactDashNativeDashNavigation.Anon_Args
import typings.reactDashNativeDashNavigation.Anon_TouchableComponentTouchableWithoutFeedback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/adapters/TouchablePreview", "TouchablePreview")
@js.native
class TouchablePreview ()
  extends PureComponent[Props, js.Object, js.Any] {
  var onRef: js.Any = js.native
  var timeout: js.Any = js.native
  var touchStartedAt: js.Any = js.native
  def onPress(): Unit = js.native
  def onPressIn(): Unit | Null = js.native
  def onTouchEnd(): Unit = js.native
  def onTouchMove(event: GestureResponderEventWithForce): Unit = js.native
  def onTouchStart(event: GestureResponderEvent): Unit = js.native
}

/* static members */
@JSImport("react-native-navigation/lib/dist/adapters/TouchablePreview", "TouchablePreview")
@js.native
object TouchablePreview extends js.Object {
  var defaultProps: Anon_TouchableComponentTouchableWithoutFeedback = js.native
  var peeking: Boolean = js.native
  var propTypes: Anon_Args = js.native
}

