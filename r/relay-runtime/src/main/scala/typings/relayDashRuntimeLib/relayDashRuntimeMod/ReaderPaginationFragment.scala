package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderPaginationFragment extends ReaderFragment {
  @JSName("metadata")
  val metadata_ReaderPaginationFragment: relayDashRuntimeLib.Anon_ConnectionRefetchAnonConnectionReaderPaginationMetadata
}

object ReaderPaginationFragment {
  @scala.inline
  def apply(
    argumentDefinitions: js.Array[ReaderArgumentDefinition],
    kind: java.lang.String,
    metadata: relayDashRuntimeLib.Anon_ConnectionRefetchAnonConnectionReaderPaginationMetadata,
    name: java.lang.String,
    selections: js.Array[ReaderSelection],
    `type`: java.lang.String
  ): ReaderPaginationFragment = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions, kind = kind, metadata = metadata, name = name, selections = selections)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReaderPaginationFragment]
  }
}

