package typings.relayDashRuntime.relayDashRuntimeMod

import typings.relayDashRuntime.Anon_Connection
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
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions, kind = kind, name = name, selections = selections)
    __obj.updateDynamic("type")(`type`)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[ReaderFragment]
  }
}

