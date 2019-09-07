package typings.reactDashWebcam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Audio extends js.Object {
  var audio: Boolean
  var imageSmoothing: Boolean
  var screenshotFormat: String
  var screenshotQuality: Double
  def onUserMedia(): Unit
  def onUserMediaError(): Unit
}

object Anon_Audio {
  @scala.inline
  def apply(
    audio: Boolean,
    imageSmoothing: Boolean,
    onUserMedia: () => Unit,
    onUserMediaError: () => Unit,
    screenshotFormat: String,
    screenshotQuality: Double
  ): Anon_Audio = {
    val __obj = js.Dynamic.literal(audio = audio, imageSmoothing = imageSmoothing, onUserMedia = js.Any.fromFunction0(onUserMedia), onUserMediaError = js.Any.fromFunction0(onUserMediaError), screenshotFormat = screenshotFormat, screenshotQuality = screenshotQuality)
  
    __obj.asInstanceOf[Anon_Audio]
  }
}

