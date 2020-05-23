package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlBuilder extends js.Object {
  def addAttribute(name: String, value: String): Unit
  def addCommunitiesCssClass(cssClassName: String): Unit
  def addCssClass(cssClassName: String): Unit
  def renderBeginTag(tagName: String): Unit
  def renderEndTag(): Unit
  def write(s: String): Unit
  def writeEncoded(s: String): Unit
}

object HtmlBuilder {
  @scala.inline
  def apply(
    addAttribute: (String, String) => Unit,
    addCommunitiesCssClass: String => Unit,
    addCssClass: String => Unit,
    renderBeginTag: String => Unit,
    renderEndTag: () => Unit,
    write: String => Unit,
    writeEncoded: String => Unit
  ): HtmlBuilder = {
    val __obj = js.Dynamic.literal(addAttribute = js.Any.fromFunction2(addAttribute), addCommunitiesCssClass = js.Any.fromFunction1(addCommunitiesCssClass), addCssClass = js.Any.fromFunction1(addCssClass), renderBeginTag = js.Any.fromFunction1(renderBeginTag), renderEndTag = js.Any.fromFunction0(renderEndTag), write = js.Any.fromFunction1(write), writeEncoded = js.Any.fromFunction1(writeEncoded))
    __obj.asInstanceOf[HtmlBuilder]
  }
}

