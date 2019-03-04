package typings
package shopifyDashBuyLib.ShopifyBuyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  var after: js.UndefOr[java.lang.String] = js.undefined
  var before: js.UndefOr[java.lang.String] = js.undefined
  var first: js.UndefOr[java.lang.String] = js.undefined
  var last: js.UndefOr[java.lang.String] = js.undefined
  /**
    * query: title, collection_type, updated_at
    * TODO probably will remove before Defintely Typed PR,
    * as their  community guidelines
    */
  var query: java.lang.String
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var sortBy: java.lang.String
}

object Query {
  @scala.inline
  def apply(
    query: java.lang.String,
    sortBy: java.lang.String,
    after: java.lang.String = null,
    before: java.lang.String = null,
    first: java.lang.String = null,
    last: java.lang.String = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined
  ): Query = {
    val __obj = js.Dynamic.literal(query = query, sortBy = sortBy)
    if (after != null) __obj.updateDynamic("after")(after)
    if (before != null) __obj.updateDynamic("before")(before)
    if (first != null) __obj.updateDynamic("first")(first)
    if (last != null) __obj.updateDynamic("last")(last)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    __obj.asInstanceOf[Query]
  }
}

