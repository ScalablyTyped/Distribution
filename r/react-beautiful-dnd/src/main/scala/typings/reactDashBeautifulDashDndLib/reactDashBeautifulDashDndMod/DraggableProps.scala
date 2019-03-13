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
  var shouldRespectForceTouch: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[TypeId] = js.undefined
  def children(provided: DraggableProvided, snapshot: DraggableStateSnapshot): reactLib.reactMod.ReactNs.ReactElement[_]
}

object DraggableProps {
  @scala.inline
  def apply(
    children: (DraggableProvided, DraggableStateSnapshot) => reactLib.reactMod.ReactNs.ReactElement[_],
    draggableId: DroppableId,
    index: scala.Double,
    disableInteractiveElementBlocking: js.UndefOr[scala.Boolean] = js.undefined,
    isDragDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    shouldRespectForceTouch: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: TypeId = null
  ): DraggableProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), draggableId = draggableId, index = index)
    if (!js.isUndefined(disableInteractiveElementBlocking)) __obj.updateDynamic("disableInteractiveElementBlocking")(disableInteractiveElementBlocking)
    if (!js.isUndefined(isDragDisabled)) __obj.updateDynamic("isDragDisabled")(isDragDisabled)
    if (!js.isUndefined(shouldRespectForceTouch)) __obj.updateDynamic("shouldRespectForceTouch")(shouldRespectForceTouch)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DraggableProps]
  }
}

