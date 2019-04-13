package typings
package prettyDashFormatLib.prettyDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme extends js.Object {
  var comment: js.UndefOr[java.lang.String] = js.undefined
  var content: js.UndefOr[java.lang.String] = js.undefined
  var prop: js.UndefOr[java.lang.String] = js.undefined
  var tag: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Theme {
  @scala.inline
  def apply(
    comment: java.lang.String = null,
    content: java.lang.String = null,
    prop: java.lang.String = null,
    tag: java.lang.String = null,
    value: java.lang.String = null
  ): Theme = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (content != null) __obj.updateDynamic("content")(content)
    if (prop != null) __obj.updateDynamic("prop")(prop)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Theme]
  }
}

