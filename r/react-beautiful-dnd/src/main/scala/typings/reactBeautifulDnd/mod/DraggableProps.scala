package typings.reactBeautifulDnd.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableProps extends js.Object {
  var disableInteractiveElementBlocking: js.UndefOr[Boolean] = js.undefined
  var draggableId: DroppableId
  var index: Double
  var isDragDisabled: js.UndefOr[Boolean] = js.undefined
  var shouldRespectForcePress: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[TypeId] = js.undefined
  def children(provided: DraggableProvided, snapshot: DraggableStateSnapshot): ReactElement
}

object DraggableProps {
  @scala.inline
  def apply(
    children: (DraggableProvided, DraggableStateSnapshot) => ReactElement,
    draggableId: DroppableId,
    index: Double,
    disableInteractiveElementBlocking: js.UndefOr[Boolean] = js.undefined,
    isDragDisabled: js.UndefOr[Boolean] = js.undefined,
    shouldRespectForcePress: js.UndefOr[Boolean] = js.undefined,
    `type`: TypeId = null
  ): DraggableProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), draggableId = draggableId.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    if (!js.isUndefined(disableInteractiveElementBlocking)) __obj.updateDynamic("disableInteractiveElementBlocking")(disableInteractiveElementBlocking.asInstanceOf[js.Any])
    if (!js.isUndefined(isDragDisabled)) __obj.updateDynamic("isDragDisabled")(isDragDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRespectForcePress)) __obj.updateDynamic("shouldRespectForcePress")(shouldRespectForcePress.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableProps]
  }
}

