package typings.safeDashRegex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Limit extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
}

object Anon_Limit {
  @scala.inline
  def apply(limit: Int | Double = null): Anon_Limit = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Limit]
  }
}

