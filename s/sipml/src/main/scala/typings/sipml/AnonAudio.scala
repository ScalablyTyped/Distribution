package typings.sipml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAudio extends js.Object {
  var audio: Double
  var video: Double
}

object AnonAudio {
  @scala.inline
  def apply(audio: Double, video: Double): AnonAudio = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAudio]
  }
}

