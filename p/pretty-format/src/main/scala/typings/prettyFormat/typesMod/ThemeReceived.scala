package typings.prettyFormat.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeReceived extends js.Object {
  var comment: js.UndefOr[String] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var prop: js.UndefOr[String] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object ThemeReceived {
  @scala.inline
  def apply(
    comment: String = null,
    content: String = null,
    prop: String = null,
    tag: String = null,
    value: String = null
  ): ThemeReceived = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (prop != null) __obj.updateDynamic("prop")(prop.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeReceived]
  }
}

