package typings.reactDashNavigationDashDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypescriptSrcTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.react.reactMod.ComponentType
  import typings.reactDashNavigation.reactDashNavigationMod.NavigationDescriptor
  import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
  import typings.reactDashNavigation.reactDashNavigationMod.NavigationRoute
  import typings.reactDashNavigationDashDrawer.Anon_Dark
  import typings.reactDashNavigationDashDrawer.Anon_NavigationOptions

  type NavigationDrawerScreenComponent[Params, ScreenProps] = (ComponentType[NavigationDrawerScreenProps[Params, ScreenProps]]) with (Anon_NavigationOptions[Params, ScreenProps])
  type SceneDescriptorMap = StringDictionary[
    NavigationDescriptor[
      NavigationParams, 
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], js.Any]
    ]
  ]
  type ThemedColor = String | Anon_Dark
}
