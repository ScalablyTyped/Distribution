package typings.storybookReactNative.onDeviceUIMod

import typings.react.mod.Component
import typings.reactNative.mod.Animated.Value
import typings.storybookReactNative.absolutePositionedKeyboardAwareViewMod.PreviewDimens
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnDeviceUI
  extends Component[OnDeviceUIProps, OnDeviceUIState, js.Any] {
  var animatedValue: Value = js.native
  var channel: typings.storybookChannels.mod.default = js.native
  def handleOpenPreview(): Unit = js.native
  def handleToggleTab(newTabOpen: Double): Unit = js.native
  def onLayout(hasPreviewWidthPreviewHeight: PreviewDimens): Unit = js.native
}

