package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentElement[P, T /* <: Component[P, ComponentState, _] */] extends RaxElement[P, ComponentClass[P, ComponentState]] {
  var ref: js.UndefOr[LegacyRef[T]] = js.native
}

object ComponentElement {
  @scala.inline
  def apply[P, /* <: typings.rax.mod.Component[P, typings.rax.mod.ComponentState, _] */ T](props: P, `type`: ComponentClass[P, ComponentState]): ComponentElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentElement[P, T]]
  }
  @scala.inline
  implicit class ComponentElementOps[Self <: ComponentElement[_, _], P, /* <: typings.rax.mod.Component[P, typings.rax.mod.ComponentState, _] */ T] (val x: Self with (ComponentElement[P, T])) extends AnyVal {
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
    def setRefFunction1(value: /* instance */ T | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: LegacyRef[T]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
  
}

