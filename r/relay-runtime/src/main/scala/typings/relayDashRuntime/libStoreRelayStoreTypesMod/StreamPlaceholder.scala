package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationSelectableNode
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import typings.relayDashRuntime.relayDashRuntimeStrings.stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamPlaceholder extends IncrementalDataPlaceholder {
  var kind: stream
  var label: String
  var node: NormalizationSelectableNode
  var parentID: DataID
  var path: js.Array[String]
  var variables: Variables
}

object StreamPlaceholder {
  @scala.inline
  def apply(
    kind: stream,
    label: String,
    node: NormalizationSelectableNode,
    parentID: DataID,
    path: js.Array[String],
    variables: Variables
  ): StreamPlaceholder = {
    val __obj = js.Dynamic.literal(kind = kind, label = label, node = node, parentID = parentID, path = path, variables = variables)
  
    __obj.asInstanceOf[StreamPlaceholder]
  }
}

