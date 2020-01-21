package typings.reactNativeAudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAudioFileURL extends js.Object {
  var audioFileURL: String
  var base64: String
  var status: String
}

object AnonAudioFileURL {
  @scala.inline
  def apply(audioFileURL: String, base64: String, status: String): AnonAudioFileURL = {
    val __obj = js.Dynamic.literal(audioFileURL = audioFileURL.asInstanceOf[js.Any], base64 = base64.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAudioFileURL]
  }
}

