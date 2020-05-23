package typings.relayRuntime.readerNodeMod

import typings.relayRuntime.anon.Refetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderRefetchableFragment extends ReaderFragment {
  @JSName("metadata")
  val metadata_ReaderRefetchableFragment: Refetch
}

object ReaderRefetchableFragment {
  @scala.inline
  def apply(
    argumentDefinitions: js.Array[ReaderArgumentDefinition],
    kind: String,
    metadata: Refetch,
    name: String,
    selections: js.Array[ReaderSelection],
    `type`: String
  ): ReaderRefetchableFragment = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderRefetchableFragment]
  }
}

