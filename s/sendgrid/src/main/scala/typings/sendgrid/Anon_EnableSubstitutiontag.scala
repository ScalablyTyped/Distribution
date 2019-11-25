package typings.sendgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnableSubstitutiontag extends js.Object {
  var enable: Boolean
  var substitution_tag: String
}

object Anon_EnableSubstitutiontag {
  @scala.inline
  def apply(enable: Boolean, substitution_tag: String): Anon_EnableSubstitutiontag = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], substitution_tag = substitution_tag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EnableSubstitutiontag]
  }
}

