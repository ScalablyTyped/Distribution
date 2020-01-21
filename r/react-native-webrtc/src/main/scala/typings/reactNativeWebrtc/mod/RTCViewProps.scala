package typings.reactNativeWebrtc.mod

import typings.reactNative.mod.ViewStyle
import typings.reactNativeWebrtc.reactNativeWebrtcStrings.contain
import typings.reactNativeWebrtc.reactNativeWebrtcStrings.cover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCViewProps extends js.Object {
  var mirror: js.UndefOr[Boolean] = js.undefined
  var objectFit: js.UndefOr[contain | cover] = js.undefined
  var streamURL: String
  var style: js.UndefOr[ViewStyle] = js.undefined
  var zOrder: js.UndefOr[Double] = js.undefined
}

object RTCViewProps {
  @scala.inline
  def apply(
    streamURL: String,
    mirror: js.UndefOr[Boolean] = js.undefined,
    objectFit: contain | cover = null,
    style: ViewStyle = null,
    zOrder: Int | Double = null
  ): RTCViewProps = {
    val __obj = js.Dynamic.literal(streamURL = streamURL.asInstanceOf[js.Any])
    if (!js.isUndefined(mirror)) __obj.updateDynamic("mirror")(mirror.asInstanceOf[js.Any])
    if (objectFit != null) __obj.updateDynamic("objectFit")(objectFit.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (zOrder != null) __obj.updateDynamic("zOrder")(zOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCViewProps]
  }
}

