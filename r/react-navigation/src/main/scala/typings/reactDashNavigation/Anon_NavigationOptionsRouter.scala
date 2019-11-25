package typings.reactDashNavigation

import typings.reactDashNavigation.reactDashNavigationMod.NavigationRouter
import typings.reactDashNavigation.reactDashNavigationMod.NavigationScreenConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NavigationOptionsRouter[Options, NavigationPropType] extends js.Object {
  var navigationOptions: js.UndefOr[NavigationScreenConfig[Options, NavigationPropType, _]] = js.undefined
  var router: NavigationRouter[Options, js.Object]
}

object Anon_NavigationOptionsRouter {
  @scala.inline
  def apply[Options, NavigationPropType](
    router: NavigationRouter[Options, js.Object],
    navigationOptions: NavigationScreenConfig[Options, NavigationPropType, _] = null
  ): Anon_NavigationOptionsRouter[Options, NavigationPropType] = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NavigationOptionsRouter[Options, NavigationPropType]]
  }
}

