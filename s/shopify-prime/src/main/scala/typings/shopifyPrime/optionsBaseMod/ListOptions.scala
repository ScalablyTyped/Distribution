package typings.shopifyPrime.optionsBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOptions extends BasicListOptions {
  /**
    * Restricts results to those created after the given id.
    */
  var since_id: js.UndefOr[Double] = js.undefined
}

object ListOptions {
  @scala.inline
  def apply(
    limit: js.UndefOr[Double] = js.undefined,
    page: js.UndefOr[Double] = js.undefined,
    since_id: js.UndefOr[Double] = js.undefined
  ): ListOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(since_id)) __obj.updateDynamic("since_id")(since_id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOptions]
  }
}

