package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationProp[S] extends js.Object {
  var dispatch: NavigationDispatch = js.native
  var state: S = js.native
}

object NavigationProp {
  @scala.inline
  def apply[S](dispatch: /* action */ NavigationAction => Boolean, state: S): NavigationProp[S] = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationProp[S]]
  }
  @scala.inline
  implicit class NavigationPropOps[Self <: NavigationProp[_], S] (val x: Self with NavigationProp[S]) extends AnyVal {
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
    def setDispatch(value: /* action */ NavigationAction => Boolean): Self = this.set("dispatch", js.Any.fromFunction1(value))
    @scala.inline
    def setState(value: S): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

