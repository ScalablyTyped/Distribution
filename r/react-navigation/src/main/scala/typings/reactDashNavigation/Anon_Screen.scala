package typings.reactDashNavigation

import typings.reactDashNavigation.reactDashNavigationMod.NavigationComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Screen[Options, NavigationScreenPropType] extends js.Object {
  var screen: NavigationComponent[Options, NavigationScreenPropType]
}

object Anon_Screen {
  @scala.inline
  def apply[Options, NavigationScreenPropType](screen: NavigationComponent[Options, NavigationScreenPropType]): Anon_Screen[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal(screen = screen.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Screen[Options, NavigationScreenPropType]]
  }
}

