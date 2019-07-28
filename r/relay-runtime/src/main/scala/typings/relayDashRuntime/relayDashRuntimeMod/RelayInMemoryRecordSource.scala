package typings.relayDashRuntime.relayDashRuntimeMod

import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ./store/RelayInMemoryRecordSource
@js.native
trait RelayInMemoryRecordSource extends js.Object {
  def clear(): Unit = js.native
  def delete(dataID: DataID): Unit = js.native
  def get(dataID: DataID): js.UndefOr[(Record[String, _]) | Null] = js.native
  def getRecordIDs(): js.Array[DataID] = js.native
  def getStatus(dataID: DataID): RecordState = js.native
  def has(dataID: DataID): Boolean = js.native
  def load(
    dataID: DataID,
    callback: js.Function2[
      /* error */ js.UndefOr[Error | Null], 
      /* record */ js.UndefOr[(Record[String, _]) | Null], 
      Unit
    ]
  ): Unit = js.native
  def remove(dataID: DataID): Unit = js.native
  def set(dataID: DataID, record: Record[String, _]): Unit = js.native
  def size(): Double = js.native
  def toJSON(): Record[String, _] = js.native
}

