package typings.reactNativeNavigation.touchablePreviewMod

import typings.react.mod.Component
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNativeNavigation.Anon0
import typings.reactNativeNavigation.AnonChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/adapters/TouchablePreview", "TouchablePreview")
@js.native
class TouchablePreview ()
  extends Component[Props, js.Object, js.Any] {
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
  var defaultProps: Anon0 = js.native
  var peeking: Boolean = js.native
  var propTypes: AnonChildren = js.native
}

