package typings.reactDashWebcam.reactDashWebcamMod

import typings.react.reactMod.CSSProperties
import typings.reactDashWebcam.reactDashWebcamStrings.`image/jpeg`
import typings.reactDashWebcam.reactDashWebcamStrings.`image/png`
import typings.reactDashWebcam.reactDashWebcamStrings.`image/webp`
import typings.std.MediaTrackConstraints
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebcamProps extends js.Object {
  var audio: js.UndefOr[Boolean] = js.undefined
  var audioConstraints: js.UndefOr[Boolean | MediaTrackConstraints] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var imageSmoothing: js.UndefOr[Boolean] = js.undefined
  var minScreenshotHeight: js.UndefOr[Double] = js.undefined
  var minScreenshotWidth: js.UndefOr[Double] = js.undefined
  var onUserMedia: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onUserMediaError: js.UndefOr[js.Function0[Unit]] = js.undefined
  var screenshotFormat: js.UndefOr[`image/jpeg` | `image/png` | `image/webp`] = js.undefined
  var screenshotQuality: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var videoConstraints: js.UndefOr[Boolean | MediaTrackConstraints] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object WebcamProps {
  @scala.inline
  def apply(
    audio: js.UndefOr[Boolean] = js.undefined,
    audioConstraints: Boolean | MediaTrackConstraints = null,
    className: String = null,
    height: Double | String = null,
    imageSmoothing: js.UndefOr[Boolean] = js.undefined,
    minScreenshotHeight: Int | Double = null,
    minScreenshotWidth: Int | Double = null,
    onUserMedia: () => Unit = null,
    onUserMediaError: () => Unit = null,
    screenshotFormat: `image/jpeg` | `image/png` | `image/webp` = null,
    screenshotQuality: Int | Double = null,
    style: CSSProperties = null,
    videoConstraints: Boolean | MediaTrackConstraints = null,
    width: Double | String = null
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

