package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiCacheQueryOptions extends CacheQueryOptions {
  var cacheName: js.UndefOr[java.lang.String] = js.undefined
}

object MultiCacheQueryOptions {
  @scala.inline
  def apply(
    cacheName: java.lang.String = null,
    ignoreMethod: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreSearch: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreVary: js.UndefOr[scala.Boolean] = js.undefined
  ): MultiCacheQueryOptions = {
    val __obj = js.Dynamic.literal()
    if (cacheName != null) __obj.updateDynamic("cacheName")(cacheName)
    if (!js.isUndefined(ignoreMethod)) __obj.updateDynamic("ignoreMethod")(ignoreMethod)
    if (!js.isUndefined(ignoreSearch)) __obj.updateDynamic("ignoreSearch")(ignoreSearch)
    if (!js.isUndefined(ignoreVary)) __obj.updateDynamic("ignoreVary")(ignoreVary)
    __obj.asInstanceOf[MultiCacheQueryOptions]
  }
}

