package typings.reactWebcam.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactWebcam.reactWebcamStrings.imageSlashjpeg
import typings.reactWebcam.reactWebcamStrings.imageSlashpng
import typings.reactWebcam.reactWebcamStrings.imageSlashwebp
import typings.std.HTMLVideoElement
import typings.std.MediaStream
import typings.std.MediaTrackConstraints
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebcamProps
  extends AllHTMLAttributes[HTMLVideoElement]
     with ClassAttributes[HTMLVideoElement] {
  var audio: Boolean = js.native
  var audioConstraints: js.UndefOr[Boolean | MediaTrackConstraints] = js.native
  var forceScreenshotSourceSize: Boolean = js.native
  var imageSmoothing: Boolean = js.native
  var minScreenshotHeight: js.UndefOr[Double] = js.native
  var minScreenshotWidth: js.UndefOr[Double] = js.native
  var mirrored: Boolean = js.native
  var screenshotFormat: imageSlashwebp | imageSlashpng | imageSlashjpeg = js.native
  var screenshotQuality: Double = js.native
  var videoConstraints: js.UndefOr[Boolean | MediaTrackConstraints] = js.native
  def onUserMedia(stream: MediaStream): Unit = js.native
  def onUserMediaError(error: String): Unit = js.native
}

object WebcamProps {
  @scala.inline
  def apply(
    audio: Boolean,
    forceScreenshotSourceSize: Boolean,
    imageSmoothing: Boolean,
    mirrored: Boolean,
    onUserMedia: MediaStream => Unit,
    onUserMediaError: String => Unit,
    screenshotFormat: imageSlashwebp | imageSlashpng | imageSlashjpeg,
    screenshotQuality: Double
  ): WebcamProps = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], forceScreenshotSourceSize = forceScreenshotSourceSize.asInstanceOf[js.Any], imageSmoothing = imageSmoothing.asInstanceOf[js.Any], mirrored = mirrored.asInstanceOf[js.Any], onUserMedia = js.Any.fromFunction1(onUserMedia), onUserMediaError = js.Any.fromFunction1(onUserMediaError), screenshotFormat = screenshotFormat.asInstanceOf[js.Any], screenshotQuality = screenshotQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebcamProps]
  }
  @scala.inline
  implicit class WebcamPropsOps[Self <: WebcamProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAudio(value: Boolean): Self = this.set("audio", value.asInstanceOf[js.Any])
    @scala.inline
    def setForceScreenshotSourceSize(value: Boolean): Self = this.set("forceScreenshotSourceSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageSmoothing(value: Boolean): Self = this.set("imageSmoothing", value.asInstanceOf[js.Any])
    @scala.inline
    def setMirrored(value: Boolean): Self = this.set("mirrored", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnUserMedia(value: MediaStream => Unit): Self = this.set("onUserMedia", js.Any.fromFunction1(value))
    @scala.inline
    def setOnUserMediaError(value: String => Unit): Self = this.set("onUserMediaError", js.Any.fromFunction1(value))
    @scala.inline
    def setScreenshotFormat(value: imageSlashwebp | imageSlashpng | imageSlashjpeg): Self = this.set("screenshotFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreenshotQuality(value: Double): Self = this.set("screenshotQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudioConstraints(value: Boolean | MediaTrackConstraints): Self = this.set("audioConstraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioConstraints: Self = this.set("audioConstraints", js.undefined)
    @scala.inline
    def setMinScreenshotHeight(value: Double): Self = this.set("minScreenshotHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinScreenshotHeight: Self = this.set("minScreenshotHeight", js.undefined)
    @scala.inline
    def setMinScreenshotWidth(value: Double): Self = this.set("minScreenshotWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinScreenshotWidth: Self = this.set("minScreenshotWidth", js.undefined)
    @scala.inline
    def setVideoConstraints(value: Boolean | MediaTrackConstraints): Self = this.set("videoConstraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoConstraints: Self = this.set("videoConstraints", js.undefined)
  }
  
}

