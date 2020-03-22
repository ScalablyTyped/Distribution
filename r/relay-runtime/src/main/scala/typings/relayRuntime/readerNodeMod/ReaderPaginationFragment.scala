package typings.relayRuntime.readerNodeMod

import typings.relayRuntime.AnonConnectionRefetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderPaginationFragment extends ReaderFragment {
  @JSName("metadata")
  val metadata_ReaderPaginationFragment: AnonConnectionRefetch
}

object ReaderPaginationFragment {
  @scala.inline
  def apply(
    argumentDefinitions: js.Array[ReaderArgumentDefinition],
    kind: String,
    metadata: AnonConnectionRefetch,
    name: String,
    selections: js.Array[ReaderSelection],
    `type`: String
  ): ReaderPaginationFragment = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderPaginationFragment]
  }
}

