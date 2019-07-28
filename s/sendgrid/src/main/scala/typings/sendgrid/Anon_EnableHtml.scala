package typings.sendgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnableHtml extends js.Object {
  var enable: Boolean
  var html: String
  var substitution_tag: String
  var text: String
}

object Anon_EnableHtml {
  @scala.inline
  def apply(enable: Boolean, html: String, substitution_tag: String, text: String): Anon_EnableHtml = {
    val __obj = js.Dynamic.literal(enable = enable, html = html, substitution_tag = substitution_tag, text = text)
  
    __obj.asInstanceOf[Anon_EnableHtml]
  }
}

