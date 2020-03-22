package typings.reactDragtastic

import typings.reactDragtastic.mod.Accepts
import typings.reactDragtastic.mod.Id
import typings.reactDragtastic.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-dragtastic.react-dragtastic.State & {  isOverAccepted  :boolean} */
trait StateisOverAcceptedboolea extends js.Object {
  /** The id of the currently dragging element. */
  var currentlyDraggingId: js.UndefOr[Id] = js.undefined
  /** The accepts property of the <Droppable/> currently being hovered. */
  var currentlyHoveredDroppableAccepts: js.UndefOr[Accepts] = js.undefined
  /** The id of the <Droppable/> currently being hovered. */
  var currentlyHoveredDroppableId: js.UndefOr[Id] = js.undefined
  /** Data from the data property of the <Draggable/> which is currently active. null if not dragging. */
  var data: js.Any
  /** A boolean representing whether the user is currently dragging. */
  var isDragging: Boolean
  /** A boolean representing whether the user is currently hovering a <Droppable/> that accepts the type of the currently active <Draggable/> */
  var isOverAccepted: Boolean
  /** The user's initial horizontal position on the page when they started dragging. */
  var startingX: Double
  /** The user's initial vertical position on the page when they started dragging. */
  var startingY: Double
  /** The type of the component being currently dragged. null if not dragging. */
  var `type`: js.UndefOr[Type] = js.undefined
  /** The user's current horizontal position on the page. */
  var x: Double
  /** The user's current vertical position on the page. */
  var y: Double
}

object StateisOverAcceptedboolea {
  @scala.inline
  def apply(
    data: js.Any,
    isDragging: Boolean,
    isOverAccepted: Boolean,
    startingX: Double,
    startingY: Double,
    x: Double,
    y: Double,
    currentlyDraggingId: Id = null,
    currentlyHoveredDroppableAccepts: Accepts = null,
    currentlyHoveredDroppableId: Id = null,
    `type`: Type = null
  ): StateisOverAcceptedboolea = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isOverAccepted = isOverAccepted.asInstanceOf[js.Any], startingX = startingX.asInstanceOf[js.Any], startingY = startingY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (currentlyDraggingId != null) __obj.updateDynamic("currentlyDraggingId")(currentlyDraggingId.asInstanceOf[js.Any])
    if (currentlyHoveredDroppableAccepts != null) __obj.updateDynamic("currentlyHoveredDroppableAccepts")(currentlyHoveredDroppableAccepts.asInstanceOf[js.Any])
    if (currentlyHoveredDroppableId != null) __obj.updateDynamic("currentlyHoveredDroppableId")(currentlyHoveredDroppableId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateisOverAcceptedboolea]
  }
}

