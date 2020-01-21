package typings.reactWebcam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAudio extends js.Object {
  var audio: Boolean
  var imageSmoothing: Boolean
  var mirrored: Boolean
  var screenshotFormat: String
  var screenshotQuality: Double
  def onUserMedia(): Unit
  def onUserMediaError(): Unit
}

object AnonAudio {
  @scala.inline
  def apply(
    audio: Boolean,
    imageSmoothing: Boolean,
    mirrored: Boolean,
    onUserMedia: () => Unit,
    onUserMediaError: () => Unit,
    screenshotFormat: String,
    screenshotQuality: Double
  ): AnonAudio = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], imageSmoothing = imageSmoothing.asInstanceOf[js.Any], mirrored = mirrored.asInstanceOf[js.Any], onUserMedia = js.Any.fromFunction0(onUserMedia), onUserMediaError = js.Any.fromFunction0(onUserMediaError), screenshotFormat = screenshotFormat.asInstanceOf[js.Any], screenshotQuality = screenshotQuality.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAudio]
  }
}

