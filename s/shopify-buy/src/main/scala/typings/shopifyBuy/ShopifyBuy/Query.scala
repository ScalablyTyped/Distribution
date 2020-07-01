package typings.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  var after: js.UndefOr[String] = js.undefined
  var before: js.UndefOr[String] = js.undefined
  var first: js.UndefOr[Double] = js.undefined
  var last: js.UndefOr[Double] = js.undefined
  /**
    * query: title, collection_type, updated_at
    * TODO probably will remove before Defintely Typed PR,
    * as their  community guidelines
    */
  var query: String
  var reverse: js.UndefOr[Boolean] = js.undefined
  var sortBy: String
}

object Query {
  @scala.inline
  def apply(
    query: String,
    sortBy: String,
    after: String = null,
    before: String = null,
    first: js.UndefOr[Double] = js.undefined,
    last: js.UndefOr[Double] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined
  ): Query = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], sortBy = sortBy.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (!js.isUndefined(first)) __obj.updateDynamic("first")(first.get.asInstanceOf[js.Any])
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
}

