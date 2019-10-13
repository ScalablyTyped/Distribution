package typings.atStorybookReactDashNative.distPreviewComponentsOnDeviceUIMod

import typings.atStorybookReactDashNative.distPreviewComponentsOnDeviceUIAbsoluteDashPositionedDashKeyboardDashAwareDashViewMod.PreviewDimens
import typings.react.reactMod.Component
import typings.reactDashNative.reactDashNativeMod.Animated.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnDeviceUI
  extends Component[OnDeviceUIProps, OnDeviceUIState, js.Any] {
  var animatedValue: Value = js.native
  var channel: typings.atStorybookChannels.atStorybookChannelsMod.default = js.native
  def handleOpenPreview(): Unit = js.native
  def handleToggleTab(newTabOpen: Double): Unit = js.native
  def onLayout(hasPreviewWidthPreviewHeight: PreviewDimens): Unit = js.native
}

