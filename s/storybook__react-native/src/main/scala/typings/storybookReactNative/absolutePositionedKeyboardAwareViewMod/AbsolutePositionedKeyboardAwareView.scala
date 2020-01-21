package typings.storybookReactNative.absolutePositionedKeyboardAwareViewMod

import typings.react.mod.Component
import typings.reactNative.mod.EmitterSubscription
import typings.reactNative.mod.KeyboardEvent
import typings.reactNative.mod.LayoutChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbsolutePositionedKeyboardAwareView
  extends Component[Props, js.Object, js.Any] {
  var keyboardDidHideListener: EmitterSubscription = js.native
  var keyboardDidShowListener: EmitterSubscription = js.native
  var keyboardOpen: Boolean = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MAbsolutePositionedKeyboardAwareView(): Unit = js.native
  def keyboardDidHideHandler(): Unit = js.native
  def keyboardDidShowHandler(e: KeyboardEvent): Unit = js.native
  def onLayoutHandler(hasNativeEvent: LayoutChangeEvent): Unit = js.native
  def removeKeyboardOnOrientationChange(): Unit = js.native
}

