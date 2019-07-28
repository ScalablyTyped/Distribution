package typings.relayDashRuntime.relayDashRuntimeMod

import typings.relayDashRuntime.Anon_ConnectionRefetchAnonConnectionReaderPaginationMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderPaginationFragment extends ReaderFragment {
  @JSName("metadata")
  val metadata_ReaderPaginationFragment: Anon_ConnectionRefetchAnonConnectionReaderPaginationMetadata
}

object ReaderPaginationFragment {
  @scala.inline
  def apply(
    argumentDefinitions: js.Array[ReaderArgumentDefinition],
    kind: String,
    metadata: Anon_ConnectionRefetchAnonConnectionReaderPaginationMetadata,
    name: String,
    selections: js.Array[ReaderSelection],
    `type`: String
  ): ReaderPaginationFragment = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions, kind = kind, metadata = metadata, name = name, selections = selections)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReaderPaginationFragment]
  }
}

