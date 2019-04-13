package typings
package restifyLib.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterOptions extends js.Object {
  var ignoreTrailingSlash: js.UndefOr[scala.Boolean] = js.undefined
  var log: js.UndefOr[bunyanLib.bunyanMod.^] = js.undefined
  var onceNext: js.UndefOr[scala.Boolean] = js.undefined
  var registry: js.UndefOr[RouterRegistryRadix] = js.undefined
  var strictNext: js.UndefOr[scala.Boolean] = js.undefined
}

object RouterOptions {
  @scala.inline
  def apply(
    ignoreTrailingSlash: js.UndefOr[scala.Boolean] = js.undefined,
    log: bunyanLib.bunyanMod.^ = null,
    onceNext: js.UndefOr[scala.Boolean] = js.undefined,
    registry: RouterRegistryRadix = null,
    strictNext: js.UndefOr[scala.Boolean] = js.undefined
  ): RouterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreTrailingSlash)) __obj.updateDynamic("ignoreTrailingSlash")(ignoreTrailingSlash)
    if (log != null) __obj.updateDynamic("log")(log)
    if (!js.isUndefined(onceNext)) __obj.updateDynamic("onceNext")(onceNext)
    if (registry != null) __obj.updateDynamic("registry")(registry)
    if (!js.isUndefined(strictNext)) __obj.updateDynamic("strictNext")(strictNext)
    __obj.asInstanceOf[RouterOptions]
  }
}

