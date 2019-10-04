package typings.relayDashRuntime.libStoreRelayRecordSourceMod

import typings.relayDashRuntime.libStoreRelayRecordStateMod.RecordState
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.MutableRecordSource
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Record
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.RecordMap
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/store/RelayRecordSource", "RelayRecordSource")
@js.native
class RelayRecordSource () extends js.Object {
  def this(records: RecordMap) = this()
  def clear(): Unit = js.native
  def delete(dataID: DataID): Unit = js.native
  def get(dataID: DataID): Record = js.native
  def getRecordIDs(): js.Array[String] = js.native
  def getStatus(dataID: DataID): RecordState = js.native
  def has(dataID: DataID): Boolean = js.native
  def load(
    dataID: DataID,
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* record */ js.UndefOr[Record | Null], Unit]
  ): Unit = js.native
  def remove(dataID: DataID): Unit = js.native
  def set(dataID: DataID, record: Record): Unit = js.native
  def size(): Double = js.native
  def toJSON(): Record = js.native
}

/* static members */
@JSImport("relay-runtime/lib/store/RelayRecordSource", "RelayRecordSource")
@js.native
object RelayRecordSource extends js.Object {
  def create(): MutableRecordSource = js.native
  def create(records: RecordMap): MutableRecordSource = js.native
}

