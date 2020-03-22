package typings.reactNativeScrollableTabView

import typings.react.mod._Global_.JSX.Element
import typings.reactNative.mod.Animated.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-scrollable-tab-view.react-native-scrollable-tab-view.TabBarProps<{}> */
trait TabBarProps extends js.Object {
  var activeTab: js.UndefOr[Double] = js.undefined
  var containerWidth: js.UndefOr[Double] = js.undefined
  var goToPage: js.UndefOr[js.Function1[/* pageNumber */ Double, Unit]] = js.undefined
  var scrollValue: js.UndefOr[Value] = js.undefined
  var tabs: js.UndefOr[js.Array[Element]] = js.undefined
}

object TabBarProps {
  @scala.inline
  def apply(
    activeTab: Int | Double = null,
    containerWidth: Int | Double = null,
    goToPage: /* pageNumber */ Double => Unit = null,
    scrollValue: Value = null,
    tabs: js.Array[Element] = null
  ): TabBarProps = {
    val __obj = js.Dynamic.literal()
    if (activeTab != null) __obj.updateDynamic("activeTab")(activeTab.asInstanceOf[js.Any])
    if (containerWidth != null) __obj.updateDynamic("containerWidth")(containerWidth.asInstanceOf[js.Any])
    if (goToPage != null) __obj.updateDynamic("goToPage")(js.Any.fromFunction1(goToPage))
    if (scrollValue != null) __obj.updateDynamic("scrollValue")(scrollValue.asInstanceOf[js.Any])
    if (tabs != null) __obj.updateDynamic("tabs")(tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarProps]
  }
}

