package typings.reactDashNativeDashScrollableDashTabDashView

import typings.react.reactMod._Global_.JSX.Element
import typings.reactDashNative.reactDashNativeMod.Animated.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveTab extends js.Object {
  var activeTab: js.UndefOr[Double] = js.undefined
  var containerWidth: js.UndefOr[Double] = js.undefined
  var goToPage: js.UndefOr[js.Function1[/* pageNumber */ Double, Unit]] = js.undefined
  var scrollValue: js.UndefOr[Value] = js.undefined
  var tabs: js.UndefOr[js.Array[Element]] = js.undefined
}

object Anon_ActiveTab {
  @scala.inline
  def apply(
    activeTab: Int | Double = null,
    containerWidth: Int | Double = null,
    goToPage: /* pageNumber */ Double => Unit = null,
    scrollValue: Value = null,
    tabs: js.Array[Element] = null
  ): Anon_ActiveTab = {
    val __obj = js.Dynamic.literal()
    if (activeTab != null) __obj.updateDynamic("activeTab")(activeTab.asInstanceOf[js.Any])
    if (containerWidth != null) __obj.updateDynamic("containerWidth")(containerWidth.asInstanceOf[js.Any])
    if (goToPage != null) __obj.updateDynamic("goToPage")(js.Any.fromFunction1(goToPage))
    if (scrollValue != null) __obj.updateDynamic("scrollValue")(scrollValue)
    if (tabs != null) __obj.updateDynamic("tabs")(tabs)
    __obj.asInstanceOf[Anon_ActiveTab]
  }
}

