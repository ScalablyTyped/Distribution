package typings.reactEmailEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlExport extends js.Object {
  val design: Design
  val html: String
}

object HtmlExport {
  @scala.inline
  def apply(design: Design, html: String): HtmlExport = {
    val __obj = js.Dynamic.literal(design = design.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlExport]
  }
}

