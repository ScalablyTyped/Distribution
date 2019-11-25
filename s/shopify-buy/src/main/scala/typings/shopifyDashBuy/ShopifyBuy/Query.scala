package typings.shopifyDashBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  var after: js.UndefOr[String] = js.undefined
  var before: js.UndefOr[String] = js.undefined
  var first: js.UndefOr[String] = js.undefined
  var last: js.UndefOr[String] = js.undefined
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
    first: String = null,
    last: String = null,
    reverse: js.UndefOr[Boolean] = js.undefined
  ): Query = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], sortBy = sortBy.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
}

