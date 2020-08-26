package typings.relayRuntime.readerNodeMod

import typings.relayRuntime.anon.ConnectionRefetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReaderPaginationFragment extends ReaderFragment {
  @JSName("metadata")
  val metadata_ReaderPaginationFragment: ConnectionRefetch = js.native
}

object ReaderPaginationFragment {
  @scala.inline
  def apply(
    argumentDefinitions: js.Array[ReaderArgumentDefinition],
    kind: String,
    metadata: ConnectionRefetch,
    name: String,
    selections: js.Array[ReaderSelection],
    `type`: String
  ): ReaderPaginationFragment = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderPaginationFragment]
  }
  @scala.inline
  implicit class ReaderPaginationFragmentOps[Self <: ReaderPaginationFragment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMetadata(value: ConnectionRefetch): Self = this.set("metadata", value.asInstanceOf[js.Any])
  }
  
}

