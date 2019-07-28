package typings.reactDashNavigation

import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typings.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typings.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NavigationOptions extends js.Object {
  var navigationOptions: NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
}

object Anon_NavigationOptions {
  @scala.inline
  def apply(navigationOptions: NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]): Anon_NavigationOptions = {
    val __obj = js.Dynamic.literal(navigationOptions = navigationOptions)
  
    __obj.asInstanceOf[Anon_NavigationOptions]
  }
}

