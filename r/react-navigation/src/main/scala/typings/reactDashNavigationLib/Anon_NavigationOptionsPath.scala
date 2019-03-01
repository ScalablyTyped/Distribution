package typings
package reactDashNavigationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NavigationOptionsPath extends js.Object {
  var navigationOptions: js.UndefOr[reactDashNavigationLib.reactDashNavigationMod.NavigationScreenConfig[_]] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_NavigationOptionsPath {
  @scala.inline
  def apply(
    navigationOptions: reactDashNavigationLib.reactDashNavigationMod.NavigationScreenConfig[_] = null,
    path: java.lang.String = null
  ): Anon_NavigationOptionsPath = {
    val __obj = js.Dynamic.literal()
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Anon_NavigationOptionsPath]
  }
}

