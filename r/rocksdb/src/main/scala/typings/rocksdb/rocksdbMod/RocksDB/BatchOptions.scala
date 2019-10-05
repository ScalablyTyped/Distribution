package typings.rocksdb.rocksdbMod.RocksDB

import org.scalablytyped.runtime.StringDictionary
import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchOptions extends AbstractOptions {
  var sync: js.UndefOr[Boolean] = js.undefined
}

object BatchOptions {
  @scala.inline
  def apply(StringDictionary: StringDictionary[js.Any] = null, sync: js.UndefOr[Boolean] = js.undefined): BatchOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[BatchOptions]
  }
}

