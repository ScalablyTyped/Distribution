package typings.reactNativeTabView.pagerMod

import typings.react.mod.Component
import typings.reactNativeTabView.anon.ChildPanGestureHandlerRefs
import typings.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pager[T /* <: Route */]
  extends Component[Props[T], ComponentState, js.Any] {
  var addListener: js.Any = js.native
  var clock: js.Any = js.native
  var currentIndexValue: js.Any = js.native
  var enterListeners: js.Any = js.native
  var extrapolatedPosition: js.Any = js.native
  var gestureHandlerRef: js.Any = js.native
  var gestureState: js.Any = js.native
  var gestureX: js.Any = js.native
  var gesturesEnabled: js.Any = js.native
  var getTranslateX: js.Any = js.native
  var handleEnteredIndexChange: js.Any = js.native
  var handleGestureEvent: js.Any = js.native
  var index: js.Any = js.native
  var indexAtSwipeEnd: js.Any = js.native
  var initialVelocityForSpring: js.Any = js.native
  var interactionHandle: js.Any = js.native
  var isSwipeGesture: js.Any = js.native
  var isSwiping: js.Any = js.native
  var jumpTo: js.Any = js.native
  var jumpToIndex: js.Any = js.native
  var lastEnteredIndex: js.Any = js.native
  var layoutWidth: js.Any = js.native
  var maybeCancel: js.Any = js.native
  var nextIndex: js.Any = js.native
  var offsetX: js.Any = js.native
  var pendingIndexValue: js.Any = js.native
  var position: js.Any = js.native
  var previouslyFocusedTextInput: js.Any = js.native
  var progress: js.Any = js.native
  var providerVal: js.Any = js.native
  var removeListener: js.Any = js.native
  var routesLength: js.Any = js.native
  var springConfig: js.Any = js.native
  var springVelocityScale: js.Any = js.native
  @JSName("state")
  var state_Pager: ChildPanGestureHandlerRefs = js.native
  var swipeVelocityImpact: js.Any = js.native
  var timingConfig: js.Any = js.native
  var toggleEnabled: js.Any = js.native
  var transitionTo: js.Any = js.native
  var translateX: js.Any = js.native
  var velocityX: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MPager(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MPager(prevProps: Props[T]): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MPager(): Unit = js.native
}

