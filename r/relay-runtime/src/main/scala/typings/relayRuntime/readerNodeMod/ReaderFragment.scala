package typings.relayRuntime.readerNodeMod

import typings.relayRuntime.AnonConnection
import typings.relayRuntime.relayConcreteNodeMod.GeneratedNode
import typings.relayRuntime.relayModernGraphQLTagMod._GraphQLTaggedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderFragment
  extends GeneratedNode
     with ReaderSelectableNode
     with _GraphQLTaggedNode {
  val argumentDefinitions: js.Array[ReaderArgumentDefinition]
  val kind: String
  val metadata: js.UndefOr[AnonConnection | Null] = js.undefined
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
    metadata: AnonConnection = null
  ): ReaderFragment = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderFragment]
  }
}

