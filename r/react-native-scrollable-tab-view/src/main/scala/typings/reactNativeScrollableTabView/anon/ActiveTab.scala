package typings.reactNativeScrollableTabView.anon

import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.Animated.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveTab extends js.Object {
  var activeTab: js.UndefOr[Double] = js.undefined
  var containerWidth: js.UndefOr[Double] = js.undefined
  var goToPage: js.UndefOr[js.Function1[/* pageNumber */ Double, Unit]] = js.undefined
  var scrollValue: js.UndefOr[Value] = js.undefined
  var tabs: js.UndefOr[js.Array[Element]] = js.undefined
}

object ActiveTab {
  @scala.inline
  def apply(
    activeTab: js.UndefOr[Double] = js.undefined,
    containerWidth: js.UndefOr[Double] = js.undefined,
    goToPage: /* pageNumber */ Double => Unit = null,
    scrollValue: Value = null,
    tabs: js.Array[Element] = null
  ): ActiveTab = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeTab)) __obj.updateDynamic("activeTab")(activeTab.get.asInstanceOf[js.Any])
    if (!js.isUndefined(containerWidth)) __obj.updateDynamic("containerWidth")(containerWidth.get.asInstanceOf[js.Any])
    if (goToPage != null) __obj.updateDynamic("goToPage")(js.Any.fromFunction1(goToPage))
    if (scrollValue != null) __obj.updateDynamic("scrollValue")(scrollValue.asInstanceOf[js.Any])
    if (tabs != null) __obj.updateDynamic("tabs")(tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveTab]
  }
}

