package typings.reactNavigation.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.reactNavigation.AnonOnRef
import typings.reactNavigation.reactNavigationStrings.navigation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", "withNavigation")
@js.native
object withNavigation extends js.Object {
  def apply[P /* <: NavigationInjectedProps[NavigationParams] */](Component: ComponentType[P]): ComponentType[Omit[P, navigation]] = js.native
  def apply[P /* <: NavigationInjectedProps[NavigationParams] */, T /* <: ComponentClass[P, ComponentState] */](Component: T with (ComponentClass[P, ComponentState])): ComponentType[(Omit[P, navigation]) with (AnonOnRef[T, P])] = js.native
}

