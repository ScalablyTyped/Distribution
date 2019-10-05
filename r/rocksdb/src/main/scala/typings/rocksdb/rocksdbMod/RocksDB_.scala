package typings.rocksdb.rocksdbMod

import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractBatch
import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractChainedBatch
import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractLevelDOWN
import typings.abstractDashLeveldown.abstractDashLeveldownMod.ErrorCallback
import typings.abstractDashLeveldown.abstractDashLeveldownMod.ErrorValueCallback
import typings.rocksdb.rocksdbMod.RocksDB.BatchOptions
import typings.rocksdb.rocksdbMod.RocksDB.Bytes
import typings.rocksdb.rocksdbMod.RocksDB.DelOptions
import typings.rocksdb.rocksdbMod.RocksDB.ErrorSizeCallback
import typings.rocksdb.rocksdbMod.RocksDB.GetOptions
import typings.rocksdb.rocksdbMod.RocksDB.Iterator
import typings.rocksdb.rocksdbMod.RocksDB.IteratorOptions
import typings.rocksdb.rocksdbMod.RocksDB.PutOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("RocksDB")
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

