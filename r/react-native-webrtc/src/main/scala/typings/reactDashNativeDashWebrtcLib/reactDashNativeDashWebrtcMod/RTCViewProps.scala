package typings
package reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCViewProps extends js.Object {
  var mirror: js.UndefOr[scala.Boolean] = js.undefined
  var objectFit: js.UndefOr[
    reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcLibStrings.contain | reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcLibStrings.cover
  ] = js.undefined
  var streamURL: java.lang.String
  var style: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  var zOrder: js.UndefOr[scala.Double] = js.undefined
}

object RTCViewProps {
  @scala.inline
  def apply(
    streamURL: java.lang.String,
    mirror: js.UndefOr[scala.Boolean] = js.undefined,
    objectFit: reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcLibStrings.contain | reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcLibStrings.cover = null,
    style: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    zOrder: scala.Int | scala.Double = null
  ): RTCViewProps = {
    val __obj = js.Dynamic.literal(streamURL = streamURL)
    if (!js.isUndefined(mirror)) __obj.updateDynamic("mirror")(mirror)
    if (objectFit != null) __obj.updateDynamic("objectFit")(objectFit.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (zOrder != null) __obj.updateDynamic("zOrder")(zOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCViewProps]
  }
}

