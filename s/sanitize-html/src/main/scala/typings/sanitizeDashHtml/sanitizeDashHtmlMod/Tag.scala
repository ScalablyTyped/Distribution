package typings.sanitizeDashHtml.sanitizeDashHtmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  var attribs: Attributes
  var tagName: String
  var text: js.UndefOr[String] = js.undefined
}

object Tag {
  @scala.inline
  def apply(attribs: Attributes, tagName: String, text: String = null): Tag = {
    val __obj = js.Dynamic.literal(attribs = attribs.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
}

