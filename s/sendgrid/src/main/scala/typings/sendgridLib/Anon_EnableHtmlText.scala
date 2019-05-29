package typings
package sendgridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnableHtmlText extends js.Object {
  var enable: scala.Boolean
  var html: java.lang.String
  var text: java.lang.String
}

object Anon_EnableHtmlText {
  @scala.inline
  def apply(enable: scala.Boolean, html: java.lang.String, text: java.lang.String): Anon_EnableHtmlText = {
    val __obj = js.Dynamic.literal(enable = enable, html = html, text = text)
  
    __obj.asInstanceOf[Anon_EnableHtmlText]
  }
}

