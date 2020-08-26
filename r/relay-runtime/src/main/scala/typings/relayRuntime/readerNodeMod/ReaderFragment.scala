package typings.relayRuntime.readerNodeMod

import typings.relayRuntime.anon.Connection
import typings.relayRuntime.relayConcreteNodeMod.GeneratedNode
import typings.relayRuntime.relayModernGraphQLTagMod._GraphQLTaggedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReaderFragment
  extends GeneratedNode
     with ReaderSelectableNode
     with _GraphQLTaggedNode {
  val abstractKey: js.UndefOr[String | Null] = js.native
  val argumentDefinitions: js.Array[ReaderArgumentDefinition] = js.native
  val kind: String = js.native
  val metadata: js.UndefOr[Connection | Null] = js.native
   // 'Fragment';
  val name: String = js.native
  val selections: js.Array[ReaderSelection] = js.native
  val `type`: String = js.native
}

object ReaderFragment {
  @scala.inline
  def apply(
    argumentDefinitions: js.Array[ReaderArgumentDefinition],
    kind: String,
    name: String,
    selections: js.Array[ReaderSelection],
    `type`: String
  ): ReaderFragment = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderFragment]
  }
  @scala.inline
  implicit class ReaderFragmentOps[Self <: ReaderFragment] (val x: Self) extends AnyVal {
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
    def setArgumentDefinitionsVarargs(value: ReaderArgumentDefinition*): Self = this.set("argumentDefinitions", js.Array(value :_*))
    @scala.inline
    def setArgumentDefinitions(value: js.Array[ReaderArgumentDefinition]): Self = this.set("argumentDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionsVarargs(value: ReaderSelection*): Self = this.set("selections", js.Array(value :_*))
    @scala.inline
    def setSelections(value: js.Array[ReaderSelection]): Self = this.set("selections", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbstractKey(value: String): Self = this.set("abstractKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbstractKey: Self = this.set("abstractKey", js.undefined)
    @scala.inline
    def setAbstractKeyNull: Self = this.set("abstractKey", null)
    @scala.inline
    def setMetadata(value: Connection): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setMetadataNull: Self = this.set("metadata", null)
  }
  
}

