package typings.rocksdb.rocksdbMod.RocksDB

import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractGetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOptions extends AbstractGetOptions {
  var fillCache: js.UndefOr[Boolean] = js.undefined
}

object GetOptions {
  @scala.inline
  def apply(asBuffer: js.UndefOr[Boolean] = js.undefined, fillCache: js.UndefOr[Boolean] = js.undefined): GetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asBuffer)) __obj.updateDynamic("asBuffer")(asBuffer)
    if (!js.isUndefined(fillCache)) __obj.updateDynamic("fillCache")(fillCache)
    __obj.asInstanceOf[GetOptions]
  }
}

