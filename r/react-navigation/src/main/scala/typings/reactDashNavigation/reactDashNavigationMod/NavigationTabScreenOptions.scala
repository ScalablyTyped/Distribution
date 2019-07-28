package typings.reactDashNavigation.reactDashNavigationMod

import typings.react.reactMod.ReactElement
import typings.reactDashNavigation.Anon_AccessibilityLabel
import typings.reactDashNavigation.Anon_Focused
import typings.reactDashNavigation.Anon_FocusedHorizontal
import typings.reactDashNavigation.Anon_Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationTabScreenOptions extends NavigationTabScreenOptionsBase {
  var swipeEnabled: js.UndefOr[Boolean] = js.undefined
  var tabBarOnPress: js.UndefOr[js.Function1[/* options */ Anon_Index, Unit]] = js.undefined
}

object NavigationTabScreenOptions {
  @scala.inline
  def apply(
    swipeEnabled: js.UndefOr[Boolean] = js.undefined,
    tabBarIcon: ReactElement | (js.Function1[/* options */ Anon_FocusedHorizontal, ReactElement | Null]) = null,
    tabBarLabel: String | ReactElement | (js.Function1[/* options */ Anon_Focused, ReactElement | String | Null]) = null,
    tabBarOnPress: /* options */ Anon_Index => Unit = null,
    tabBarTestIDProps: Anon_AccessibilityLabel = null,
    tabBarVisible: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): NavigationTabScreenOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(swipeEnabled)) __obj.updateDynamic("swipeEnabled")(swipeEnabled)
    if (tabBarIcon != null) __obj.updateDynamic("tabBarIcon")(tabBarIcon.asInstanceOf[js.Any])
    if (tabBarLabel != null) __obj.updateDynamic("tabBarLabel")(tabBarLabel.asInstanceOf[js.Any])
    if (tabBarOnPress != null) __obj.updateDynamic("tabBarOnPress")(js.Any.fromFunction1(tabBarOnPress))
    if (tabBarTestIDProps != null) __obj.updateDynamic("tabBarTestIDProps")(tabBarTestIDProps)
    if (!js.isUndefined(tabBarVisible)) __obj.updateDynamic("tabBarVisible")(tabBarVisible)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[NavigationTabScreenOptions]
  }
}

