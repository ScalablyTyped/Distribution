package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "RecordSource")
@js.native
class RecordSource () extends js.Object {
  def this(records: RecordMap) = this()
  def clear(): scala.Unit = js.native
  def delete(dataID: DataID): scala.Unit = js.native
  def get(dataID: DataID): RelayInMemoryRecordSource | scala.Null = js.native
  def getRecordIDs(): js.Array[DataID] = js.native
  def getStatus(dataID: DataID): relayDashRuntimeLib.relayDashRuntimeLibStrings.EXISTENT | relayDashRuntimeLib.relayDashRuntimeLibStrings.NONEXISTENT | relayDashRuntimeLib.relayDashRuntimeLibStrings.UNKNOWN = js.native
  def has(dataID: DataID): scala.Boolean = js.native
  def load(
    dataID: DataID,
    callback: js.Function2[
      /* error */ stdLib.Error | scala.Null, 
      /* record */ RelayInMemoryRecordSource | scala.Null, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def remove(dataID: DataID): scala.Unit = js.native
  def set(dataID: DataID, record: RelayInMemoryRecordSource): scala.Unit = js.native
  def size(): scala.Double = js.native
  def toJSON(): RecordMap = js.native
}

