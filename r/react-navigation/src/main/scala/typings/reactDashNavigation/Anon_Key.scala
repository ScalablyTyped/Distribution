package typings.reactDashNavigation

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNavigation.reactDashNavigationMod.NavigationScreenConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key[Options, NavigationScreenPropType] extends js.Object {
  var navigationOptions: js.UndefOr[NavigationScreenConfig[Options, NavigationScreenPropType, _]] = js.undefined
  var params: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply[Options, NavigationScreenPropType](
    navigationOptions: NavigationScreenConfig[Options, NavigationScreenPropType, _] = null,
    params: StringDictionary[js.Any] = null,
    path: String = null
  ): Anon_Key[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal()
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Anon_Key[Options, NavigationScreenPropType]]
  }
}

