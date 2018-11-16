package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "RelayRecordSourceInspector")
@js.native
class RelayRecordSourceInspector protected () extends js.Object {
  def this(source: RecordSource) = this()
  /**
       * Returns an inspector for the record with the given id, or null/undefined if
       * that record is deleted/unfetched.
       */
  def get(dataID: DataID): RecordInspector | scala.Null = js.native
  /**
       * Returns a list of "<id>: <type>" for each record in the store that has an
       * `id`.
       */
  def getNodes(): js.Array[RecordSummary] = js.native
  /**
       * Returns a list of "<id>: <type>" for all records in the store including
       * those that do not have an `id`.
       */
  def getRecords(): js.Array[RecordSummary] = js.native
  /**
       * Returns an inspector for the synthesized "root" object, allowing access to
       * e.g. the `viewer` object or the results of other fields on the "Query"
       * type.
       */
  def getRoot(): RecordInspector = js.native
}

@JSImport("relay-runtime", "RelayRecordSourceInspector")
@js.native
object RelayRecordSourceInspector extends js.Object {
  def getForEnvironment(environment: relayDashRuntimeLib.relayDashRuntimeMod.Environment): relayDashRuntimeLib.relayDashRuntimeMod.RelayRecordSourceInspector = js.native
}

