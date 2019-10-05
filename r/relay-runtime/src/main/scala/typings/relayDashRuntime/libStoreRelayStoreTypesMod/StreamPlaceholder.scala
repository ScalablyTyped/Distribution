package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationSelectableNode
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import typings.relayDashRuntime.relayDashRuntimeStrings.stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamPlaceholder extends IncrementalDataPlaceholder {
  val kind: stream
  val label: String
  val node: NormalizationSelectableNode
  val parentID: DataID
  val path: js.Array[String]
  val variables: Variables
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

