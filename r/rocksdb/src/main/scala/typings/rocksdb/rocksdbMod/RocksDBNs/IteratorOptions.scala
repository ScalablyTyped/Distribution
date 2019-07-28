package typings.rocksdb.rocksdbMod.RocksDBNs

import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractIteratorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IteratorOptions extends AbstractIteratorOptions[Bytes] {
  var fillCache: js.UndefOr[Boolean] = js.undefined
}

object IteratorOptions {
  @scala.inline
  def apply(
    fillCache: js.UndefOr[Boolean] = js.undefined,
    gt: Bytes = null,
    gte: Bytes = null,
    keyAsBuffer: js.UndefOr[Boolean] = js.undefined,
    keys: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null,
    lt: Bytes = null,
    lte: Bytes = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    valueAsBuffer: js.UndefOr[Boolean] = js.undefined,
    values: js.UndefOr[Boolean] = js.undefined
  ): IteratorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fillCache)) __obj.updateDynamic("fillCache")(fillCache)
    if (gt != null) __obj.updateDynamic("gt")(gt.asInstanceOf[js.Any])
    if (gte != null) __obj.updateDynamic("gte")(gte.asInstanceOf[js.Any])
    if (!js.isUndefined(keyAsBuffer)) __obj.updateDynamic("keyAsBuffer")(keyAsBuffer)
    if (!js.isUndefined(keys)) __obj.updateDynamic("keys")(keys)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (lt != null) __obj.updateDynamic("lt")(lt.asInstanceOf[js.Any])
    if (lte != null) __obj.updateDynamic("lte")(lte.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (!js.isUndefined(valueAsBuffer)) __obj.updateDynamic("valueAsBuffer")(valueAsBuffer)
    if (!js.isUndefined(values)) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[IteratorOptions]
  }
}

