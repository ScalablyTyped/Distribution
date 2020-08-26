package typings.reactBeautifulDnd.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DroppableProps extends js.Object {
  var direction: js.UndefOr[Direction] = js.native
  var droppableId: DroppableId = js.native
  var getContainerForClone: js.UndefOr[js.Function0[ReactElement]] = js.native
  var ignoreContainerClipping: js.UndefOr[Boolean] = js.native
  var isCombineEnabled: js.UndefOr[Boolean] = js.native
  var isDropDisabled: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[DroppableMode] = js.native
  var renderClone: js.UndefOr[DraggableChildrenFn] = js.native
  var `type`: js.UndefOr[TypeId] = js.native
  def children(provided: DroppableProvided, snapshot: DroppableStateSnapshot): ReactElement = js.native
}

object DroppableProps {
  @scala.inline
  def apply(children: (DroppableProvided, DroppableStateSnapshot) => ReactElement, droppableId: DroppableId): DroppableProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), droppableId = droppableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableProps]
  }
  @scala.inline
  implicit class DroppablePropsOps[Self <: DroppableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildren(value: (DroppableProvided, DroppableStateSnapshot) => ReactElement): Self = this.set("children", js.Any.fromFunction2(value))
    @scala.inline
    def setDroppableId(value: DroppableId): Self = this.set("droppableId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: Direction): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setGetContainerForClone(value: () => ReactElement): Self = this.set("getContainerForClone", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetContainerForClone: Self = this.set("getContainerForClone", js.undefined)
    @scala.inline
    def setIgnoreContainerClipping(value: Boolean): Self = this.set("ignoreContainerClipping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreContainerClipping: Self = this.set("ignoreContainerClipping", js.undefined)
    @scala.inline
    def setIsCombineEnabled(value: Boolean): Self = this.set("isCombineEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCombineEnabled: Self = this.set("isCombineEnabled", js.undefined)
    @scala.inline
    def setIsDropDisabled(value: Boolean): Self = this.set("isDropDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDropDisabled: Self = this.set("isDropDisabled", js.undefined)
    @scala.inline
    def setMode(value: DroppableMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setRenderClone(
      value: (/* provided */ DraggableProvided, /* snapshot */ DraggableStateSnapshot, /* rubric */ DraggableRubric) => ReactElement
    ): Self = this.set("renderClone", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRenderClone: Self = this.set("renderClone", js.undefined)
    @scala.inline
    def setType(value: TypeId): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

