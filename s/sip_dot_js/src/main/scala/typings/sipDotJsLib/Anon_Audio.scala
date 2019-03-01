package typings
package sipDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Audio extends js.Object {
  var audio: scala.Boolean
  var video: scala.Boolean
}

object Anon_Audio {
  @scala.inline
  def apply(audio: scala.Boolean, video: scala.Boolean): Anon_Audio = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("audio")(audio)
    __obj.updateDynamic("video")(video)
    __obj.asInstanceOf[Anon_Audio]
  }
}

