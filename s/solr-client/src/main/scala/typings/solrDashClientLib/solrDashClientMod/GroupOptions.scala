package typings
package solrDashClientLib.solrDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupOptions extends js.Object {
  var cache: js.UndefOr[scala.Double] = js.undefined
  var field: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var main: js.UndefOr[scala.Boolean] = js.undefined
  var ngroups: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var on: js.UndefOr[scala.Boolean] = js.undefined
  var sort: js.UndefOr[java.lang.String] = js.undefined
  var truncate: js.UndefOr[scala.Boolean] = js.undefined
}

object GroupOptions {
  @scala.inline
  def apply(
    cache: scala.Int | scala.Double = null,
    field: java.lang.String | js.Array[java.lang.String] = null,
    format: java.lang.String = null,
    limit: scala.Int | scala.Double = null,
    main: js.UndefOr[scala.Boolean] = js.undefined,
    ngroups: js.UndefOr[scala.Boolean] = js.undefined,
    offset: scala.Int | scala.Double = null,
    on: js.UndefOr[scala.Boolean] = js.undefined,
    sort: java.lang.String = null,
    truncate: js.UndefOr[scala.Boolean] = js.undefined
  ): GroupOptions = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(main)) __obj.updateDynamic("main")(main)
    if (!js.isUndefined(ngroups)) __obj.updateDynamic("ngroups")(ngroups)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(on)) __obj.updateDynamic("on")(on)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (!js.isUndefined(truncate)) __obj.updateDynamic("truncate")(truncate)
    __obj.asInstanceOf[GroupOptions]
  }
}

