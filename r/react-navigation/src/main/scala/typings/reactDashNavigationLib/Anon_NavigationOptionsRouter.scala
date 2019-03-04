package typings
package reactDashNavigationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NavigationOptionsRouter[State, Options] extends js.Object {
  var navigationOptions: js.UndefOr[reactDashNavigationLib.reactDashNavigationMod.NavigationScreenConfig[Options]] = js.undefined
  var router: reactDashNavigationLib.reactDashNavigationMod.NavigationRouter[State, Options]
}

object Anon_NavigationOptionsRouter {
  @scala.inline
  def apply[State, Options](
    router: reactDashNavigationLib.reactDashNavigationMod.NavigationRouter[State, Options],
    navigationOptions: reactDashNavigationLib.reactDashNavigationMod.NavigationScreenConfig[Options] = null
  ): Anon_NavigationOptionsRouter[State, Options] = {
    val __obj = js.Dynamic.literal(router = router)
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NavigationOptionsRouter[State, Options]]
  }
}

