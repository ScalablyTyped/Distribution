package typings.reactDashNavigationDashStack

import typings.reactDashNative.reactDashNativeMod.Animated.Value
import typings.reactDashNative.reactDashNativeMod.View
import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typings.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typings.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackProp
import typings.reactDashNavigationDashStack.libTypescriptTypesMod.Scene
import typings.reactDashNavigationDashStack.libTypescriptViewsStackViewCreatePointerEventsContainerMod.PointerEvents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation-stack.react-navigation-stack/lib/typescript/views/StackView/createPointerEventsContainer.InjectedProps & react-navigation-stack.react-navigation-stack/lib/typescript/views/StackView/createPointerEventsContainer.InputProps */
@js.native
trait InjectedPropsInputProps extends js.Object {
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams] = js.native
  var pointerEvents: PointerEvents = js.native
  var realPosition: Value = js.native
  var scene: Scene = js.native
  def onComponentRef(): Unit = js.native
  def onComponentRef(ref: View): Unit = js.native
}

