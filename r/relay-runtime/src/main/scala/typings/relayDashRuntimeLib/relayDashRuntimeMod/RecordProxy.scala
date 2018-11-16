package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordProxy extends js.Object {
  def copyFieldsFrom(source: RecordProxy): scala.Unit = js.native
  def getDataID(): DataID = js.native
  def getLinkedRecord(name: java.lang.String): RecordProxy | scala.Null = js.native
  def getLinkedRecord(name: java.lang.String, args: Variables): RecordProxy | scala.Null = js.native
  def getLinkedRecords(name: java.lang.String): (js.Array[RecordProxy | scala.Null]) | scala.Null = js.native
  def getLinkedRecords(name: java.lang.String, args: Variables): (js.Array[RecordProxy | scala.Null]) | scala.Null = js.native
  def getOrCreateLinkedRecord(name: java.lang.String, typeName: java.lang.String): RecordProxy = js.native
  def getOrCreateLinkedRecord(name: java.lang.String, typeName: java.lang.String, args: Variables): RecordProxy = js.native
  def getType(): java.lang.String = js.native
  def getValue(name: java.lang.String): js.Any = js.native
  def getValue(name: java.lang.String, args: Variables): js.Any = js.native
  def setLinkedRecord(record: RecordProxy, name: java.lang.String): RecordProxy = js.native
  def setLinkedRecord(record: RecordProxy, name: java.lang.String, args: Variables): RecordProxy = js.native
  def setLinkedRecords(records: js.Array[RecordProxy | scala.Null], name: java.lang.String): RecordProxy = js.native
  def setLinkedRecords(records: js.Array[RecordProxy | scala.Null], name: java.lang.String, args: Variables): RecordProxy = js.native
  def setLinkedRecords(records: js.UndefOr[scala.Nothing], name: java.lang.String): RecordProxy = js.native
  def setLinkedRecords(records: js.UndefOr[scala.Nothing], name: java.lang.String, args: Variables): RecordProxy = js.native
  def setLinkedRecords(records: scala.Null, name: java.lang.String): RecordProxy = js.native
  def setLinkedRecords(records: scala.Null, name: java.lang.String, args: Variables): RecordProxy = js.native
  def setValue(value: js.Any, name: java.lang.String): RecordProxy = js.native
  def setValue(value: js.Any, name: java.lang.String, args: Variables): RecordProxy = js.native
}

