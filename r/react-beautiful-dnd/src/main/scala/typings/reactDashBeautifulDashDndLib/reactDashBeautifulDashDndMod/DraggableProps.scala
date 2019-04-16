package typings
package reactDashBeautifulDashDndLib.reactDashBeautifulDashDndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableProps extends js.Object {
  var disableInteractiveElementBlocking: js.UndefOr[scala.Boolean] = js.undefined
  var draggableId: DroppableId
  var index: scala.Double
  var isDragDisabled: js.UndefOr[scala.Boolean] = js.undefined
  var shouldRespectForcePress: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[TypeId] = js.undefined
  def children(provided: DraggableProvided, snapshot: DraggableStateSnapshot): reactLib.reactMod.ReactElement[stdLib.HTMLElement]
}

object DraggableProps {
  @scala.inline
  def apply(
    children: (DraggableProvided, DraggableStateSnapshot) => reactLib.reactMod.ReactElement[stdLib.HTMLElement],
    draggableId: DroppableId,
    index: scala.Double,
    disableInteractiveElementBlocking: js.UndefOr[scala.Boolean] = js.undefined,
    isDragDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    shouldRespectForcePress: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: TypeId = null
  ): DraggableProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), draggableId = draggableId, index = index)
    if (!js.isUndefined(disableInteractiveElementBlocking)) __obj.updateDynamic("disableInteractiveElementBlocking")(disableInteractiveElementBlocking)
    if (!js.isUndefined(isDragDisabled)) __obj.updateDynamic("isDragDisabled")(isDragDisabled)
    if (!js.isUndefined(shouldRespectForcePress)) __obj.updateDynamic("shouldRespectForcePress")(shouldRespectForcePress)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DraggableProps]
  }
}

