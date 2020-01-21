package typings.rocksdb.mod

import typings.abstractLeveldown.mod.AbstractBatch
import typings.abstractLeveldown.mod.AbstractChainedBatch
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.abstractLeveldown.mod.ErrorCallback
import typings.abstractLeveldown.mod.ErrorValueCallback
import typings.rocksdb.mod.RocksDB.BatchOptions
import typings.rocksdb.mod.RocksDB.Bytes
import typings.rocksdb.mod.RocksDB.DelOptions
import typings.rocksdb.mod.RocksDB.ErrorSizeCallback
import typings.rocksdb.mod.RocksDB.GetOptions
import typings.rocksdb.mod.RocksDB.Iterator
import typings.rocksdb.mod.RocksDB.IteratorOptions
import typings.rocksdb.mod.RocksDB.PutOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RocksDB_ extends AbstractLevelDOWN[Bytes, Bytes] {
  def approximateSize(start: Bytes, end: Bytes, cb: ErrorSizeCallback): Unit = js.native
  def batch(array: js.Array[AbstractBatch[_, _]], options: BatchOptions, cb: ErrorCallback): AbstractChainedBatch[Bytes, Bytes] = js.native
  def compactRange(start: Bytes, end: Bytes, cb: ErrorCallback): Unit = js.native
  def del(key: Bytes, options: DelOptions, cb: ErrorCallback): Unit = js.native
  def destroy(location: String, cb: ErrorCallback): Unit = js.native
  def get(key: Bytes, options: GetOptions, cb: ErrorValueCallback[Bytes]): Unit = js.native
  def getProperty(property: String): String = js.native
  def iterator(options: IteratorOptions): Iterator = js.native
  def put(key: Bytes, value: Bytes, options: PutOptions, cb: ErrorCallback): Unit = js.native
  def repair(location: String, cb: ErrorCallback): Unit = js.native
}

