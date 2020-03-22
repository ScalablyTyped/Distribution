package typings.sendgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHtml extends js.Object {
  var enable: Boolean
  var html: String
  var substitution_tag: String
  var text: String
}

object AnonHtml {
  @scala.inline
  def apply(enable: Boolean, html: String, substitution_tag: String, text: String): AnonHtml = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], substitution_tag = substitution_tag.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHtml]
  }
}

