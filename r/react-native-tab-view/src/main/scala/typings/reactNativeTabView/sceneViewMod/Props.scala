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

/* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/src/types.SceneRendererProps & react-native-tab-view.react-native-tab-view/lib/typescript/src/types.EventEmitterProps & {  navigationState :react-native-tab-view.react-native-tab-view/lib/typescript/src/types.NavigationState<T>,   lazy :boolean,   lazyPreloadDistance :number,   index :number, children (props : {  loading :boolean}): react.react.ReactNode,   style :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined} */
@js.native
trait Props[T /* <: Route */] extends js.Object {
  var index: Double = js.native
  var layout: Layout = js.native
  var `lazy`: Boolean = js.native
  var lazyPreloadDistance: Double = js.native
  var navigationState: NavigationState[T] = js.native
  var position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  @JSName("addListener")
  def addListener_enter(`type`: enter, listener: Listener): Unit = js.native
  def children(props: Loading): ReactNode = js.native
  def jumpTo(key: String): Unit = js.native
  @JSName("removeListener")
  def removeListener_enter(`type`: enter, listener: Listener): Unit = js.native
}

object Props {
  @scala.inline
  def apply[/* <: typings.reactNativeTabView.typesMod.Route */ T](
    addListener: (enter, Listener) => Unit,
    children: Loading => ReactNode,
    index: Double,
    jumpTo: String => Unit,
    layout: Layout,
    `lazy`: Boolean,
    lazyPreloadDistance: Double,
    navigationState: NavigationState[T],
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    removeListener: (enter, Listener) => Unit
  ): Props[T] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), children = js.Any.fromFunction1(children), index = index.asInstanceOf[js.Any], jumpTo = js.Any.fromFunction1(jumpTo), layout = layout.asInstanceOf[js.Any], lazyPreloadDistance = lazyPreloadDistance.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], removeListener = js.Any.fromFunction2(removeListener))
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props[_], /* <: typings.reactNativeTabView.typesMod.Route */ T] (val x: Self with Props[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddListener(value: (enter, Listener) => Unit): Self = this.set("addListener", js.Any.fromFunction2(value))
    @scala.inline
    def setChildren(value: Loading => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setJumpTo(value: String => Unit): Self = this.set("jumpTo", js.Any.fromFunction1(value))
    @scala.inline
    def setLayout(value: Layout): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def setLazy(value: Boolean): Self = this.set("lazy", value.asInstanceOf[js.Any])
    @scala.inline
    def setLazyPreloadDistance(value: Double): Self = this.set("lazyPreloadDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigationState(value: NavigationState[T]): Self = this.set("navigationState", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
    ): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveListener(value: (enter, Listener) => Unit): Self = this.set("removeListener", js.Any.fromFunction2(value))
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
  
}

