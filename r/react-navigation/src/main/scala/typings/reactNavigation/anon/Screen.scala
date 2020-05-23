package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Screen[Options, NavigationScreenPropType] extends js.Object {
  var screen: NavigationComponent[Options, NavigationScreenPropType]
}

object Screen {
  @scala.inline
  def apply[Options, NavigationScreenPropType](screen: NavigationComponent[Options, NavigationScreenPropType]): Screen[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal(screen = screen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Screen[Options, NavigationScreenPropType]]
  }
}

