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
  def apply(limit: Int | Double = null, page: Int | Double = null): BasicListOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicListOptions]
  }
}

