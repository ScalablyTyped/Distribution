package typings.reactNavigation

import typings.reactNavigation.mod.NavigationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNav extends js.Object {
  var nav: NavigationState | Null
}

object AnonNav {
  @scala.inline
  def apply(nav: NavigationState = null): AnonNav = {
    val __obj = js.Dynamic.literal()
    if (nav != null) __obj.updateDynamic("nav")(nav.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNav]
  }
}

