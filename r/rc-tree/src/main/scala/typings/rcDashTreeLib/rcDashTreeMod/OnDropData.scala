package typings
package rcDashTreeLib.rcDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDropData extends js.Object {
  var dragNode: InternalTreeNode
  var dragNodesKeys: js.Array[java.lang.String]
  var dropPosition: scala.Double
  var dropToGap: js.UndefOr[scala.Boolean] = js.undefined
  var event: reactLib.Event
  var node: InternalTreeNode
}

object OnDropData {
  @scala.inline
  def apply(
    dragNode: InternalTreeNode,
    dragNodesKeys: js.Array[java.lang.String],
    dropPosition: scala.Double,
    event: reactLib.Event,
    node: InternalTreeNode,
    dropToGap: js.UndefOr[scala.Boolean] = js.undefined
  ): OnDropData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dragNode")(dragNode)
    __obj.updateDynamic("dragNodesKeys")(dragNodesKeys)
    __obj.updateDynamic("dropPosition")(dropPosition)
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("node")(node)
    if (!js.isUndefined(dropToGap)) __obj.updateDynamic("dropToGap")(dropToGap)
    __obj.asInstanceOf[OnDropData]
  }
}

