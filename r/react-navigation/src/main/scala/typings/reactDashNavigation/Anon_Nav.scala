package typings.reactDashNavigation

import typings.reactDashNavigation.reactDashNavigationMod.NavigationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Nav extends js.Object {
  var nav: NavigationState | Null
}

object Anon_Nav {
  @scala.inline
  def apply(nav: NavigationState = null): Anon_Nav = {
    val __obj = js.Dynamic.literal()
    if (nav != null) __obj.updateDynamic("nav")(nav)
    __obj.asInstanceOf[Anon_Nav]
  }
}

