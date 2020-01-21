package typings.reactNavigation.mod

import typings.react.mod.ComponentType
import typings.reactNavigation.reactNavigationStrings.isLandscape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", "withOrientation")
@js.native
object withOrientation extends js.Object {
  def apply[P /* <: NavigationOrientationInjectedProps */](Component: ComponentType[P]): ComponentType[Omit[P, isLandscape]] = js.native
}

