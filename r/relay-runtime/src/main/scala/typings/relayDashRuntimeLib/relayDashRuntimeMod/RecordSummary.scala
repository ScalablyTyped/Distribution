package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "RecordSummary")
@js.native
class RecordSummary protected () extends js.Object {
  def this(id: DataID) = this()
  def this(id: DataID, `type`: java.lang.String) = this()
  var id: DataID = js.native
  var `type`: js.UndefOr[java.lang.String | scala.Null] = js.native
}

@JSImport("relay-runtime", "RecordSummary")
@js.native
object RecordSummary extends js.Object {
  def createFromRecord(id: relayDashRuntimeLib.relayDashRuntimeMod.DataID, record: js.Any): relayDashRuntimeLib.relayDashRuntimeMod.RecordSummary = js.native
}

