package typings
package scDashBrokerLib.scDashBrokerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpliceOptions extends js.Object {
  var count: js.UndefOr[scala.Double] = js.undefined
  var getValue: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var noAck: js.UndefOr[scala.Boolean] = js.undefined
}

object SpliceOptions {
  @scala.inline
  def apply(
    count: scala.Int | scala.Double = null,
    getValue: js.UndefOr[scala.Boolean] = js.undefined,
    index: scala.Int | scala.Double = null,
    items: js.Array[_] = null,
    noAck: js.UndefOr[scala.Boolean] = js.undefined
  ): SpliceOptions = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(getValue)) __obj.updateDynamic("getValue")(getValue)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items)
    if (!js.isUndefined(noAck)) __obj.updateDynamic("noAck")(noAck)
    __obj.asInstanceOf[SpliceOptions]
  }
}

