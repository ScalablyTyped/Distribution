package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ./store/RelayInMemoryRecordSource
@JSImport("relay-runtime", "RecordSource")
@js.native
class RecordSource () extends js.Object {
  def this(records: RecordMap) = this()
  def get(dataID: DataID): js.UndefOr[(stdLib.Record[java.lang.String, _]) | scala.Null] = js.native
  def getRecordIDs(): js.Array[DataID] = js.native
  def getStatus(dataID: DataID): RecordState = js.native
  def has(dataID: DataID): scala.Boolean = js.native
  def load(
    dataID: DataID,
    callback: js.Function2[
      /* error */ js.UndefOr[stdLib.Error | scala.Null], 
      /* record */ js.UndefOr[(stdLib.Record[java.lang.String, _]) | scala.Null], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def size(): scala.Double = js.native
  def toJSON(): stdLib.Record[java.lang.String, _] = js.native
}

