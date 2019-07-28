package typings.reactDashNavigation

import typings.reactDashNavigation.reactDashNavigationMod.NavigationRouter
import typings.reactDashNavigation.reactDashNavigationMod.NavigationScreenConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NavigationOptionsRouter[State, Options] extends js.Object {
  var navigationOptions: js.UndefOr[NavigationScreenConfig[Options]] = js.undefined
  var router: NavigationRouter[State, Options]
}

object Anon_NavigationOptionsRouter {
  @scala.inline
  def apply[State, Options](
    router: NavigationRouter[State, Options],
    navigationOptions: NavigationScreenConfig[Options] = null
  ): Anon_NavigationOptionsRouter[State, Options] = {
    val __obj = js.Dynamic.literal(router = router)
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NavigationOptionsRouter[State, Options]]
  }
}

