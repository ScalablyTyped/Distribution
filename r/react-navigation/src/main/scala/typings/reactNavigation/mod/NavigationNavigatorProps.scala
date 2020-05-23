package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.`no-preference`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationNavigatorProps[Options, State, ScreenProps] extends js.Object {
  var detached: js.UndefOr[Boolean] = js.undefined
  var navigation: js.UndefOr[NavigationProp[State]] = js.undefined
  var navigationOptions: js.UndefOr[Options] = js.undefined
  var screenProps: js.UndefOr[ScreenProps] = js.undefined
  var theme: js.UndefOr[SupportedThemes | `no-preference`] = js.undefined
}

object NavigationNavigatorProps {
  @scala.inline
  def apply[Options, State, ScreenProps](
    detached: js.UndefOr[Boolean] = js.undefined,
    navigation: NavigationProp[State] = null,
    navigationOptions: Options = null,
    screenProps: ScreenProps = null,
    theme: SupportedThemes | `no-preference` = null
  ): NavigationNavigatorProps[Options, State, ScreenProps] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached.get.asInstanceOf[js.Any])
    if (navigation != null) __obj.updateDynamic("navigation")(navigation.asInstanceOf[js.Any])
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationNavigatorProps[Options, State, ScreenProps]]
  }
}

