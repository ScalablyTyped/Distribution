package typings
package reactDashWebcamLib.reactDashWebcamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebcamProps extends js.Object {
  var audio: js.UndefOr[scala.Boolean] = js.undefined
  var audioSource: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var muted: js.UndefOr[scala.Boolean] = js.undefined
  var onUserMedia: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var screenshotFormat: js.UndefOr[
    reactDashWebcamLib.reactDashWebcamLibStrings.`image/jpeg` | reactDashWebcamLib.reactDashWebcamLibStrings.`image/png` | reactDashWebcamLib.reactDashWebcamLibStrings.`image/webp`
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var videoSource: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object WebcamProps {
  @scala.inline
  def apply(
    audio: js.UndefOr[scala.Boolean] = js.undefined,
    audioSource: java.lang.String = null,
    className: java.lang.String = null,
    height: scala.Double | java.lang.String = null,
    muted: js.UndefOr[scala.Boolean] = js.undefined,
    onUserMedia: () => scala.Unit = null,
    screenshotFormat: reactDashWebcamLib.reactDashWebcamLibStrings.`image/jpeg` | reactDashWebcamLib.reactDashWebcamLibStrings.`image/png` | reactDashWebcamLib.reactDashWebcamLibStrings.`image/webp` = null,
    style: reactLib.reactMod.CSSProperties = null,
    videoSource: java.lang.String = null,
    width: scala.Double | java.lang.String = null
  ): WebcamProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audio)) __obj.updateDynamic("audio")(audio)
    if (audioSource != null) __obj.updateDynamic("audioSource")(audioSource)
    if (className != null) __obj.updateDynamic("className")(className)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted)
    if (onUserMedia != null) __obj.updateDynamic("onUserMedia")(js.Any.fromFunction0(onUserMedia))
    if (screenshotFormat != null) __obj.updateDynamic("screenshotFormat")(screenshotFormat.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (videoSource != null) __obj.updateDynamic("videoSource")(videoSource)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebcamProps]
  }
}

