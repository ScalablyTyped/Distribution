package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordProxy extends js.Object {
  def copyFieldsFrom(source: RecordProxy): Unit = js.native
  def getDataID(): DataID = js.native
  def getLinkedRecord(name: String): js.UndefOr[RecordProxy | Null] = js.native
  def getLinkedRecord(name: String, args: Variables): js.UndefOr[RecordProxy | Null] = js.native
  def getLinkedRecords(name: String): js.UndefOr[(js.Array[js.UndefOr[RecordProxy | Null]]) | Null] = js.native
  def getLinkedRecords(name: String, args: Variables): js.UndefOr[(js.Array[js.UndefOr[RecordProxy | Null]]) | Null] = js.native
  def getOrCreateLinkedRecord(name: String, typeName: String): RecordProxy = js.native
  def getOrCreateLinkedRecord(name: String, typeName: String, args: Variables): RecordProxy = js.native
  def getType(): String = js.native
  def getValue(name: String): js.Any = js.native
  def getValue(name: String, args: Variables): js.Any = js.native
  def setLinkedRecord(record: RecordProxy, name: String): RecordProxy = js.native
  def setLinkedRecord(record: RecordProxy, name: String, args: Variables): RecordProxy = js.native
  def setLinkedRecords(records: js.Array[js.UndefOr[RecordProxy | Null]], name: String): RecordProxy = js.native
  def setLinkedRecords(records: js.Array[js.UndefOr[RecordProxy | Null]], name: String, args: Variables): RecordProxy = js.native
  def setValue(value: js.Any, name: String): RecordProxy = js.native
  def setValue(value: js.Any, name: String, args: Variables): RecordProxy = js.native
}

