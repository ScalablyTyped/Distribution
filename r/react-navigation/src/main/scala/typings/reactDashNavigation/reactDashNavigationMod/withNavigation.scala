package typings.reactDashNavigation.reactDashNavigationMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.reactDashNavigation.Anon_OnRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", "withNavigation")
@js.native
object withNavigation extends js.Object {
  def apply[P /* <: NavigationInjectedProps[NavigationParams] */](Component: ComponentType[P]): ComponentType[Omit[P, String]] = js.native
  def apply[P /* <: NavigationInjectedProps[NavigationParams] */, T /* <: ComponentClass[P, ComponentState] */](Component: T with (ComponentClass[P, ComponentState])): ComponentType[(Omit[P, String]) with Anon_OnRef[T]] = js.native
}

