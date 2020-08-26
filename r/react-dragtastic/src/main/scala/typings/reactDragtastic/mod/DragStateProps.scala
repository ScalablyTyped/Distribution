package typings.reactDragtastic.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragStateProps extends js.Object {
  /**
    * An optional array of strings. For performance reasons you can limit which keys in the dragState your component subscribes to.
    * For example, you may pass ['type', 'data'] to only rerender if these keys change.
    */
  var subscribeTo: js.UndefOr[js.Array[String] | Null] = js.native
  def children(arg: State): ReactNode = js.native
}

object DragStateProps {
  @scala.inline
  def apply(children: State => ReactNode): DragStateProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[DragStateProps]
  }
  @scala.inline
  implicit class DragStatePropsOps[Self <: DragStateProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: State => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
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

