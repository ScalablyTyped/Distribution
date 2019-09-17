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
    val __obj = js.Dynamic.literal(name = name, values = values)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    __obj.asInstanceOf[Anon_Multiple]
  }
}

