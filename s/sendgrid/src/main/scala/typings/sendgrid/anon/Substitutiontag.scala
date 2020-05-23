package typings.sendgrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Substitutiontag extends js.Object {
  var enable: Boolean
  var substitution_tag: String
}

object Substitutiontag {
  @scala.inline
  def apply(enable: Boolean, substitution_tag: String): Substitutiontag = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], substitution_tag = substitution_tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Substitutiontag]
  }
}

