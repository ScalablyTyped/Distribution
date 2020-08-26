package typings.storybookApi.storeMod

import typings.storybookApi.mod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Upstream extends js.Object {
  var getState: GetState = js.native
  var setState: SetState = js.native
}

object Upstream {
  @scala.inline
  def apply(getState: () => State, setState: (/* a */ js.Any, /* b */ js.Any) => js.Any): Upstream = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), setState = js.Any.fromFunction2(setState))
    __obj.asInstanceOf[Upstream]
  }
  @scala.inline
  implicit class UpstreamOps[Self <: Upstream] (val x: Self) extends AnyVal {
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
    def setGetState(value: () => State): Self = this.set("getState", js.Any.fromFunction0(value))
    @scala.inline
    def setSetState(value: (/* a */ js.Any, /* b */ js.Any) => js.Any): Self = this.set("setState", js.Any.fromFunction2(value))
  }
  
}

