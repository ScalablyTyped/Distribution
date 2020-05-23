package typings.reactBeautifulDnd.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableProps extends js.Object {
  var children: DraggableChildrenFn
  var disableInteractiveElementBlocking: js.UndefOr[Boolean] = js.undefined
  var draggableId: DraggableId
  var index: Double
  var isDragDisabled: js.UndefOr[Boolean] = js.undefined
  var shouldRespectForcePress: js.UndefOr[Boolean] = js.undefined
}

object DraggableProps {
  @scala.inline
  def apply(
    children: (/* provided */ DraggableProvided, /* snapshot */ DraggableStateSnapshot, /* rubric */ DraggableRubric) => ReactElement,
    draggableId: DraggableId,
    index: Double,
    disableInteractiveElementBlocking: js.UndefOr[Boolean] = js.undefined,
    isDragDisabled: js.UndefOr[Boolean] = js.undefined,
    shouldRespectForcePress: js.UndefOr[Boolean] = js.undefined
  ): DraggableProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction3(children), draggableId = draggableId.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    if (!js.isUndefined(disableInteractiveElementBlocking)) __obj.updateDynamic("disableInteractiveElementBlocking")(disableInteractiveElementBlocking.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDragDisabled)) __obj.updateDynamic("isDragDisabled")(isDragDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRespectForcePress)) __obj.updateDynamic("shouldRespectForcePress")(shouldRespectForcePress.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableProps]
  }
}

