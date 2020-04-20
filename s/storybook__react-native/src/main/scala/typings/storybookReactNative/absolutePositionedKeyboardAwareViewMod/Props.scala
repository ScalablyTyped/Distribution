package typings.storybookReactNative.absolutePositionedKeyboardAwareViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {onLayout (dimens : @storybook/react-native.@storybook/react-native/dist/preview/components/OnDeviceUI/absolute-positioned-keyboard-aware-view.PreviewDimens): void} & @storybook/react-native.@storybook/react-native/dist/preview/components/OnDeviceUI/absolute-positioned-keyboard-aware-view.PreviewDimens */
trait Props extends js.Object {
  var previewHeight: Double
  var previewWidth: Double
  def onLayout(dimens: PreviewDimens): Unit
}

object Props {
  @scala.inline
  def apply(onLayout: PreviewDimens => Unit, previewHeight: Double, previewWidth: Double): Props = {
    val __obj = js.Dynamic.literal(onLayout = js.Any.fromFunction1(onLayout), previewHeight = previewHeight.asInstanceOf[js.Any], previewWidth = previewWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

