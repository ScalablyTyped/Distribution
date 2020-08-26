package typings.reduxFirstRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigator[TState] extends js.Object {
  var router: Router[TState] = js.native
}

object Navigator {
  @scala.inline
  def apply[TState](router: Router[TState]): Navigator[TState] = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator[TState]]
  }
  @scala.inline
  implicit class NavigatorOps[Self <: Navigator[_], TState] (val x: Self with Navigator[TState]) extends AnyVal {
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
    def setRouter(value: Router[TState]): Self = this.set("router", value.asInstanceOf[js.Any])
  }
  
}

