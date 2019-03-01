package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:strict-export-declare-modifiers
trait NavigationTabScreenOptionsBase extends js.Object {
  var tabBarIcon: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactElement[_] | (js.Function1[
      /* options */ reactDashNavigationLib.Anon_FocusedHorizontal, 
      reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null
    ])
  ] = js.undefined
  var tabBarLabel: js.UndefOr[
    java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_] | (js.Function1[
      /* options */ reactDashNavigationLib.Anon_Focused, 
      reactLib.reactMod.ReactNs.ReactElement[_] | java.lang.String | scala.Null
    ])
  ] = js.undefined
  var tabBarTestIDProps: js.UndefOr[reactDashNavigationLib.Anon_AccessibilityLabel] = js.undefined
  var tabBarVisible: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object NavigationTabScreenOptionsBase {
  @scala.inline
  def apply(
    tabBarIcon: reactLib.reactMod.ReactNs.ReactElement[_] | (js.Function1[
      /* options */ reactDashNavigationLib.Anon_FocusedHorizontal, 
      reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null
    ]) = null,
    tabBarLabel: java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_] | (js.Function1[
      /* options */ reactDashNavigationLib.Anon_Focused, 
      reactLib.reactMod.ReactNs.ReactElement[_] | java.lang.String | scala.Null
    ]) = null,
    tabBarTestIDProps: reactDashNavigationLib.Anon_AccessibilityLabel = null,
    tabBarVisible: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null
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

