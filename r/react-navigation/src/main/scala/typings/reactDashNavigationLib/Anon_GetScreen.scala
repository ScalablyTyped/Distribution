package typings
package reactDashNavigationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetScreen
  extends reactDashNavigationLib.reactDashNavigationMod._NavigationScreenRouteConfig {
  def getScreen(): reactDashNavigationLib.reactDashNavigationMod.NavigationComponent
}

object Anon_GetScreen {
  @scala.inline
  def apply(getScreen: () => reactDashNavigationLib.reactDashNavigationMod.NavigationComponent): Anon_GetScreen = {
    val __obj = js.Dynamic.literal(getScreen = js.Any.fromFunction0(getScreen))
  
    __obj.asInstanceOf[Anon_GetScreen]
  }
}

