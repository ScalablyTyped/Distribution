package typings.rocksdb.mod.RocksDB

import typings.abstractLeveldown.mod.AbstractGetOptions
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
    if (!js.isUndefined(asBuffer)) __obj.updateDynamic("asBuffer")(asBuffer.asInstanceOf[js.Any])
    if (!js.isUndefined(fillCache)) __obj.updateDynamic("fillCache")(fillCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOptions]
  }
}

