package typings.reactDashNavigationDashMaterialDashBottomDashTabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypescriptSrcTypesMod {
  import typings.react.reactMod.ComponentProps
  import typings.react.reactMod.ComponentType
  import typings.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
  import typings.reactDashNavigation.reactDashNavigationMod.NavigationState
  import typings.reactDashNavigationDashMaterialDashBottomDashTabs.Anon_ActiveColorDark
  import typings.reactDashNavigationDashMaterialDashBottomDashTabs.Anon_JumpTo
  import typings.reactDashNavigationDashMaterialDashBottomDashTabs.Anon_NavigationOptions
  import typings.reactDashNavigationDashMaterialDashBottomDashTabs.reactDashNavigationDashMaterialDashBottomDashTabsStrings.getAccessibilityLabel
  import typings.reactDashNavigationDashMaterialDashBottomDashTabs.reactDashNavigationDashMaterialDashBottomDashTabsStrings.getBadge
  import typings.reactDashNavigationDashMaterialDashBottomDashTabs.reactDashNavigationDashMaterialDashBottomDashTabsStrings.getColor
  import typings.reactDashNavigationDashMaterialDashBottomDashTabs.reactDashNavigationDashMaterialDashBottomDashTabsStrings.getLabelText
  import typings.reactDashNavigationDashMaterialDashBottomDashTabs.reactDashNavigationDashMaterialDashBottomDashTabsStrings.getTestID
  import typings.reactDashNavigationDashMaterialDashBottomDashTabs.reactDashNavigationDashMaterialDashBottomDashTabsStrings.navigationState
  import typings.reactDashNavigationDashMaterialDashBottomDashTabs.reactDashNavigationDashMaterialDashBottomDashTabsStrings.onIndexChange
  import typings.reactDashNavigationDashMaterialDashBottomDashTabs.reactDashNavigationDashMaterialDashBottomDashTabsStrings.onTabPress
  import typings.reactDashNavigationDashMaterialDashBottomDashTabs.reactDashNavigationDashMaterialDashBottomDashTabsStrings.renderIcon
  import typings.reactDashNavigationDashMaterialDashBottomDashTabs.reactDashNavigationDashMaterialDashBottomDashTabsStrings.renderLabel
  import typings.reactDashNavigationDashMaterialDashBottomDashTabs.reactDashNavigationDashMaterialDashBottomDashTabsStrings.renderScene
  import typings.std.Omit
  import typings.std.Partial

  type NavigationMaterialBottomTabConfig = (Partial[
    Omit[
      ComponentProps[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BottomNavigation */ _
      ], 
      navigationState | onIndexChange | onTabPress | renderScene | renderLabel | renderIcon | getAccessibilityLabel | getBadge | getColor | getLabelText | getTestID
    ]
  ]) with Anon_ActiveColorDark
  type NavigationMaterialBottomTabScreenComponent[Params, ScreenProps] = (ComponentType[NavigationTabScreenProps[Params, ScreenProps]]) with (Anon_NavigationOptions[Params, ScreenProps])
  type NavigationTabProp[State, Params] = (NavigationScreenProp[State, Params]) with Anon_JumpTo
  type NavigationTabState = NavigationState
}
