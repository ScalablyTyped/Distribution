package typings.sipml.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Audio extends js.Object {
  var audio: Double
  var video: Double
}

object Audio {
  @scala.inline
  def apply(audio: Double, video: Double): Audio = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audio]
  }
}

