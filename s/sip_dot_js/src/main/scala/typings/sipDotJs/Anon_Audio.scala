package typings.sipDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Audio extends js.Object {
  var audio: Boolean
  var video: Boolean
}

object Anon_Audio {
  @scala.inline
  def apply(audio: Boolean, video: Boolean): Anon_Audio = {
    val __obj = js.Dynamic.literal(audio = audio, video = video)
  
    __obj.asInstanceOf[Anon_Audio]
  }
}

