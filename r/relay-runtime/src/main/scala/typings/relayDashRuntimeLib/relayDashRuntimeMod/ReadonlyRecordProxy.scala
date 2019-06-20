package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadonlyRecordProxy extends js.Object {
  def getDataID(): DataID = js.native
  def getLinkedRecord(name: java.lang.String): js.UndefOr[RecordProxy | scala.Null] = js.native
  def getLinkedRecord(name: java.lang.String, args: Variables): js.UndefOr[RecordProxy | scala.Null] = js.native
  def getLinkedRecords(name: java.lang.String): js.UndefOr[(js.Array[js.UndefOr[RecordProxy | scala.Null]]) | scala.Null] = js.native
  def getLinkedRecords(name: java.lang.String, args: Variables): js.UndefOr[(js.Array[js.UndefOr[RecordProxy | scala.Null]]) | scala.Null] = js.native
  def getType(): java.lang.String = js.native
  def getValue(name: java.lang.String): js.Any = js.native
  def getValue(name: java.lang.String, args: Variables): js.Any = js.native
}

