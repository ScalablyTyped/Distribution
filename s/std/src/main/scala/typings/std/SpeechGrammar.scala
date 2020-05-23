package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeechGrammar extends js.Object {
  var src: java.lang.String
  var weight: Double
}

object SpeechGrammar {
  @scala.inline
  def apply(src: java.lang.String, weight: Double): SpeechGrammar = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechGrammar]
  }
}

