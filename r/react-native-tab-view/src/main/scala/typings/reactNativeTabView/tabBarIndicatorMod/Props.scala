package typings.reactNativeTabView.tabBarIndicatorMod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeTabView.typesMod.Layout
import typings.reactNativeTabView.typesMod.NavigationState
import typings.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/src/types.SceneRendererProps & {  navigationState  :react-native-tab-view.react-native-tab-view/lib/typescript/src/types.NavigationState<T>,   width  :string,   style ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>,   getTabWidth  :react-native-tab-view.react-native-tab-view/lib/typescript/src/TabBarIndicator.GetTabWidth} */
trait Props[T /* <: Route */] extends js.Object {
  var getTabWidth: GetTabWidth
  var layout: Layout
  var navigationState: NavigationState[T]
  var position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var width: String
  def jumpTo(key: String): Unit
}

object Props {
  @scala.inline
  def apply[T /* <: Route */](
    getTabWidth: /* index */ Double => Double,
    jumpTo: String => Unit,
    layout: Layout,
    navigationState: NavigationState[T],
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    width: String,
    style: StyleProp[ViewStyle] = null
  ): Props[T] = {
    val __obj = js.Dynamic.literal(getTabWidth = js.Any.fromFunction1(getTabWidth), jumpTo = js.Any.fromFunction1(jumpTo), layout = layout.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
}

