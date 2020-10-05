package typings.reactNavigationStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object vendorTypesMod {
  type NavigationStackState = typings.reactNavigation.mod.NavigationState
  type Route[T /* <: java.lang.String */] = typings.reactNavigation.mod.NavigationRoute[typings.reactNavigation.mod.NavigationParams]
  type StackCardStyleInterpolator = js.Function1[
    /* props */ typings.reactNavigationStack.vendorTypesMod.StackCardInterpolationProps, 
    typings.reactNavigationStack.vendorTypesMod.StackCardInterpolatedStyle
  ]
  type StackDescriptor = typings.reactNavigation.mod.NavigationDescriptor[
    typings.reactNavigation.mod.NavigationParams, 
    typings.reactNavigationStack.vendorTypesMod.StackNavigationOptions, 
    typings.reactNavigationStack.vendorTypesMod.StackNavigationProp[
      typings.reactNavigation.mod.NavigationRoute[typings.reactNavigation.mod.NavigationParams], 
      typings.reactNavigation.mod.NavigationParams
    ]
  ]
  type StackDescriptorMap = org.scalablytyped.runtime.StringDictionary[typings.reactNavigationStack.vendorTypesMod.StackDescriptor]
  type StackHeaderStyleInterpolator = js.Function1[
    /* props */ typings.reactNavigationStack.vendorTypesMod.StackHeaderInterpolationProps, 
    typings.reactNavigationStack.vendorTypesMod.StackHeaderInterpolatedStyle
  ]
  type StackNavigationHelpers = typings.reactNavigation.mod.NavigationProp[typings.reactNavigationStack.vendorTypesMod.NavigationStackState]
}
