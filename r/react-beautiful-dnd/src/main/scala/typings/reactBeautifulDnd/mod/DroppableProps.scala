package typings.reactBeautifulDnd.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DroppableProps extends js.Object {
  var direction: js.UndefOr[Direction] = js.undefined
  var droppableId: DroppableId
  var getContainerForClone: js.UndefOr[js.Function0[ReactElement]] = js.undefined
  var ignoreContainerClipping: js.UndefOr[Boolean] = js.undefined
  var isCombineEnabled: js.UndefOr[Boolean] = js.undefined
  var isDropDisabled: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[DroppableMode] = js.undefined
  var renderClone: js.UndefOr[DraggableChildrenFn] = js.undefined
  var `type`: js.UndefOr[TypeId] = js.undefined
  def children(provided: DroppableProvided, snapshot: DroppableStateSnapshot): ReactElement
}

object DroppableProps {
  @scala.inline
  def apply(
    children: (DroppableProvided, DroppableStateSnapshot) => ReactElement,
    droppableId: DroppableId,
    direction: Direction = null,
    getContainerForClone: () => ReactElement = null,
    ignoreContainerClipping: js.UndefOr[Boolean] = js.undefined,
    isCombineEnabled: js.UndefOr[Boolean] = js.undefined,
    isDropDisabled: js.UndefOr[Boolean] = js.undefined,
    mode: DroppableMode = null,
    renderClone: (/* provided */ DraggableProvided, /* snapshot */ DraggableStateSnapshot, /* rubric */ DraggableRubric) => ReactElement = null,
    `type`: TypeId = null
  ): DroppableProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), droppableId = droppableId.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (getContainerForClone != null) __obj.updateDynamic("getContainerForClone")(js.Any.fromFunction0(getContainerForClone))
    if (!js.isUndefined(ignoreContainerClipping)) __obj.updateDynamic("ignoreContainerClipping")(ignoreContainerClipping.asInstanceOf[js.Any])
    if (!js.isUndefined(isCombineEnabled)) __obj.updateDynamic("isCombineEnabled")(isCombineEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isDropDisabled)) __obj.updateDynamic("isDropDisabled")(isDropDisabled.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (renderClone != null) __obj.updateDynamic("renderClone")(js.Any.fromFunction3(renderClone))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableProps]
  }
}

