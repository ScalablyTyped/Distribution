package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationProp[S] extends js.Object {
  var dispatch: NavigationDispatch
  var state: S
}

object NavigationProp {
  @scala.inline
  def apply[S](dispatch: /* action */ NavigationAction => Boolean, state: S): NavigationProp[S] = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationProp[S]]
  }
}

