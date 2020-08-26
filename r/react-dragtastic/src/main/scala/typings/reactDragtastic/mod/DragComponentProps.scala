package typings.reactDragtastic.mod

import typings.react.mod.ReactNode
import typings.reactDragtastic.anon.StateisOverAcceptedboolea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragComponentProps extends js.Object {
  /** A boolean determining whether or not the DragComponent should always render. Defaults to false. */
  var alwaysRender: js.UndefOr[Boolean] = js.native
  /* A string corresponding to the id property of the <Draggable/> zone that should trigger this component to start rendering. */
  var `for`: js.UndefOr[Id] = js.native
  /** A function which will be called every time a user drags. */
  var onDrag: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * An optional array of strings. For performance reasons you can limit which keys in the dragState your component subscribes to.
    * For example, you may pass ['type', 'data'] to only rerender if these keys change.
    */
  var subscribeTo: js.UndefOr[js.Array[String] | Null] = js.native
  def children(arg: StateisOverAcceptedboolea): ReactNode = js.native
}

object DragComponentProps {
  @scala.inline
  def apply(children: StateisOverAcceptedboolea => ReactNode): DragComponentProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[DragComponentProps]
  }
  @scala.inline
  implicit class DragComponentPropsOps[Self <: DragComponentProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: StateisOverAcceptedboolea => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setAlwaysRender(value: Boolean): Self = this.set("alwaysRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysRender: Self = this.set("alwaysRender", js.undefined)
    @scala.inline
    def setFor(value: Id): Self = this.set("for", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFor: Self = this.set("for", js.undefined)
    @scala.inline
    def setOnDrag(value: () => Unit): Self = this.set("onDrag", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
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

