package typings.sendgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSubstitutiontag extends js.Object {
  var enable: Boolean
  var substitution_tag: String
}

object AnonSubstitutiontag {
  @scala.inline
  def apply(enable: Boolean, substitution_tag: String): AnonSubstitutiontag = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], substitution_tag = substitution_tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSubstitutiontag]
  }
}

