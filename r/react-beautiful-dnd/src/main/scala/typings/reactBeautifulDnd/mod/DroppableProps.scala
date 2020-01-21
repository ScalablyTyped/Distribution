package typings.reactBeautifulDnd.mod

import typings.react.mod.ReactElement
import typings.reactBeautifulDnd.reactBeautifulDndStrings.horizontal
import typings.reactBeautifulDnd.reactBeautifulDndStrings.vertical
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
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), droppableId = droppableId.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreContainerClipping)) __obj.updateDynamic("ignoreContainerClipping")(ignoreContainerClipping.asInstanceOf[js.Any])
    if (!js.isUndefined(isCombineEnabled)) __obj.updateDynamic("isCombineEnabled")(isCombineEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isDropDisabled)) __obj.updateDynamic("isDropDisabled")(isDropDisabled.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableProps]
  }
}

