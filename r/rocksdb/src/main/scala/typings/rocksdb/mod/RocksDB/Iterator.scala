package typings.rocksdb.mod.RocksDB

import typings.abstractLeveldown.mod.AbstractIterator
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.abstractLeveldown.mod.ErrorCallback
import typings.abstractLeveldown.mod.ErrorKeyValueCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Iterator extends AbstractIterator[Bytes, Bytes] {
  
  var binding: js.Any = js.native
  
  var cache: js.Any = js.native
  
  var fastFuture: js.Any = js.native
  
  var finished: js.Any = js.native
  
  def seek(key: Bytes): Unit = js.native
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
  
  @scala.inline
  implicit class IteratorOps[Self <: Iterator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBinding(value: js.Any): Self = this.set("binding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCache(value: js.Any): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFastFuture(value: js.Any): Self = this.set("fastFuture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinished(value: js.Any): Self = this.set("finished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeek(value: Bytes => Unit): Self = this.set("seek", js.Any.fromFunction1(value))
  }
}
