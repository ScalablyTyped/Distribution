package typings.recurlyRecurlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var content: js.UndefOr[String] = js.undefined
}

object Content {
  @scala.inline
  def apply(color: String = null, content: String = null): Content = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

