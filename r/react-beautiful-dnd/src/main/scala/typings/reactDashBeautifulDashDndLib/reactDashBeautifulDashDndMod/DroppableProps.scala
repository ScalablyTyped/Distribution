package typings
package reactDashBeautifulDashDndLib.reactDashBeautifulDashDndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DroppableProps extends js.Object {
  var direction: js.UndefOr[
    reactDashBeautifulDashDndLib.reactDashBeautifulDashDndLibStrings.vertical | reactDashBeautifulDashDndLib.reactDashBeautifulDashDndLibStrings.horizontal
  ] = js.undefined
  var droppableId: DroppableId
  var ignoreContainerClipping: js.UndefOr[scala.Boolean] = js.undefined
  var isCombineEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var isDropDisabled: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[TypeId] = js.undefined
  def children(provided: DroppableProvided, snapshot: DroppableStateSnapshot): reactLib.reactMod.ReactNs.ReactElement[_]
}

object DroppableProps {
  @scala.inline
  def apply(
    children: (DroppableProvided, DroppableStateSnapshot) => reactLib.reactMod.ReactNs.ReactElement[_],
    droppableId: DroppableId,
    direction: reactDashBeautifulDashDndLib.reactDashBeautifulDashDndLibStrings.vertical | reactDashBeautifulDashDndLib.reactDashBeautifulDashDndLibStrings.horizontal = null,
    ignoreContainerClipping: js.UndefOr[scala.Boolean] = js.undefined,
    isCombineEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    isDropDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: TypeId = null
  ): DroppableProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), droppableId = droppableId)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreContainerClipping)) __obj.updateDynamic("ignoreContainerClipping")(ignoreContainerClipping)
    if (!js.isUndefined(isCombineEnabled)) __obj.updateDynamic("isCombineEnabled")(isCombineEnabled)
    if (!js.isUndefined(isDropDisabled)) __obj.updateDynamic("isDropDisabled")(isDropDisabled)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DroppableProps]
  }
}

