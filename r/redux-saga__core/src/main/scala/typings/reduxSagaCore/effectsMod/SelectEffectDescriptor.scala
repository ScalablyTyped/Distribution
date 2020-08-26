package typings.reduxSagaCore.effectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectEffectDescriptor extends js.Object {
  var args: js.Array[_] = js.native
  def selector(state: js.Any, args: js.Any*): js.Any = js.native
}

object SelectEffectDescriptor {
  @scala.inline
  def apply(args: js.Array[_], selector: (js.Any, /* repeated */ js.Any) => js.Any): SelectEffectDescriptor = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], selector = js.Any.fromFunction2(selector))
    __obj.asInstanceOf[SelectEffectDescriptor]
  }
  @scala.inline
  implicit class SelectEffectDescriptorOps[Self <: SelectEffectDescriptor] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: js.Any*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[_]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelector(value: (js.Any, /* repeated */ js.Any) => js.Any): Self = this.set("selector", js.Any.fromFunction2(value))
  }
  
}

