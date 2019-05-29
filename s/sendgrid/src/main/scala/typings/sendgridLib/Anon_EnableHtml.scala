package typings
package sendgridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnableHtml extends js.Object {
  var enable: scala.Boolean
  var html: java.lang.String
  var substitution_tag: java.lang.String
  var text: java.lang.String
}

object Anon_EnableHtml {
  @scala.inline
  def apply(
    enable: scala.Boolean,
    html: java.lang.String,
    substitution_tag: java.lang.String,
    text: java.lang.String
  ): Anon_EnableHtml = {
    val __obj = js.Dynamic.literal(enable = enable, html = html, substitution_tag = substitution_tag, text = text)
  
    __obj.asInstanceOf[Anon_EnableHtml]
  }
}

