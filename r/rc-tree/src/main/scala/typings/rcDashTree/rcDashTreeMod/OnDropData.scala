package typings.rcDashTree.rcDashTreeMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDropData extends js.Object {
  var dragNode: InternalTreeNode
  var dragNodesKeys: js.Array[String]
  var dropPosition: Double
  var dropToGap: js.UndefOr[Boolean] = js.undefined
  var event: Event
  var node: InternalTreeNode
}

object OnDropData {
  @scala.inline
  def apply(
    dragNode: InternalTreeNode,
    dragNodesKeys: js.Array[String],
    dropPosition: Double,
    event: Event,
    node: InternalTreeNode,
    dropToGap: js.UndefOr[Boolean] = js.undefined
  ): OnDropData = {
    val __obj = js.Dynamic.literal(dragNode = dragNode.asInstanceOf[js.Any], dragNodesKeys = dragNodesKeys.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (!js.isUndefined(dropToGap)) __obj.updateDynamic("dropToGap")(dropToGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDropData]
  }
}

