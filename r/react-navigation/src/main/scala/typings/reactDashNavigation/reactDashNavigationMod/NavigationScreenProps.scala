package typings.reactDashNavigation.reactDashNavigationMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationScreenProps[Params, Options] extends js.Object {
  var navigation: NavigationScreenProp[NavigationRoute[Params], Params]
  var navigationOptions: js.UndefOr[NavigationScreenConfig[Options]] = js.undefined
  var screenProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object NavigationScreenProps {
  @scala.inline
  def apply[Params, Options](
    navigation: NavigationScreenProp[NavigationRoute[Params], Params],
    navigationOptions: NavigationScreenConfig[Options] = null,
    screenProps: StringDictionary[js.Any] = null
  ): NavigationScreenProps[Params, Options] = {
    val __obj = js.Dynamic.literal(navigation = navigation)
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps)
    __obj.asInstanceOf[NavigationScreenProps[Params, Options]]
  }
}

