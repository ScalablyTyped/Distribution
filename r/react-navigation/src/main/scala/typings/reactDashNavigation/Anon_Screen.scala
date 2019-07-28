package typings.reactDashNavigation

import typings.reactDashNavigation.reactDashNavigationMod.NavigationComponent
import typings.reactDashNavigation.reactDashNavigationMod._NavigationScreenRouteConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Screen extends _NavigationScreenRouteConfig {
  var screen: NavigationComponent
}

object Anon_Screen {
  @scala.inline
  def apply(screen: NavigationComponent): Anon_Screen = {
    val __obj = js.Dynamic.literal(screen = screen.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Screen]
  }
}

