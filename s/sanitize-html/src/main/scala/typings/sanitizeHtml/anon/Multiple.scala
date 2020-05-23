package typings.sanitizeHtml.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Multiple extends js.Object {
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: String
  var values: js.Array[String]
}

object Multiple {
  @scala.inline
  def apply(name: String, values: js.Array[String], multiple: js.UndefOr[Boolean] = js.undefined): Multiple = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Multiple]
  }
}

