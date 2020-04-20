package typings.rocksdb.mod.RocksDB

import typings.abstractLeveldown.mod.AbstractIterator
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.abstractLeveldown.mod.ErrorCallback
import typings.abstractLeveldown.mod.ErrorKeyValueCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iterator extends AbstractIterator[Bytes, Bytes] {
  var binding: js.Any
  var cache: js.Any
  var fastFuture: js.Any
  var finished: js.Any
  def seek(key: Bytes): Unit
}

object Iterator {
  @scala.inline
  def apply(
    binding: js.Any,
    cache: js.Any,
    db: AbstractLevelDOWN[Bytes, Bytes],
    end: ErrorCallback => Unit,
    fastFuture: js.Any,
    finished: js.Any,
    next: ErrorKeyValueCallback[Bytes, Bytes] => Iterator,
    seek: Bytes => Unit
  ): Iterator = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], end = js.Any.fromFunction1(end), fastFuture = fastFuture.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], next = js.Any.fromFunction1(next), seek = js.Any.fromFunction1(seek))
    __obj.asInstanceOf[Iterator]
  }
}

