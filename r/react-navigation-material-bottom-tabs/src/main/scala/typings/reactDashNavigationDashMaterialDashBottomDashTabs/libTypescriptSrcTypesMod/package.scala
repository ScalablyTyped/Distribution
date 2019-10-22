package typings.reactDashNavigationDashMaterialDashBottomDashTabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypescriptSrcTypesMod {
  import typings.react.reactMod.ComponentType
  import typings.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
  import typings.reactDashNavigation.reactDashNavigationMod.NavigationState
  import typings.reactDashNavigationDashMaterialDashBottomDashTabs.Anon_JumpTo
  import typings.reactDashNavigationDashMaterialDashBottomDashTabs.Anon_NavigationOptions

  type NavigationMaterialBottomTabScreenComponent[Params, ScreenProps] = (ComponentType[NavigationTabScreenProps[Params, ScreenProps]]) with Anon_NavigationOptions
  type NavigationTabProp[State, Params] = (NavigationScreenProp[State, Params]) with Anon_JumpTo
  type NavigationTabState = NavigationState
}
