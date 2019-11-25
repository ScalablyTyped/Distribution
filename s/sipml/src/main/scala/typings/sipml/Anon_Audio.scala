package typings.sipml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Audio extends js.Object {
  var audio: Double
  var video: Double
}

object Anon_Audio {
  @scala.inline
  def apply(audio: Double, video: Double): Anon_Audio = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Audio]
  }
}

