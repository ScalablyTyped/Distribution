package typings.sanitizeDashHtml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Multiple extends js.Object {
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: String
  var values: js.Array[String]
}

object Anon_Multiple {
  @scala.inline
  def apply(name: String, values: js.Array[String], multiple: js.UndefOr[Boolean] = js.undefined): Anon_Multiple = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Multiple]
  }
}

