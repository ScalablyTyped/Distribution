package typings.sendgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnableHtmlText extends js.Object {
  var enable: Boolean
  var html: String
  var text: String
}

object Anon_EnableHtmlText {
  @scala.inline
  def apply(enable: Boolean, html: String, text: String): Anon_EnableHtmlText = {
    val __obj = js.Dynamic.literal(enable = enable, html = html, text = text)
  
    __obj.asInstanceOf[Anon_EnableHtmlText]
  }
}

