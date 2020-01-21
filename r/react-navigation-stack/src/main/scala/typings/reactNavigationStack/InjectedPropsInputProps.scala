package typings.reactNavigationStack

import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.View
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigationStack.createPointerEventsContainerMod.PointerEvents
import typings.reactNavigationStack.typesMod.NavigationStackProp
import typings.reactNavigationStack.typesMod.Scene
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

