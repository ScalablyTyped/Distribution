package typings.reactNativeTabView.anon

import typings.react.mod.global.JSX.Element
import typings.reactNativeTabView.pagerMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GestureHandlerProps extends js.Object {
  var keyboardDismissMode: String
  var `lazy`: Boolean
  var lazyPreloadDistance: Double
  var removeClippedSubviews: Boolean
  var swipeEnabled: Boolean
  var tabBarPosition: String
  def renderLazyPlaceholder(): Null
  def renderPager(props: Props[_]): Element
  def renderTabBar[P /* <: typings.reactNativeTabView.typesMod.Route */](props: typings.reactNativeTabView.tabBarMod.Props[P]): Element
}

object GestureHandlerProps {
  @scala.inline
  def apply(
    keyboardDismissMode: String,
    `lazy`: Boolean,
    lazyPreloadDistance: Double,
    removeClippedSubviews: Boolean,
    renderLazyPlaceholder: () => Null,
    renderPager: Props[_] => Element,
    renderTabBar: typings.reactNativeTabView.tabBarMod.Props[js.Any] => Element,
    swipeEnabled: Boolean,
    tabBarPosition: String
  ): GestureHandlerProps = {
    val __obj = js.Dynamic.literal(keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], lazyPreloadDistance = lazyPreloadDistance.asInstanceOf[js.Any], removeClippedSubviews = removeClippedSubviews.asInstanceOf[js.Any], renderLazyPlaceholder = js.Any.fromFunction0(renderLazyPlaceholder), renderPager = js.Any.fromFunction1(renderPager), renderTabBar = js.Any.fromFunction1(renderTabBar), swipeEnabled = swipeEnabled.asInstanceOf[js.Any], tabBarPosition = tabBarPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureHandlerProps]
  }
}

