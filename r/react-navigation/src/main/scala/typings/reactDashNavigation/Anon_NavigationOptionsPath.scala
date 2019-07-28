package typings.reactDashNavigation

import typings.reactDashNavigation.reactDashNavigationMod.NavigationScreenConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NavigationOptionsPath extends js.Object {
  var navigationOptions: js.UndefOr[NavigationScreenConfig[_]] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object Anon_NavigationOptionsPath {
  @scala.inline
  def apply(navigationOptions: NavigationScreenConfig[_] = null, path: String = null): Anon_NavigationOptionsPath = {
    val __obj = js.Dynamic.literal()
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Anon_NavigationOptionsPath]
  }
}

