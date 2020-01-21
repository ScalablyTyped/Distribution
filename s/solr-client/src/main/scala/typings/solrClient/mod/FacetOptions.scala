package typings.solrClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FacetOptions extends js.Object {
  var field: js.UndefOr[String | js.Array[String]] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var mincout: js.UndefOr[Double] = js.undefined
  var missing: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var on: Boolean
  var pivot: js.UndefOr[String | js.Array[String]] = js.undefined
  var prefix: String
  var query: js.UndefOr[String] = js.undefined
  var sort: js.UndefOr[String] = js.undefined
}

object FacetOptions {
  @scala.inline
  def apply(
    on: Boolean,
    prefix: String,
    field: String | js.Array[String] = null,
    limit: Int | Double = null,
    method: String = null,
    mincout: Int | Double = null,
    missing: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    pivot: String | js.Array[String] = null,
    query: String = null,
    sort: String = null
  ): FacetOptions = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mincout != null) __obj.updateDynamic("mincout")(mincout.asInstanceOf[js.Any])
    if (!js.isUndefined(missing)) __obj.updateDynamic("missing")(missing.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (pivot != null) __obj.updateDynamic("pivot")(pivot.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetOptions]
  }
}

