package typings
package solrDashClientLib.solrDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FacetOptions extends js.Object {
  var field: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var mincout: js.UndefOr[scala.Double] = js.undefined
  var missing: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var on: scala.Boolean
  var pivot: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var prefix: java.lang.String
  var query: js.UndefOr[java.lang.String] = js.undefined
  var sort: js.UndefOr[java.lang.String] = js.undefined
}

object FacetOptions {
  @scala.inline
  def apply(
    on: scala.Boolean,
    prefix: java.lang.String,
    field: java.lang.String | js.Array[java.lang.String] = null,
    limit: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    mincout: scala.Int | scala.Double = null,
    missing: js.UndefOr[scala.Boolean] = js.undefined,
    offset: scala.Int | scala.Double = null,
    pivot: java.lang.String | js.Array[java.lang.String] = null,
    query: java.lang.String = null,
    sort: java.lang.String = null
  ): FacetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("on")(on)
    __obj.updateDynamic("prefix")(prefix)
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (mincout != null) __obj.updateDynamic("mincout")(mincout.asInstanceOf[js.Any])
    if (!js.isUndefined(missing)) __obj.updateDynamic("missing")(missing)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (pivot != null) __obj.updateDynamic("pivot")(pivot.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[FacetOptions]
  }
}

