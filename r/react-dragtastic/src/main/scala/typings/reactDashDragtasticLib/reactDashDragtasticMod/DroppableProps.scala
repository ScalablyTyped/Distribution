package typings
package reactDashDragtasticLib.reactDashDragtasticMod

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
  var onDragEnter: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * A function which will be called when the user's cursor leaves the <Droppable/> while dragging.
    * This function will be called regardless of whether the droppable accepts the draggable currently being dragged.
    */
  var onDragLeave: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** A function which will be called when a user drops a <DragComponent/> on this <Droppable/> with an accepted type. */
  var onDrop: js.UndefOr[js.Function1[/* data */ js.Any, scala.Unit]] = js.undefined
  /**
    * An optional array of strings. For performance reasons you can limit which keys in the dragState your component subscribes to.
    * For example, you may pass ['type', 'data'] to only rerender if these keys change.
    */
  var subscribeTo: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
  def children(arg: State with reactDashDragtasticLib.Anon_EventsIsOver): reactLib.reactMod.ReactNs.ReactNode
}

object DroppableProps {
  @scala.inline
  def apply(
    children: js.Function1[
      State with reactDashDragtasticLib.Anon_EventsIsOver, 
      reactLib.reactMod.ReactNs.ReactNode
    ],
    accepts: Accepts = null,
    id: Id = null,
    onDragEnter: js.Function0[scala.Unit] = null,
    onDragLeave: js.Function0[scala.Unit] = null,
    onDrop: js.Function1[/* data */ js.Any, scala.Unit] = null,
    subscribeTo: js.Array[java.lang.String] = null
  ): DroppableProps = {
    val __obj = js.Dynamic.literal(children = children)
    if (accepts != null) __obj.updateDynamic("accepts")(accepts.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter)
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (subscribeTo != null) __obj.updateDynamic("subscribeTo")(subscribeTo)
    __obj.asInstanceOf[DroppableProps]
  }
}

