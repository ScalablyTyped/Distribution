package typings.reactNativeTabView.scrollPagerMod

import typings.react.mod.Component
import typings.reactNativeTabView.AnonOverscroll
import typings.reactNativeTabView.pagerMod.Props
import typings.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollPager[T /* <: Route */]
  extends Component[Props[T] with AnonOverscroll, State, js.Any] {
  var addListener: js.Any = js.native
  var enterListeners: js.Any = js.native
  var initialOffset: js.Any = js.native
  var interactionHandle: js.Any = js.native
  var jumpTo: js.Any = js.native
  var layoutWidthNode: js.Any = js.native
  var onScroll: js.Any = js.native
  var position: js.Any = js.native
  var relativePosition: js.Any = js.native
  var removeListener: js.Any = js.native
  var scrollTo: js.Any = js.native
  var scrollViewRef: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MScrollPager(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MScrollPager(prevProps: Props[T]): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MScrollPager(): Unit = js.native
}

