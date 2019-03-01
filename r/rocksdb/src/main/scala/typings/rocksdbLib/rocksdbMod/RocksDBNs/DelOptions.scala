package typings
package rocksdbLib.rocksdbMod.RocksDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelOptions
  extends abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractOptions {
  var sync: js.UndefOr[scala.Boolean] = js.undefined
}

object DelOptions {
  @scala.inline
  def apply(sync: js.UndefOr[scala.Boolean] = js.undefined): DelOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[DelOptions]
  }
}

