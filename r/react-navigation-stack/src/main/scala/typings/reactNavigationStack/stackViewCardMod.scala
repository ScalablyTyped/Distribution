package typings.reactNavigationStack

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.AnimatedInterpolation
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.View
import typings.reactNative.mod.ViewStyle
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigationStack.createPointerEventsContainerMod.PointerEvents
import typings.reactNavigationStack.typesMod.NavigationStackProp
import typings.reactNavigationStack.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/views/StackView/StackViewCard", JSImport.Namespace)
@js.native
object stackViewCardMod extends js.Object {
  /* Inlined react-navigation-stack.react-navigation-stack/lib/typescript/views/StackView/createPointerEventsContainer.InputProps & react-navigation-stack.react-navigation-stack/lib/typescript/views/StackView/createPointerEventsContainer.InjectedProps & {  style  :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>,   animatedStyle  :any,   position  :react-native.react-native.Animated.AnimatedInterpolation,   transparent ? :boolean,   children  :react.react.ReactNode} */
  @js.native
  trait Props extends js.Object {
    var animatedStyle: js.Any = js.native
    var children: ReactNode = js.native
    var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams] = js.native
    var pointerEvents: PointerEvents = js.native
    var position: AnimatedInterpolation = js.native
    var realPosition: Value = js.native
    var scene: Scene = js.native
    var style: StyleProp[ViewStyle] = js.native
    var transparent: js.UndefOr[Boolean] = js.native
    def onComponentRef(): Unit = js.native
    def onComponentRef(ref: View): Unit = js.native
  }
  
  @js.native
  class default protected ()
    extends Component[PickPropsstylechildrenscenenavigationrealPositiona, ComponentState, js.Any] {
    def this(props: PickPropsstylechildrenscenenavigationrealPositiona) = this()
    def this(props: PickPropsstylechildrenscenenavigationrealPositiona, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[ComponentType[PickPropsstylechildrenscenenavigationrealPositiona]]
  
}

