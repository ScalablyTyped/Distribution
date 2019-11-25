package typings.scDashBroker.scDashBrokerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpliceOptions extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var getValue: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var noAck: js.UndefOr[Boolean] = js.undefined
}

object SpliceOptions {
  @scala.inline
  def apply(
    count: Int | Double = null,
    getValue: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    items: js.Array[_] = null,
    noAck: js.UndefOr[Boolean] = js.undefined
  ): SpliceOptions = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(getValue)) __obj.updateDynamic("getValue")(getValue.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(noAck)) __obj.updateDynamic("noAck")(noAck.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpliceOptions]
  }
}

