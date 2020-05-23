package typings.reactNativeAudio.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioFileURL extends js.Object {
  var audioFileURL: String
  var base64: String
  var status: String
}

object AudioFileURL {
  @scala.inline
  def apply(audioFileURL: String, base64: String, status: String): AudioFileURL = {
    val __obj = js.Dynamic.literal(audioFileURL = audioFileURL.asInstanceOf[js.Any], base64 = base64.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioFileURL]
  }
}

