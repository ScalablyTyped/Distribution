package typings.reactDashNavigation.reactDashNavigationMod

import typings.react.reactMod.ReactElement
import typings.reactDashNavigation.Anon_AccessibilityLabel
import typings.reactDashNavigation.Anon_Focused
import typings.reactDashNavigation.Anon_FocusedHorizontal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:strict-export-declare-modifiers
trait NavigationTabScreenOptionsBase extends js.Object {
  var tabBarIcon: js.UndefOr[
    ReactElement | (js.Function1[/* options */ Anon_FocusedHorizontal, ReactElement | Null])
  ] = js.undefined
  var tabBarLabel: js.UndefOr[
    String | ReactElement | (js.Function1[/* options */ Anon_Focused, ReactElement | String | Null])
  ] = js.undefined
  var tabBarTestIDProps: js.UndefOr[Anon_AccessibilityLabel] = js.undefined
  var tabBarVisible: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object NavigationTabScreenOptionsBase {
  @scala.inline
  def apply(
    tabBarIcon: ReactElement | (js.Function1[/* options */ Anon_FocusedHorizontal, ReactElement | Null]) = null,
    tabBarLabel: String | ReactElement | (js.Function1[/* options */ Anon_Focused, ReactElement | String | Null]) = null,
    tabBarTestIDProps: Anon_AccessibilityLabel = null,
    tabBarVisible: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): NavigationTabScreenOptionsBase = {
    val __obj = js.Dynamic.literal()
    if (tabBarIcon != null) __obj.updateDynamic("tabBarIcon")(tabBarIcon.asInstanceOf[js.Any])
    if (tabBarLabel != null) __obj.updateDynamic("tabBarLabel")(tabBarLabel.asInstanceOf[js.Any])
    if (tabBarTestIDProps != null) __obj.updateDynamic("tabBarTestIDProps")(tabBarTestIDProps)
    if (!js.isUndefined(tabBarVisible)) __obj.updateDynamic("tabBarVisible")(tabBarVisible)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[NavigationTabScreenOptionsBase]
  }
}

