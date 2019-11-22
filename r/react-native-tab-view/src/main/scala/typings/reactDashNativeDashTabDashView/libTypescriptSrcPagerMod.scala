package typings.reactDashNativeDashTabDashView

import typings.react.reactMod.Component
import typings.reactDashNativeDashTabDashView.libTypescriptSrcPagerMod.Pager
import typings.reactDashNativeDashTabDashView.libTypescriptSrcPagerMod.Props
import typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.PagerCommonProps
import typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-tab-view/lib/typescript/src/Pager", JSImport.Namespace)
@js.native
object libTypescriptSrcPagerMod extends js.Object {
  @js.native
  trait Pager[T /* <: Route */]
    extends Component[Props[T], js.Object, js.Any] {
    var addListener: js.Any = js.native
    var clock: js.Any = js.native
    var currentIndexValue: js.Any = js.native
    var enterListeners: js.Any = js.native
    var extrapolatedPosition: js.Any = js.native
    var gestureState: js.Any = js.native
    var gestureX: js.Any = js.native
    var getTranslateX: js.Any = js.native
    var handleEnteredIndexChange: js.Any = js.native
    var handleGestureEvent: js.Any = js.native
    var index: js.Any = js.native
    var indexAtSwipeEnd: js.Any = js.native
    var initialVelocityForSpring: js.Any = js.native
    var isSwipeGesture: js.Any = js.native
    var isSwiping: js.Any = js.native
    var jumpTo: js.Any = js.native
    var jumpToIndex: js.Any = js.native
    var lastEnteredIndex: js.Any = js.native
    var layoutWidth: js.Any = js.native
    var nextIndex: js.Any = js.native
    var offsetX: js.Any = js.native
    var pendingIndexValue: js.Any = js.native
    var position: js.Any = js.native
    var previouslyFocusedTextInput: js.Any = js.native
    var progress: js.Any = js.native
    var removeListener: js.Any = js.native
    var routesLength: js.Any = js.native
    var springConfig: js.Any = js.native
    var springVelocityScale: js.Any = js.native
    var swipeVelocityImpact: js.Any = js.native
    var timingConfig: js.Any = js.native
    var transitionTo: js.Any = js.native
    var translateX: js.Any = js.native
    var velocityX: js.Any = js.native
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPager(prevProps: Props[T]): Unit = js.native
  }
  
  @js.native
  class default[T /* <: Route */] () extends Pager[T]
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Anon_SpringVelocityScale = js.native
  }
  
  type Props[T /* <: Route */] = PagerCommonProps with Anon_ChildrenGestureHandlerProps[T]
}

