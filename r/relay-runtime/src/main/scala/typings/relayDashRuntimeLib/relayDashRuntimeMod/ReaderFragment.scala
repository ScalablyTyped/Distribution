package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderFragment
  extends GeneratedNode
     with ReaderSelectableNode
     with _GraphQLTaggedNode {
  val argumentDefinitions: js.Array[ReaderArgumentDefinition]
  val kind: java.lang.String
  val metadata: js.UndefOr[relayDashRuntimeLib.Anon_Connection | scala.Null] = js.undefined
   // 'Fragment';
  val name: java.lang.String
  val selections: js.Array[ReaderSelection]
  val `type`: java.lang.String
}

object ReaderFragment {
  @scala.inline
  def apply(
    argumentDefinitions: js.Array[ReaderArgumentDefinition],
    kind: java.lang.String,
    name: java.lang.String,
    selections: js.Array[ReaderSelection],
    `type`: java.lang.String,
    metadata: relayDashRuntimeLib.Anon_Connection = null
  ): ReaderFragment = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions, kind = kind, name = name, selections = selections)
    __obj.updateDynamic("type")(`type`)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[ReaderFragment]
  }
}

