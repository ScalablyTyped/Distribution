package typings.reactNavigationMaterialBottomTabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type NavigationMaterialBottomTabConfig = (typings.std.Partial[
    typings.std.Omit[
      typings.react.mod.ComponentProps[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BottomNavigation */ _
      ], 
      typings.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.navigationState | typings.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.onIndexChange | typings.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.onTabPress | typings.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.renderScene | typings.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.renderLabel | typings.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.renderIcon | typings.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.getAccessibilityLabel | typings.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.getBadge | typings.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.getColor | typings.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.getLabelText | typings.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.getTestID
    ]
  ]) with typings.reactNavigationMaterialBottomTabs.anon.ActiveColorDark
  type NavigationMaterialBottomTabScreenComponent[Params, ScreenProps] = (typings.react.mod.ComponentType[
    typings.reactNavigationMaterialBottomTabs.typesMod.NavigationTabScreenProps[Params, ScreenProps]
  ]) with (typings.reactNavigationMaterialBottomTabs.anon.NavigationOptions[Params, ScreenProps])
  type NavigationTabState = typings.reactNavigation.mod.NavigationState
}
