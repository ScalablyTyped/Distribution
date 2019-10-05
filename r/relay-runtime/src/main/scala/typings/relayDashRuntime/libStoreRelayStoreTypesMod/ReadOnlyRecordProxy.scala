package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadOnlyRecordProxy extends js.Object {
  def getDataID(): DataID = js.native
  def getLinkedRecord(name: String): js.UndefOr[RecordProxy | Null] = js.native
  def getLinkedRecord(name: String, args: Variables): js.UndefOr[RecordProxy | Null] = js.native
  def getLinkedRecords(name: String): js.UndefOr[(js.Array[js.UndefOr[RecordProxy | Null]]) | Null] = js.native
  def getLinkedRecords(name: String, args: Variables): js.UndefOr[(js.Array[js.UndefOr[RecordProxy | Null]]) | Null] = js.native
  def getType(): String = js.native
  def getValue(name: String): js.Any = js.native
  def getValue(name: String, args: Variables): js.Any = js.native
}

