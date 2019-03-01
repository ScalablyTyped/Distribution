package typings
package reactDashDragtasticLib.reactDashDragtasticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableProps extends js.Object {
  /** Data of any type which will be passed to the onDrop function of any <Droppable/> which accepts this <Draggable/>'s type. */
  var data: js.UndefOr[js.Any] = js.undefined
  /** An optional int representing the distance in pixels the user's pointer must travel to activate the draggable. Defaults to 8 */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /** An id which will be used in the draggable zone's target <DragComponent/> */
  var id: js.UndefOr[Id] = js.undefined
  /** A function which will be called every time the user's cursor moves while dragging. */
  var onDrag: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** A function which will be called when the <Draggable/> zone is deactivated (The user stopped dragging). */
  var onDragEnd: js.UndefOr[js.Function1[/* data */ js.Any, scala.Unit]] = js.undefined
  /** A function which will be called when the <Draggable/> zone is activated (The user started dragging). */
  var onDragStart: js.UndefOr[js.Function1[/* data */ js.Any, scala.Unit]] = js.undefined
  /**
    * An optional array of strings. For performance reasons you can limit which keys in the dragState your component subscribes to.
    * For example, you may pass ['type', 'data'] to only rerender if these keys change.
    */
  var subscribeTo: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
  /** A string, or array of strings, used to limit which droppable zones will accept <DragComponent/>'s attached to this draggable. */
  var `type`: js.UndefOr[Type] = js.undefined
  def children(arg: State with reactDashDragtasticLib.Anon_Events): reactLib.reactMod.ReactNs.ReactNode
}

object DraggableProps {
  @scala.inline
  def apply(
    children: js.Function1[State with reactDashDragtasticLib.Anon_Events, reactLib.reactMod.ReactNs.ReactNode],
    data: js.Any = null,
    delay: scala.Int | scala.Double = null,
    id: Id = null,
    onDrag: js.Function0[scala.Unit] = null,
    onDragEnd: js.Function1[/* data */ js.Any, scala.Unit] = null,
    onDragStart: js.Function1[/* data */ js.Any, scala.Unit] = null,
    subscribeTo: js.Array[java.lang.String] = null,
    `type`: Type = null
  ): DraggableProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    if (data != null) __obj.updateDynamic("data")(data)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (subscribeTo != null) __obj.updateDynamic("subscribeTo")(subscribeTo)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableProps]
  }
}

