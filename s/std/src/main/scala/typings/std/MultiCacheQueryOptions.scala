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
    if (cacheName != null) __obj.updateDynamic("cacheName")(cacheName.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreMethod)) __obj.updateDynamic("ignoreMethod")(ignoreMethod.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSearch)) __obj.updateDynamic("ignoreSearch")(ignoreSearch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreVary)) __obj.updateDynamic("ignoreVary")(ignoreVary.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiCacheQueryOptions]
  }
}

