package typings.shopifyPrime.optionsBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicListOptions extends js.Object {
  /**
    * The maximum number of objects that should be returned, up to 250. Setting this parameter above 250 will result in an error.
    */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * The page number of the result list to retrieve. Use this in tandem with limit to page through the webhooks in a shop.
    */
  var page: js.UndefOr[Double] = js.undefined
}

object BasicListOptions {
  @scala.inline
  def apply(limit: js.UndefOr[Double] = js.undefined, page: js.UndefOr[Double] = js.undefined): BasicListOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicListOptions]
  }
}

