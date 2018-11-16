package typings
package rocksdbLib.rocksdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RocksDB
  extends abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractLevelDOWN[rocksdbLib.rocksdbMod.RocksDBNs.Bytes, rocksdbLib.rocksdbMod.RocksDBNs.Bytes] {
  def approximateSize(
    start: rocksdbLib.rocksdbMod.RocksDBNs.Bytes,
    end: rocksdbLib.rocksdbMod.RocksDBNs.Bytes,
    cb: rocksdbLib.rocksdbMod.RocksDBNs.ErrorSizeCallback
  ): scala.Unit = js.native
  def batch(
    array: js.Array[abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractBatch[_, _]],
    options: rocksdbLib.rocksdbMod.RocksDBNs.BatchOptions,
    cb: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback
  ): abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractChainedBatch[rocksdbLib.rocksdbMod.RocksDBNs.Bytes, rocksdbLib.rocksdbMod.RocksDBNs.Bytes] = js.native
  def compactRange(
    start: rocksdbLib.rocksdbMod.RocksDBNs.Bytes,
    end: rocksdbLib.rocksdbMod.RocksDBNs.Bytes,
    cb: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback
  ): scala.Unit = js.native
  def del(
    key: rocksdbLib.rocksdbMod.RocksDBNs.Bytes,
    options: rocksdbLib.rocksdbMod.RocksDBNs.DelOptions,
    cb: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback
  ): scala.Unit = js.native
  def destroy(location: java.lang.String, cb: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback): scala.Unit = js.native
  def get(
    key: rocksdbLib.rocksdbMod.RocksDBNs.Bytes,
    options: rocksdbLib.rocksdbMod.RocksDBNs.GetOptions,
    cb: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorValueCallback[rocksdbLib.rocksdbMod.RocksDBNs.Bytes]
  ): scala.Unit = js.native
  def getProperty(property: java.lang.String): java.lang.String = js.native
  def iterator(options: rocksdbLib.rocksdbMod.RocksDBNs.IteratorOptions): rocksdbLib.rocksdbMod.RocksDBNs.Iterator = js.native
  def put(
    key: rocksdbLib.rocksdbMod.RocksDBNs.Bytes,
    value: rocksdbLib.rocksdbMod.RocksDBNs.Bytes,
    options: rocksdbLib.rocksdbMod.RocksDBNs.PutOptions,
    cb: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback
  ): scala.Unit = js.native
  def repair(location: java.lang.String, cb: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback): scala.Unit = js.native
}

