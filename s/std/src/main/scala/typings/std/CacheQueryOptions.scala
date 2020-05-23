package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheQueryOptions extends js.Object {
  var ignoreMethod: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreSearch: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreVary: js.UndefOr[scala.Boolean] = js.undefined
}

object CacheQueryOptions {
  @scala.inline
  def apply(
    ignoreMethod: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreSearch: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreVary: js.UndefOr[scala.Boolean] = js.undefined
  ): CacheQueryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreMethod)) __obj.updateDynamic("ignoreMethod")(ignoreMethod.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSearch)) __obj.updateDynamic("ignoreSearch")(ignoreSearch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreVary)) __obj.updateDynamic("ignoreVary")(ignoreVary.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheQueryOptions]
  }
}

