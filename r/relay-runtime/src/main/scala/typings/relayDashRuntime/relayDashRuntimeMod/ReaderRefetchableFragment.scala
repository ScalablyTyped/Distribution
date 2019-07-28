package typings.relayDashRuntime.relayDashRuntimeMod

import typings.relayDashRuntime.Anon_ConnectionRefetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderRefetchableFragment extends ReaderFragment {
  @JSName("metadata")
  val metadata_ReaderRefetchableFragment: Anon_ConnectionRefetch
}

object ReaderRefetchableFragment {
  @scala.inline
  def apply(
    argumentDefinitions: js.Array[ReaderArgumentDefinition],
    kind: String,
    metadata: Anon_ConnectionRefetch,
    name: String,
    selections: js.Array[ReaderSelection],
    `type`: String
  ): ReaderRefetchableFragment = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions, kind = kind, metadata = metadata, name = name, selections = selections)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReaderRefetchableFragment]
  }
}

