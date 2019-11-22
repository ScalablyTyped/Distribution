package typings.reactDashNativeDashTabDashView

import org.scalablytyped.runtime.Instantiable0
import typings.react.reactMod.ComponentProps
import typings.react.reactMod.ReactNode
import typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.PanGestureHandler
import typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.EventEmitterProps
import typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.Layout
import typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.NavigationState
import typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenGestureHandlerProps[T /* <: Route */] extends js.Object {
  var gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]]
  var layout: Layout
  var navigationState: NavigationState[T]
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  def children(props: EventEmitterProps with Anon_Children): ReactNode
  def onIndexChange(index: Double): Unit
}

object Anon_ChildrenGestureHandlerProps {
  @scala.inline
  def apply[T /* <: Route */](
    children: EventEmitterProps with Anon_Children => ReactNode,
    gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]],
    layout: Layout,
    navigationState: NavigationState[T],
    onIndexChange: Double => Unit,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  ): Anon_ChildrenGestureHandlerProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), gestureHandlerProps = gestureHandlerProps.asInstanceOf[js.Any], layout = layout, navigationState = navigationState, onIndexChange = js.Any.fromFunction1(onIndexChange))
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews)
    __obj.asInstanceOf[Anon_ChildrenGestureHandlerProps[T]]
  }
}

