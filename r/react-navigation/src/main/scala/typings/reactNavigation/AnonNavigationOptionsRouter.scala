package typings.reactNavigation

import typings.reactNavigation.mod.NavigationRouter
import typings.reactNavigation.mod.NavigationScreenConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNavigationOptionsRouter[Options, NavigationPropType] extends js.Object {
  var navigationOptions: js.UndefOr[NavigationScreenConfig[Options, NavigationPropType, _]] = js.undefined
  var router: NavigationRouter[Options, js.Object]
}

object AnonNavigationOptionsRouter {
  @scala.inline
  def apply[Options, NavigationPropType](
    router: NavigationRouter[Options, js.Object],
    navigationOptions: NavigationScreenConfig[Options, NavigationPropType, _] = null
  ): AnonNavigationOptionsRouter[Options, NavigationPropType] = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNavigationOptionsRouter[Options, NavigationPropType]]
  }
}

