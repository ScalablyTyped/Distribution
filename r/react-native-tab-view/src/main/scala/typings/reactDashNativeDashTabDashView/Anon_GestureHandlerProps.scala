package typings.reactDashNativeDashTabDashView

import typings.react.reactMod._Global_.JSX.Element
import typings.reactDashNativeDashTabDashView.libTypescriptSrcTabBarMod.Props
import typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GestureHandlerProps extends js.Object {
  var keyboardDismissMode: String
  var `lazy`: Boolean
  var lazyPreloadDistance: Double
  var removeClippedSubviews: Boolean
  var swipeEnabled: Boolean
  var tabBarPosition: String
  def renderLazyPlaceholder(): Null
  def renderTabBar[P /* <: Route */](props: Props[P]): Element
}

object Anon_GestureHandlerProps {
  @scala.inline
  def apply(
    keyboardDismissMode: String,
    `lazy`: Boolean,
    lazyPreloadDistance: Double,
    removeClippedSubviews: Boolean,
    renderLazyPlaceholder: () => Null,
    renderTabBar: Props[js.Any] => Element,
    swipeEnabled: Boolean,
    tabBarPosition: String
  ): Anon_GestureHandlerProps = {
    val __obj = js.Dynamic.literal(keyboardDismissMode = keyboardDismissMode, lazyPreloadDistance = lazyPreloadDistance, removeClippedSubviews = removeClippedSubviews, renderLazyPlaceholder = js.Any.fromFunction0(renderLazyPlaceholder), renderTabBar = js.Any.fromFunction1(renderTabBar), swipeEnabled = swipeEnabled, tabBarPosition = tabBarPosition)
    __obj.updateDynamic("lazy")(`lazy`)
    __obj.asInstanceOf[Anon_GestureHandlerProps]
  }
}

