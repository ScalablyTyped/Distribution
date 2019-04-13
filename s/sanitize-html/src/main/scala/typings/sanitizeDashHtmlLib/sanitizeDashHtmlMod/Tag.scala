package typings
package sanitizeDashHtmlLib.sanitizeDashHtmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  var attribs: Attributes
  var tagName: java.lang.String
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Tag {
  @scala.inline
  def apply(attribs: Attributes, tagName: java.lang.String, text: java.lang.String = null): Tag = {
    val __obj = js.Dynamic.literal(attribs = attribs, tagName = tagName)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Tag]
  }
}

