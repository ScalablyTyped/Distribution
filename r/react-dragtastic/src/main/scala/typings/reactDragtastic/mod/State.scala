package typings.reactDragtastic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  /** The id of the currently dragging element. */
  var currentlyDraggingId: js.UndefOr[Id] = js.native
  /** The accepts property of the <Droppable/> currently being hovered. */
  var currentlyHoveredDroppableAccepts: js.UndefOr[Accepts] = js.native
  /** The id of the <Droppable/> currently being hovered. */
  var currentlyHoveredDroppableId: js.UndefOr[Id] = js.native
  /** Data from the data property of the <Draggable/> which is currently active. null if not dragging. */
  var data: js.Any = js.native
  /** A boolean representing whether the user is currently dragging. */
  var isDragging: Boolean = js.native
  /** The user's initial horizontal position on the page when they started dragging. */
  var startingX: Double = js.native
  /** The user's initial vertical position on the page when they started dragging. */
  var startingY: Double = js.native
  /** The type of the component being currently dragged. null if not dragging. */
  var `type`: js.UndefOr[Type] = js.native
  /** The user's current horizontal position on the page. */
  var x: Double = js.native
  /** The user's current vertical position on the page. */
  var y: Double = js.native
}

object State {
  @scala.inline
  def apply(data: js.Any, isDragging: Boolean, startingX: Double, startingY: Double, x: Double, y: Double): State = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], startingX = startingX.asInstanceOf[js.Any], startingY = startingY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDragging(value: Boolean): Self = this.set("isDragging", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartingX(value: Double): Self = this.set("startingX", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartingY(value: Double): Self = this.set("startingY", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentlyDraggingId(value: Id): Self = this.set("currentlyDraggingId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentlyDraggingId: Self = this.set("currentlyDraggingId", js.undefined)
    @scala.inline
    def setCurrentlyHoveredDroppableAcceptsVarargs(value: String*): Self = this.set("currentlyHoveredDroppableAccepts", js.Array(value :_*))
    @scala.inline
    def setCurrentlyHoveredDroppableAccepts(value: Accepts): Self = this.set("currentlyHoveredDroppableAccepts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentlyHoveredDroppableAccepts: Self = this.set("currentlyHoveredDroppableAccepts", js.undefined)
    @scala.inline
    def setCurrentlyHoveredDroppableId(value: Id): Self = this.set("currentlyHoveredDroppableId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentlyHoveredDroppableId: Self = this.set("currentlyHoveredDroppableId", js.undefined)
    @scala.inline
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

