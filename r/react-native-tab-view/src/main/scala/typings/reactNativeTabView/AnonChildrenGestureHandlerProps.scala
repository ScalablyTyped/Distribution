package typings.reactNativeTabView

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.ComponentProps
import typings.react.mod.ReactNode
import typings.reactNativeGestureHandler.mod.PanGestureHandler
import typings.reactNativeTabView.typesMod.EventEmitterProps
import typings.reactNativeTabView.typesMod.Layout
import typings.reactNativeTabView.typesMod.NavigationState
import typings.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenGestureHandlerProps[T /* <: Route */] extends js.Object {
  var gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]]
  var layout: Layout
  var navigationState: NavigationState[T]
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  def children(props: EventEmitterProps with AnonChildren): ReactNode
  def onIndexChange(index: Double): Unit
}

object AnonChildrenGestureHandlerProps {
  @scala.inline
  def apply[T /* <: Route */](
    children: EventEmitterProps with AnonChildren => ReactNode,
    gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]],
    layout: Layout,
    navigationState: NavigationState[T],
    onIndexChange: Double => Unit,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  ): AnonChildrenGestureHandlerProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), gestureHandlerProps = gestureHandlerProps.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1(onIndexChange))
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenGestureHandlerProps[T]]
  }
}

