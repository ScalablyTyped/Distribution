package typings.reactWebcam.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Audio extends js.Object {
  var audio: Boolean
  var forceScreenshotSourceSize: Boolean
  var imageSmoothing: Boolean
  var mirrored: Boolean
  var screenshotFormat: String
  var screenshotQuality: Double
  def onUserMedia(): Unit
  def onUserMediaError(): Unit
}

object Audio {
  @scala.inline
  def apply(
    audio: Boolean,
    forceScreenshotSourceSize: Boolean,
    imageSmoothing: Boolean,
    mirrored: Boolean,
    onUserMedia: () => Unit,
    onUserMediaError: () => Unit,
    screenshotFormat: String,
    screenshotQuality: Double
  ): Audio = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], forceScreenshotSourceSize = forceScreenshotSourceSize.asInstanceOf[js.Any], imageSmoothing = imageSmoothing.asInstanceOf[js.Any], mirrored = mirrored.asInstanceOf[js.Any], onUserMedia = js.Any.fromFunction0(onUserMedia), onUserMediaError = js.Any.fromFunction0(onUserMediaError), screenshotFormat = screenshotFormat.asInstanceOf[js.Any], screenshotQuality = screenshotQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audio]
  }
}

