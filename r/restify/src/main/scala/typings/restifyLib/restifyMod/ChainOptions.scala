package typings
package restifyLib.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainOptions extends js.Object {
  var onceNext: js.UndefOr[scala.Boolean] = js.undefined
  var strictNext: js.UndefOr[scala.Boolean] = js.undefined
}

object ChainOptions {
  @scala.inline
  def apply(
    onceNext: js.UndefOr[scala.Boolean] = js.undefined,
    strictNext: js.UndefOr[scala.Boolean] = js.undefined
  ): ChainOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(onceNext)) __obj.updateDynamic("onceNext")(onceNext)
    if (!js.isUndefined(strictNext)) __obj.updateDynamic("strictNext")(strictNext)
    __obj.asInstanceOf[ChainOptions]
  }
}

