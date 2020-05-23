package typings.scBroker.mod

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
    count: js.UndefOr[Double] = js.undefined,
    getValue: js.UndefOr[Boolean] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    items: js.Array[_] = null,
    noAck: js.UndefOr[Boolean] = js.undefined
  ): SpliceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(getValue)) __obj.updateDynamic("getValue")(getValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(noAck)) __obj.updateDynamic("noAck")(noAck.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpliceOptions]
  }
}

