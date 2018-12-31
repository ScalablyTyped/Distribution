package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "RecordInspector")
@js.native
class RecordInspector protected () extends js.Object {
  def this(sourceInspector: RelayRecordSourceInspector, record: RelayInMemoryRecordSource) = this()
  /**
    * Get the cache id of the given record. For types that implement the `Node`
    * interface (or that have an `id`) this will be `id`, for other types it will be
    * a synthesized identifier based on the field path from the nearest ancestor
    * record that does have an `id`.
    */
  def getDataID(): DataID = js.native
  /**
    * Returns a list of the fields that have been fetched on the current record.
    */
  def getFields(): js.Array[java.lang.String] = js.native
  /**
    * Returns an inspector for the given scalar "linked" field (a field whose
    * value is another RelayInMemoryRecordSource instead of a scalar). May throw if the field is
    * present but not a scalar linked record.
    */
  def getLinkedRecord(name: java.lang.String): RecordInspector | scala.Null = js.native
  def getLinkedRecord(name: java.lang.String, args: Variables): RecordInspector | scala.Null = js.native
  /**
    * Returns an array of inspectors for the given plural "linked" field (a field
    * whose value is an array of Records instead of a scalar). May throw if the
    * field is  present but not a plural linked record.
    */
  def getLinkedRecords(name: java.lang.String): js.Array[RecordInspector] | scala.Null = js.native
  def getLinkedRecords(name: java.lang.String, args: Variables): js.Array[RecordInspector] | scala.Null = js.native
  /**
    * Returns the type of the record.
    */
  def getType(): java.lang.String = js.native
  /**
    * Returns the value of a scalar field. May throw if the given field is
    * present but not actually scalar.
    */
  def getValue(name: java.lang.String): js.Any = js.native
  def getValue(name: java.lang.String, args: Variables): js.Any = js.native
  /**
    * Returns a copy of the internal representation of the record.
    */
  def inspect(): js.Any = js.native
}

