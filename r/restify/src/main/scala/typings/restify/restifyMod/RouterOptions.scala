package typings.restify.restifyMod

import typings.bunyan.bunyanMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterOptions extends js.Object {
  var ignoreTrailingSlash: js.UndefOr[Boolean] = js.undefined
  var log: js.UndefOr[^] = js.undefined
  var onceNext: js.UndefOr[Boolean] = js.undefined
  var registry: js.UndefOr[RouterRegistryRadix] = js.undefined
  var strictNext: js.UndefOr[Boolean] = js.undefined
}

object RouterOptions {
  @scala.inline
  def apply(
    ignoreTrailingSlash: js.UndefOr[Boolean] = js.undefined,
    log: ^ = null,
    onceNext: js.UndefOr[Boolean] = js.undefined,
    registry: RouterRegistryRadix = null,
    strictNext: js.UndefOr[Boolean] = js.undefined
  ): RouterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreTrailingSlash)) __obj.updateDynamic("ignoreTrailingSlash")(ignoreTrailingSlash.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (!js.isUndefined(onceNext)) __obj.updateDynamic("onceNext")(onceNext.asInstanceOf[js.Any])
    if (registry != null) __obj.updateDynamic("registry")(registry.asInstanceOf[js.Any])
    if (!js.isUndefined(strictNext)) __obj.updateDynamic("strictNext")(strictNext.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterOptions]
  }
}

