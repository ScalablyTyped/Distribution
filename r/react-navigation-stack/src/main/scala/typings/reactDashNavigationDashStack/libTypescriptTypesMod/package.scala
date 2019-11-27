package typings.reactDashNavigationDashStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypescriptTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.react.reactMod.ComponentType
  import typings.reactDashNavigation.reactDashNavigationMod.NavigationDescriptor
  import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
  import typings.reactDashNavigation.reactDashNavigationMod.NavigationRoute
  import typings.reactDashNavigation.reactDashNavigationMod.NavigationState
  import typings.reactDashNavigationDashStack.Anon_NavigationOptions

  type NavigationStackScreenComponent[Params, ScreenProps] = (ComponentType[NavigationStackScreenProps[Params, ScreenProps]]) with (Anon_NavigationOptions[Params, ScreenProps])
  type NavigationStackState = NavigationState
  type SceneDescriptorMap = StringDictionary[
    NavigationDescriptor[
      NavigationParams, 
      NavigationStackOptions, 
      NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]
    ]
  ]
  type SceneInterpolator = js.Function1[/* props */ SceneInterpolatorProps, js.Any]
}
