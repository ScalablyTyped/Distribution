package typings.reactNavigation

import org.scalablytyped.runtime.StringDictionary
import typings.reactNavigation.mod.NavigationScreenConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey[Options, NavigationScreenPropType] extends js.Object {
  var navigationOptions: js.UndefOr[NavigationScreenConfig[Options, NavigationScreenPropType, _]] = js.undefined
  var params: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object AnonKey {
  @scala.inline
  def apply[Options, NavigationScreenPropType](
    navigationOptions: NavigationScreenConfig[Options, NavigationScreenPropType, _] = null,
    params: StringDictionary[js.Any] = null,
    path: String = null
  ): AnonKey[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal()
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey[Options, NavigationScreenPropType]]
  }
}

