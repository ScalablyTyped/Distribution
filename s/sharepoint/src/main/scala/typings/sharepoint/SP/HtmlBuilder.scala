package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.HtmlBuilder")
@js.native
class HtmlBuilder () extends js.Object {
  def addAttribute(name: String, value: String): Unit = js.native
  def addCommunitiesCssClass(cssClassName: String): Unit = js.native
  def addCssClass(cssClassName: String): Unit = js.native
  def renderBeginTag(tagName: String): Unit = js.native
  def renderEndTag(): Unit = js.native
  def write(s: String): Unit = js.native
  def writeEncoded(s: String): Unit = js.native
}

