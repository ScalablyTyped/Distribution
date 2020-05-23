package typings.reactDragtastic.mod

import typings.react.mod.ReactNode
import typings.reactDragtastic.anon.StateisActivebooleanevent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableProps extends js.Object {
  /** Data of any type which will be passed to the onDrop function of any <Droppable/> which accepts this <Draggable/>'s type. */
  var data: js.UndefOr[js.Any] = js.undefined
  /** An optional int representing the distance in pixels the user's pointer must travel to activate the draggable. Defaults to 8 */
  var delay: js.UndefOr[Double] = js.undefined
  /** An id which will be used in the draggable zone's target <DragComponent/> */
  var id: js.UndefOr[Id] = js.undefined
  /** A function which will be called every time the user's cursor moves while dragging. */
  var onDrag: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** A function which will be called when the <Draggable/> zone is deactivated (The user stopped dragging). */
  var onDragEnd: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.undefined
  /** A function which will be called when the <Draggable/> zone is activated (The user started dragging). */
  var onDragStart: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.undefined
  /**
    * An optional array of strings. For performance reasons you can limit which keys in the dragState your component subscribes to.
    * For example, you may pass ['type', 'data'] to only rerender if these keys change.
    */
  var subscribeTo: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** A string, or array of strings, used to limit which droppable zones will accept <DragComponent/>'s attached to this draggable. */
  var `type`: js.UndefOr[Type] = js.undefined
  def children(arg: StateisActivebooleanevent): ReactNode
}

object DraggableProps {
  @scala.inline
  def apply(
    children: StateisActivebooleanevent => ReactNode,
    data: js.Any = null,
    delay: js.UndefOr[Double] = js.undefined,
    id: Id = null,
    onDrag: () => Unit = null,
    onDragEnd: /* data */ js.Any => Unit = null,
    onDragStart: /* data */ js.Any => Unit = null,
    subscribeTo: js.UndefOr[Null | js.Array[String]] = js.undefined,
    `type`: Type = null
  ): DraggableProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction0(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (!js.isUndefined(subscribeTo)) __obj.updateDynamic("subscribeTo")(subscribeTo.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableProps]
  }
}

