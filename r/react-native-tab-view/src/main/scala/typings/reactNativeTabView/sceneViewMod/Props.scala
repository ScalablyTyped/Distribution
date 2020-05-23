package typings.reactNativeTabView.sceneViewMod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeTabView.anon.Loading
import typings.reactNativeTabView.reactNativeTabViewStrings.enter
import typings.reactNativeTabView.typesMod.Layout
import typings.reactNativeTabView.typesMod.Listener
import typings.reactNativeTabView.typesMod.NavigationState
import typings.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/src/types.SceneRendererProps & react-native-tab-view.react-native-tab-view/lib/typescript/src/types.EventEmitterProps & {  navigationState  :react-native-tab-view.react-native-tab-view/lib/typescript/src/types.NavigationState<T>,   lazy  :boolean,   lazyPreloadDistance  :number,   index  :number, children (props : {  loading  :boolean}): react.react.ReactNode,   style ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>} */
trait Props[T /* <: Route */] extends js.Object {
  var index: Double
  var layout: Layout
  var `lazy`: Boolean
  var lazyPreloadDistance: Double
  var navigationState: NavigationState[T]
  var position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  @JSName("addListener")
  def addListener_enter(`type`: enter, listener: Listener): Unit
  def children(props: Loading): ReactNode
  def jumpTo(key: String): Unit
  @JSName("removeListener")
  def removeListener_enter(`type`: enter, listener: Listener): Unit
}

object Props {
  @scala.inline
  def apply[T](
    addListener: (enter, Listener) => Unit,
    children: Loading => ReactNode,
    index: Double,
    jumpTo: String => Unit,
    layout: Layout,
    `lazy`: Boolean,
    lazyPreloadDistance: Double,
    navigationState: NavigationState[T],
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    removeListener: (enter, Listener) => Unit,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined
  ): Props[T] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), children = js.Any.fromFunction1(children), index = index.asInstanceOf[js.Any], jumpTo = js.Any.fromFunction1(jumpTo), layout = layout.asInstanceOf[js.Any], lazyPreloadDistance = lazyPreloadDistance.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], removeListener = js.Any.fromFunction2(removeListener))
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
}

