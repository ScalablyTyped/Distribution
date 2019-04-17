package typings
package reactDashWebcamLib.reactDashWebcamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebcamProps extends js.Object {
  var audio: js.UndefOr[scala.Boolean] = js.undefined
  var audioConstraints: js.UndefOr[scala.Boolean | stdLib.MediaTrackConstraints] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var imageSmoothing: js.UndefOr[scala.Boolean] = js.undefined
  var minScreenshotHeight: js.UndefOr[scala.Double] = js.undefined
  var minScreenshotWidth: js.UndefOr[scala.Double] = js.undefined
  var onUserMedia: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onUserMediaError: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var screenshotFormat: js.UndefOr[
    reactDashWebcamLib.reactDashWebcamLibStrings.`image/jpeg` | reactDashWebcamLib.reactDashWebcamLibStrings.`image/png` | reactDashWebcamLib.reactDashWebcamLibStrings.`image/webp`
  ] = js.undefined
  var screenshotQuality: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var videoConstraints: js.UndefOr[scala.Boolean | stdLib.MediaTrackConstraints] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object WebcamProps {
  @scala.inline
  def apply(
    audio: js.UndefOr[scala.Boolean] = js.undefined,
    audioConstraints: scala.Boolean | stdLib.MediaTrackConstraints = null,
    className: java.lang.String = null,
    height: scala.Double | java.lang.String = null,
    imageSmoothing: js.UndefOr[scala.Boolean] = js.undefined,
    minScreenshotHeight: scala.Int | scala.Double = null,
    minScreenshotWidth: scala.Int | scala.Double = null,
    onUserMedia: () => scala.Unit = null,
    onUserMediaError: () => scala.Unit = null,
    screenshotFormat: reactDashWebcamLib.reactDashWebcamLibStrings.`image/jpeg` | reactDashWebcamLib.reactDashWebcamLibStrings.`image/png` | reactDashWebcamLib.reactDashWebcamLibStrings.`image/webp` = null,
    screenshotQuality: scala.Int | scala.Double = null,
    style: reactLib.reactMod.CSSProperties = null,
    videoConstraints: scala.Boolean | stdLib.MediaTrackConstraints = null,
    width: scala.Double | java.lang.String = null
  ): WebcamProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audio)) __obj.updateDynamic("audio")(audio)
    if (audioConstraints != null) __obj.updateDynamic("audioConstraints")(audioConstraints.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(imageSmoothing)) __obj.updateDynamic("imageSmoothing")(imageSmoothing)
    if (minScreenshotHeight != null) __obj.updateDynamic("minScreenshotHeight")(minScreenshotHeight.asInstanceOf[js.Any])
    if (minScreenshotWidth != null) __obj.updateDynamic("minScreenshotWidth")(minScreenshotWidth.asInstanceOf[js.Any])
    if (onUserMedia != null) __obj.updateDynamic("onUserMedia")(js.Any.fromFunction0(onUserMedia))
    if (onUserMediaError != null) __obj.updateDynamic("onUserMediaError")(js.Any.fromFunction0(onUserMediaError))
    if (screenshotFormat != null) __obj.updateDynamic("screenshotFormat")(screenshotFormat.asInstanceOf[js.Any])
    if (screenshotQuality != null) __obj.updateDynamic("screenshotQuality")(screenshotQuality.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (videoConstraints != null) __obj.updateDynamic("videoConstraints")(videoConstraints.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebcamProps]
  }
}

