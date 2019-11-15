package typings.reactDashNavigation.reactDashNavigationMod

import typings.react.reactMod.ComponentType
import typings.reactDashNavigation.reactDashNavigationStrings.isLandscape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", "withOrientation")
@js.native
object withOrientation extends js.Object {
  def apply[P /* <: NavigationOrientationInjectedProps */](Component: ComponentType[P]): ComponentType[Omit[P, isLandscape]] = js.native
}

