package typings.reactNavigation.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.reactNavigation.anon.`0`
import typings.reactNavigation.reactNavigationStrings.isFocused
import typings.reactNavigation.reactNavigationStrings.navigation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", "withNavigationFocus")
@js.native
object withNavigationFocus extends js.Object {
  def apply[P /* <: NavigationFocusInjectedProps[NavigationParams] */](Component: ComponentType[P]): ComponentType[
    Omit[
      P, 
      /* keyof react-navigation.react-navigation.NavigationFocusInjectedProps<react-navigation.react-navigation.NavigationParams> */ isFocused | navigation
    ]
  ] = js.native
  def apply[P /* <: NavigationFocusInjectedProps[NavigationParams] */, T /* <: ComponentClass[P, ComponentState] */](Component: T with (ComponentClass[P, ComponentState])): ComponentType[
    (Omit[
      P, 
      /* keyof react-navigation.react-navigation.NavigationFocusInjectedProps<react-navigation.react-navigation.NavigationParams> */ isFocused | navigation
    ]) with (`0`[T, P])
  ] = js.native
}

