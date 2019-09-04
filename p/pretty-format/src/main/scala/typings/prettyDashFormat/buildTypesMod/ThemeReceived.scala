package typings.prettyDashFormat.buildTypesMod

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
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (content != null) __obj.updateDynamic("content")(content)
    if (prop != null) __obj.updateDynamic("prop")(prop)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ThemeReceived]
  }
}

