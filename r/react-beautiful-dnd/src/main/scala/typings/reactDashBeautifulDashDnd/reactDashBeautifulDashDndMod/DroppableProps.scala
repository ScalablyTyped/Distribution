package typings.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod

import typings.react.reactMod.ReactElement
import typings.reactDashBeautifulDashDnd.reactDashBeautifulDashDndStrings.horizontal
import typings.reactDashBeautifulDashDnd.reactDashBeautifulDashDndStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DroppableProps extends js.Object {
  var direction: js.UndefOr[vertical | horizontal] = js.undefined
  var droppableId: DroppableId
  var ignoreContainerClipping: js.UndefOr[Boolean] = js.undefined
  var isCombineEnabled: js.UndefOr[Boolean] = js.undefined
  var isDropDisabled: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[TypeId] = js.undefined
  def children(provided: DroppableProvided, snapshot: DroppableStateSnapshot): ReactElement
}

object DroppableProps {
  @scala.inline
  def apply(
    children: (DroppableProvided, DroppableStateSnapshot) => ReactElement,
    droppableId: DroppableId,
    direction: vertical | horizontal = null,
    ignoreContainerClipping: js.UndefOr[Boolean] = js.undefined,
    isCombineEnabled: js.UndefOr[Boolean] = js.undefined,
    isDropDisabled: js.UndefOr[Boolean] = js.undefined,
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

