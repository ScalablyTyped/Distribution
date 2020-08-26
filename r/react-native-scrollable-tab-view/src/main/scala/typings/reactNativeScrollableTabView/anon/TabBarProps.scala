package typings.reactNativeScrollableTabView.anon

import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.Animated.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-scrollable-tab-view.react-native-scrollable-tab-view.TabBarProps<{}> */
@js.native
trait TabBarProps extends js.Object {
  var activeTab: js.UndefOr[Double] = js.native
  var containerWidth: js.UndefOr[Double] = js.native
  var goToPage: js.UndefOr[js.Function1[/* pageNumber */ Double, Unit]] = js.native
  var scrollValue: js.UndefOr[Value] = js.native
  var tabs: js.UndefOr[js.Array[Element]] = js.native
}

object TabBarProps {
  @scala.inline
  def apply(): TabBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabBarProps]
  }
  @scala.inline
  implicit class TabBarPropsOps[Self <: TabBarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveTab(value: Double): Self = this.set("activeTab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveTab: Self = this.set("activeTab", js.undefined)
    @scala.inline
    def setContainerWidth(value: Double): Self = this.set("containerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerWidth: Self = this.set("containerWidth", js.undefined)
    @scala.inline
    def setGoToPage(value: /* pageNumber */ Double => Unit): Self = this.set("goToPage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGoToPage: Self = this.set("goToPage", js.undefined)
    @scala.inline
    def setScrollValue(value: Value): Self = this.set("scrollValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollValue: Self = this.set("scrollValue", js.undefined)
    @scala.inline
    def setTabsVarargs(value: Element*): Self = this.set("tabs", js.Array(value :_*))
    @scala.inline
    def setTabs(value: js.Array[Element]): Self = this.set("tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabs: Self = this.set("tabs", js.undefined)
  }
  
}

