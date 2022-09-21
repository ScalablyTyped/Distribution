package typings.reactNavigationStack.vendorTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNavigation.mod.NavigationDescriptor
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationProp
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigation.mod.NavigationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type NavigationStackState = NavigationState

type Route[T /* <: String */] = NavigationRoute[NavigationParams]

type StackCardStyleInterpolator = js.Function1[/* props */ StackCardInterpolationProps, StackCardInterpolatedStyle]

type StackDescriptor = NavigationDescriptor[
NavigationParams, 
StackNavigationOptions, 
StackNavigationProp[NavigationRoute[NavigationParams], NavigationParams]]

type StackDescriptorMap = StringDictionary[StackDescriptor]

type StackHeaderStyleInterpolator = js.Function1[/* props */ StackHeaderInterpolationProps, StackHeaderInterpolatedStyle]

type StackNavigationHelpers = NavigationProp[NavigationStackState]
