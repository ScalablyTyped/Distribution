package typings.reactMic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAudioBitsPerSecond extends js.Object {
  var audioBitsPerSecond: Double
  var mimeType: String
}

object AnonAudioBitsPerSecond {
  @scala.inline
  def apply(audioBitsPerSecond: Double, mimeType: String): AnonAudioBitsPerSecond = {
    val __obj = js.Dynamic.literal(audioBitsPerSecond = audioBitsPerSecond.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAudioBitsPerSecond]
  }
}

