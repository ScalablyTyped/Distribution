package typings.reactMic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioBitsPerSecond extends js.Object {
  var audioBitsPerSecond: Double
  var mimeType: String
}

object AudioBitsPerSecond {
  @scala.inline
  def apply(audioBitsPerSecond: Double, mimeType: String): AudioBitsPerSecond = {
    val __obj = js.Dynamic.literal(audioBitsPerSecond = audioBitsPerSecond.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioBitsPerSecond]
  }
}

