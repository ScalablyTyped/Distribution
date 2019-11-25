package typings.relayDashRuntime.libUtilReaderNodeMod

import typings.relayDashRuntime.Anon_Connection
import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod._GraphQLTaggedNode
import typings.relayDashRuntime.libUtilRelayConcreteNodeMod.GeneratedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderFragment
  extends GeneratedNode
     with ReaderSelectableNode
     with _GraphQLTaggedNode {
  val argumentDefinitions: js.Array[ReaderArgumentDefinition]
  val kind: String
  val metadata: js.UndefOr[Anon_Connection | Null] = js.undefined
   // 'Fragment';
  val name: String
  val selections: js.Array[ReaderSelection]
  val `type`: String
}

object ReaderFragment {
  @scala.inline
  def apply(
    argumentDefinitions: js.Array[ReaderArgumentDefinition],
    kind: String,
    name: String,
    selections: js.Array[ReaderSelection],
    `type`: String,
    metadata: Anon_Connection = null
  ): ReaderFragment = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderFragment]
  }
}

