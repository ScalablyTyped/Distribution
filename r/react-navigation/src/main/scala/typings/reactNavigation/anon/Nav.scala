package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nav extends js.Object {
  var nav: NavigationState | Null
}

object Nav {
  @scala.inline
  def apply(nav: NavigationState = null): Nav = {
    val __obj = js.Dynamic.literal(nav = nav.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nav]
  }
}

