package typings
package rocksdbLib.rocksdbMod.RocksDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iterator
  extends abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractIterator[Bytes, Bytes] {
  var binding: js.Any
  var cache: js.Any
  var fastFuture: js.Any
  var finished: js.Any
  def seek(key: Bytes): scala.Unit
}

object Iterator {
  @scala.inline
  def apply(
    binding: js.Any,
    cache: js.Any,
    db: abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractLevelDOWN[Bytes, Bytes],
    end: js.Function1[abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback, scala.Unit],
    fastFuture: js.Any,
    finished: js.Any,
    next: js.Function1[
      abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorKeyValueCallback[Bytes, Bytes], 
      Iterator
    ],
    seek: js.Function1[Bytes, scala.Unit]
  ): Iterator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("binding")(binding)
    __obj.updateDynamic("cache")(cache)
    __obj.updateDynamic("db")(db)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("fastFuture")(fastFuture)
    __obj.updateDynamic("finished")(finished)
    __obj.updateDynamic("next")(next)
    __obj.updateDynamic("seek")(seek)
    __obj.asInstanceOf[Iterator]
  }
}

