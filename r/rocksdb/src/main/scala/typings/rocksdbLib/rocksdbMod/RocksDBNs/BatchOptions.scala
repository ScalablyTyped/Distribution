package typings
package rocksdbLib.rocksdbMod.RocksDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchOptions
  extends abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractOptions {
  var sync: js.UndefOr[scala.Boolean] = js.undefined
}

object BatchOptions {
  @scala.inline
  def apply(sync: js.UndefOr[scala.Boolean] = js.undefined): BatchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[BatchOptions]
  }
}

