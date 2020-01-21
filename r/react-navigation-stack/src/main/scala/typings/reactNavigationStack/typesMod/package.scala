package typings.reactNavigationStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type NavigationStackScreenComponent[Params, ScreenProps] = (typings.react.mod.ComponentType[
    typings.reactNavigationStack.typesMod.NavigationStackScreenProps[Params, ScreenProps]
  ]) with (typings.reactNavigationStack.AnonNavigationOptions[Params, ScreenProps])
  type NavigationStackState = typings.reactNavigation.mod.NavigationState
  type SceneDescriptorMap = org.scalablytyped.runtime.StringDictionary[
    typings.reactNavigation.mod.NavigationDescriptor[
      typings.reactNavigation.mod.NavigationParams, 
      typings.reactNavigationStack.typesMod.NavigationStackOptions, 
      typings.reactNavigationStack.typesMod.NavigationStackProp[
        typings.reactNavigation.mod.NavigationRoute[typings.reactNavigation.mod.NavigationParams], 
        typings.reactNavigation.mod.NavigationParams
      ]
    ]
  ]
  type SceneInterpolator = js.Function1[/* props */ typings.reactNavigationStack.typesMod.SceneInterpolatorProps, js.Any]
}
