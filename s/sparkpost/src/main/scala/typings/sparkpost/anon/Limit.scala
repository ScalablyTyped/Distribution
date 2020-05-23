package typings.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Limit extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
}

object Limit {
  @scala.inline
  def apply(limit: js.UndefOr[Double] = js.undefined): Limit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limit]
  }
}

