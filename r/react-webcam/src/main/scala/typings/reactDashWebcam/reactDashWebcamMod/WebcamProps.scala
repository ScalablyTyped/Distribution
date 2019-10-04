package typings.reactDashWebcam.reactDashWebcamMod

import typings.reactDashWebcam.reactDashWebcamStrings.`image/jpeg`
import typings.reactDashWebcam.reactDashWebcamStrings.`image/png`
import typings.reactDashWebcam.reactDashWebcamStrings.`image/webp`
import typings.std.MediaTrackConstraints
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebcamProps extends js.Object {
  var audio: Boolean
  var audioConstraints: js.UndefOr[Boolean | MediaTrackConstraints] = js.undefined
  var imageSmoothing: Boolean
  var minScreenshotHeight: js.UndefOr[Double] = js.undefined
  var minScreenshotWidth: js.UndefOr[Double] = js.undefined
  var mirrored: js.UndefOr[Boolean] = js.undefined
  var screenshotFormat: `image/webp` | `image/png` | `image/jpeg`
  var screenshotQuality: Double
  var videoConstraints: js.UndefOr[Boolean | MediaTrackConstraints] = js.undefined
  def onUserMedia(): Unit
  def onUserMediaError(error: String): Unit
}

object WebcamProps {
  @scala.inline
  def apply(
    audio: Boolean,
    imageSmoothing: Boolean,
    onUserMedia: () => Unit,
    onUserMediaError: String => Unit,
    screenshotFormat: `image/webp` | `image/png` | `image/jpeg`,
    screenshotQuality: Double,
    audioConstraints: Boolean | MediaTrackConstraints = null,
    minScreenshotHeight: Int | Double = null,
    minScreenshotWidth: Int | Double = null,
    mirrored: js.UndefOr[Boolean] = js.undefined,
    videoConstraints: Boolean | MediaTrackConstraints = null
  ): WebcamProps = {
    val __obj = js.Dynamic.literal(audio = audio, imageSmoothing = imageSmoothing, onUserMedia = js.Any.fromFunction0(onUserMedia), onUserMediaError = js.Any.fromFunction1(onUserMediaError), screenshotFormat = screenshotFormat.asInstanceOf[js.Any], screenshotQuality = screenshotQuality)
    if (audioConstraints != null) __obj.updateDynamic("audioConstraints")(audioConstraints.asInstanceOf[js.Any])
    if (minScreenshotHeight != null) __obj.updateDynamic("minScreenshotHeight")(minScreenshotHeight.asInstanceOf[js.Any])
    if (minScreenshotWidth != null) __obj.updateDynamic("minScreenshotWidth")(minScreenshotWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(mirrored)) __obj.updateDynamic("mirrored")(mirrored)
    if (videoConstraints != null) __obj.updateDynamic("videoConstraints")(videoConstraints.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebcamProps]
  }
}

