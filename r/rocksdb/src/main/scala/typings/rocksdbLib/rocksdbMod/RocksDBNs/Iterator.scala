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
    end: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback => scala.Unit,
    fastFuture: js.Any,
    finished: js.Any,
    next: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorKeyValueCallback[Bytes, Bytes] => Iterator,
    seek: Bytes => scala.Unit
  ): Iterator = {
    val __obj = js.Dynamic.literal(binding = binding, cache = cache, db = db, end = js.Any.fromFunction1(end), fastFuture = fastFuture, finished = finished, next = js.Any.fromFunction1(next), seek = js.Any.fromFunction1(seek))
  
    __obj.asInstanceOf[Iterator]
  }
}

