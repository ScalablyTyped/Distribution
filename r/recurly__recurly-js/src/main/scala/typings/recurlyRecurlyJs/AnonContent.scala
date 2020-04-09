package typings.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var content: js.UndefOr[String] = js.undefined
}

object AnonContent {
  @scala.inline
  def apply(color: String = null, content: String = null): AnonContent = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContent]
  }
}

