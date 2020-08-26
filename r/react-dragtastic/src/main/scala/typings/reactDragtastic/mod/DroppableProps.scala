package typings.reactDragtastic.mod

import typings.react.mod.ReactNode
import typings.reactDragtastic.anon.StateisOverbooleanwillAcc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DroppableProps extends js.Object {
  /** A string type corresponding to the type property of the <Draggable/> zone for which this <Droppable/> should accept drop events. */
  var accepts: js.UndefOr[Accepts] = js.native
  /** An id which will be used in the draggable zone's target <DragComponent/> */
  var id: js.UndefOr[Id] = js.native
  /**
    * A function which will be called when the user's cursor enters the <Droppable/> while dragging.
    * This function will be called regardless of whether the droppable accepts the draggable currently being dragged.
    */
  var onDragEnter: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * A function which will be called when the user's cursor leaves the <Droppable/> while dragging.
    * This function will be called regardless of whether the droppable accepts the draggable currently being dragged.
    */
  var onDragLeave: js.UndefOr[js.Function0[Unit]] = js.native
  /** A function which will be called when a user drops a <DragComponent/> on this <Droppable/> with an accepted type. */
  var onDrop: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
  /**
    * An optional array of strings. For performance reasons you can limit which keys in the dragState your component subscribes to.
    * For example, you may pass ['type', 'data'] to only rerender if these keys change.
    */
  var subscribeTo: js.UndefOr[js.Array[String] | Null] = js.native
  def children(arg: StateisOverbooleanwillAcc): ReactNode = js.native
}

object DroppableProps {
  @scala.inline
  def apply(children: StateisOverbooleanwillAcc => ReactNode): DroppableProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
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
    def setChildren(value: StateisOverbooleanwillAcc => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setAcceptsVarargs(value: String*): Self = this.set("accepts", js.Array(value :_*))
    @scala.inline
    def setAccepts(value: Accepts): Self = this.set("accepts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccepts: Self = this.set("accepts", js.undefined)
    @scala.inline
    def setId(value: Id): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOnDragEnter(value: () => Unit): Self = this.set("onDragEnter", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    @scala.inline
    def setOnDragLeave(value: () => Unit): Self = this.set("onDragLeave", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", js.undefined)
    @scala.inline
    def setOnDrop(value: /* data */ js.Any => Unit): Self = this.set("onDrop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    @scala.inline
    def setSubscribeToVarargs(value: String*): Self = this.set("subscribeTo", js.Array(value :_*))
    @scala.inline
    def setSubscribeTo(value: js.Array[String]): Self = this.set("subscribeTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscribeTo: Self = this.set("subscribeTo", js.undefined)
    @scala.inline
    def setSubscribeToNull: Self = this.set("subscribeTo", null)
  }
  
}

