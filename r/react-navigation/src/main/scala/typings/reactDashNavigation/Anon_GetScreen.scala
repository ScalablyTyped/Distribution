package typings.reactDashNavigation

import typings.reactDashNavigation.reactDashNavigationMod.NavigationComponent
import typings.reactDashNavigation.reactDashNavigationMod._NavigationScreenRouteConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetScreen extends _NavigationScreenRouteConfig {
  def getScreen(): NavigationComponent
}

object Anon_GetScreen {
  @scala.inline
  def apply(getScreen: () => NavigationComponent): Anon_GetScreen = {
    val __obj = js.Dynamic.literal(getScreen = js.Any.fromFunction0(getScreen))
  
    __obj.asInstanceOf[Anon_GetScreen]
  }
}

