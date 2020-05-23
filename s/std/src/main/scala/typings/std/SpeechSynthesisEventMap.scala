package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeechSynthesisEventMap extends js.Object {
  var voiceschanged: Event
}

object SpeechSynthesisEventMap {
  @scala.inline
  def apply(voiceschanged: Event): SpeechSynthesisEventMap = {
    val __obj = js.Dynamic.literal(voiceschanged = voiceschanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechSynthesisEventMap]
  }
}

