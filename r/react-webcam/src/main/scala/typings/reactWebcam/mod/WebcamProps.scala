package typings.reactWebcam.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactWebcam.reactWebcamStrings.imageSlashjpeg
import typings.reactWebcam.reactWebcamStrings.imageSlashpng
import typings.reactWebcam.reactWebcamStrings.imageSlashwebp
import typings.std.HTMLVideoElement
import typings.std.MediaTrackConstraints
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebcamProps
  extends AllHTMLAttributes[HTMLVideoElement]
     with ClassAttributes[HTMLVideoElement] {
  var audio: Boolean
  var audioConstraints: js.UndefOr[Boolean | MediaTrackConstraints] = js.undefined
  var forceScreenshotSourceSize: Boolean
  var imageSmoothing: Boolean
  var minScreenshotHeight: js.UndefOr[Double] = js.undefined
  var minScreenshotWidth: js.UndefOr[Double] = js.undefined
  var mirrored: Boolean
  var screenshotFormat: imageSlashwebp | imageSlashpng | imageSlashjpeg
  var screenshotQuality: Double
  var videoConstraints: js.UndefOr[Boolean | MediaTrackConstraints] = js.undefined
  def onUserMedia(): Unit
  def onUserMediaError(error: String): Unit
}

object WebcamProps {
  @scala.inline
  def apply(
    audio: Boolean,
    forceScreenshotSourceSize: Boolean,
    imageSmoothing: Boolean,
    mirrored: Boolean,
    onUserMedia: () => Unit,
    onUserMediaError: String => Unit,
    screenshotFormat: imageSlashwebp | imageSlashpng | imageSlashjpeg,
    screenshotQuality: Double,
    AllHTMLAttributes: AllHTMLAttributes[HTMLVideoElement] = null,
    ClassAttributes: ClassAttributes[HTMLVideoElement] = null,
    audioConstraints: Boolean | MediaTrackConstraints = null,
    minScreenshotHeight: Int | Double = null,
    minScreenshotWidth: Int | Double = null,
    videoConstraints: Boolean | MediaTrackConstraints = null
  ): WebcamProps = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], forceScreenshotSourceSize = forceScreenshotSourceSize.asInstanceOf[js.Any], imageSmoothing = imageSmoothing.asInstanceOf[js.Any], mirrored = mirrored.asInstanceOf[js.Any], onUserMedia = js.Any.fromFunction0(onUserMedia), onUserMediaError = js.Any.fromFunction1(onUserMediaError), screenshotFormat = screenshotFormat.asInstanceOf[js.Any], screenshotQuality = screenshotQuality.asInstanceOf[js.Any])
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (audioConstraints != null) __obj.updateDynamic("audioConstraints")(audioConstraints.asInstanceOf[js.Any])
    if (minScreenshotHeight != null) __obj.updateDynamic("minScreenshotHeight")(minScreenshotHeight.asInstanceOf[js.Any])
    if (minScreenshotWidth != null) __obj.updateDynamic("minScreenshotWidth")(minScreenshotWidth.asInstanceOf[js.Any])
    if (videoConstraints != null) __obj.updateDynamic("videoConstraints")(videoConstraints.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebcamProps]
  }
}

