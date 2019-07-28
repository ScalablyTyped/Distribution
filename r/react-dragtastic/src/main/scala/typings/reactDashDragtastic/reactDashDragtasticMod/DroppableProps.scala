package typings.reactDashDragtastic.reactDashDragtasticMod

import typings.react.reactMod.ReactNode
import typings.reactDashDragtastic.Anon_EventsIsOver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DroppableProps extends js.Object {
  /** A string type corresponding to the type property of the <Draggable/> zone for which this <Droppable/> should accept drop events. */
  var accepts: js.UndefOr[Accepts] = js.undefined
  /** An id which will be used in the draggable zone's target <DragComponent/> */
  var id: js.UndefOr[Id] = js.undefined
  /**
    * A function which will be called when the user's cursor enters the <Droppable/> while dragging.
    * This function will be called regardless of whether the droppable accepts the draggable currently being dragged.
    */
  var onDragEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A function which will be called when the user's cursor leaves the <Droppable/> while dragging.
    * This function will be called regardless of whether the droppable accepts the draggable currently being dragged.
    */
  var onDragLeave: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** A function which will be called when a user drops a <DragComponent/> on this <Droppable/> with an accepted type. */
  var onDrop: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.undefined
  /**
    * An optional array of strings. For performance reasons you can limit which keys in the dragState your component subscribes to.
    * For example, you may pass ['type', 'data'] to only rerender if these keys change.
    */
  var subscribeTo: js.UndefOr[js.Array[String] | Null] = js.undefined
  def children(arg: State with Anon_EventsIsOver): ReactNode
}

object DroppableProps {
  @scala.inline
  def apply(
    children: State with Anon_EventsIsOver => ReactNode,
    accepts: Accepts = null,
    id: Id = null,
    onDragEnter: () => Unit = null,
    onDragLeave: () => Unit = null,
    onDrop: /* data */ js.Any => Unit = null,
    subscribeTo: js.Array[String] = null
  ): DroppableProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (accepts != null) __obj.updateDynamic("accepts")(accepts.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction0(onDragEnter))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction0(onDragLeave))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (subscribeTo != null) __obj.updateDynamic("subscribeTo")(subscribeTo)
    __obj.asInstanceOf[DroppableProps]
  }
}

