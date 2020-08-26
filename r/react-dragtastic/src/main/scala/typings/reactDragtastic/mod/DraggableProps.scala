package typings.reactDragtastic.mod

import typings.react.mod.ReactNode
import typings.reactDragtastic.anon.StateisActivebooleanevent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggableProps extends js.Object {
  /** Data of any type which will be passed to the onDrop function of any <Droppable/> which accepts this <Draggable/>'s type. */
  var data: js.UndefOr[js.Any] = js.native
  /** An optional int representing the distance in pixels the user's pointer must travel to activate the draggable. Defaults to 8 */
  var delay: js.UndefOr[Double] = js.native
  /** An id which will be used in the draggable zone's target <DragComponent/> */
  var id: js.UndefOr[Id] = js.native
  /** A function which will be called every time the user's cursor moves while dragging. */
  var onDrag: js.UndefOr[js.Function0[Unit]] = js.native
  /** A function which will be called when the <Draggable/> zone is deactivated (The user stopped dragging). */
  var onDragEnd: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
  /** A function which will be called when the <Draggable/> zone is activated (The user started dragging). */
  var onDragStart: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
  /**
    * An optional array of strings. For performance reasons you can limit which keys in the dragState your component subscribes to.
    * For example, you may pass ['type', 'data'] to only rerender if these keys change.
    */
  var subscribeTo: js.UndefOr[js.Array[String] | Null] = js.native
  /** A string, or array of strings, used to limit which droppable zones will accept <DragComponent/>'s attached to this draggable. */
  var `type`: js.UndefOr[Type] = js.native
  def children(arg: StateisActivebooleanevent): ReactNode = js.native
}

object DraggableProps {
  @scala.inline
  def apply(children: StateisActivebooleanevent => ReactNode): DraggableProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[DraggableProps]
  }
  @scala.inline
  implicit class DraggablePropsOps[Self <: DraggableProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: StateisActivebooleanevent => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setId(value: Id): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOnDrag(value: () => Unit): Self = this.set("onDrag", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    @scala.inline
    def setOnDragEnd(value: /* data */ js.Any => Unit): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    @scala.inline
    def setOnDragStart(value: /* data */ js.Any => Unit): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    @scala.inline
    def setSubscribeToVarargs(value: String*): Self = this.set("subscribeTo", js.Array(value :_*))
    @scala.inline
    def setSubscribeTo(value: js.Array[String]): Self = this.set("subscribeTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscribeTo: Self = this.set("subscribeTo", js.undefined)
    @scala.inline
    def setSubscribeToNull: Self = this.set("subscribeTo", null)
    @scala.inline
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

