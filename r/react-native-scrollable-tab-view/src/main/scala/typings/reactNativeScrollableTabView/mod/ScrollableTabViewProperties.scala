package typings.reactNativeScrollableTabView.mod

import typings.react.mod.Props
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.ScrollViewProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeScrollableTabView.reactNativeScrollableTabViewBooleans.`false`
import typings.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.bottom
import typings.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.overlayBottom
import typings.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.overlayTop
import typings.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollableTabViewProperties extends Props[ScrollableTabView] {
  
  /**
    * props that are applied to root ScrollView/ViewPagerAndroid.
    * Note that overriding defaults set by the library may break functionality; see the source for details.
    */
  var contentProps: js.UndefOr[ScrollViewProps] = js.native
  
  /**
    * the index of the initially selected tab, defaults to 0 === first tab
    */
  var initialPage: js.UndefOr[Double] = js.native
  
  /**
    * disables horizontal dragging to scroll between tabs, default is false.
    */
  var locked: js.UndefOr[Boolean] = js.native
  
  /**
    * function to call when tab changes, should accept 1 argument which is
    * an Object containing two keys: i: the index of the tab that is selected, ref: the ref of the
    * tab that is selected
    */
  var onChangeTab: js.UndefOr[js.Function1[/* value */ ChangeTabProperties, Unit]] = js.native
  
  /**
    * function to call when the pages are sliding,
    * should accept 1 argument which is an Float number representing the page position in the slide frame.
    */
  var onScroll: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  
  /**
    * set selected tab(can be buggy see
    * https://github.com/skv-headless/react-native-scrollable-tab-view/issues/126
    */
  var page: js.UndefOr[Double] = js.native
  
  /**
    * pre-render nearby # sibling, Infinity === render all
    * the siblings, default to 0 === render current page.
    */
  var prerenderingSiblingsNumber: js.UndefOr[Double] = js.native
  
  /**
    * accept 1 argument props and should return a component
    * to use as the tab bar. The component has goToPage, tabs, activeTab and ref added to the props,
    * and should implement setAnimationValue to be able to animate itself along with the tab content.
    * You can manually pass the props to the TabBar component.
    */
  var renderTabBar: js.UndefOr[
    (js.Function1[/* props */ typings.reactNativeScrollableTabView.anon.TabBarProps, Element]) | `false`
  ] = js.native
  
  /**
    * on tab press change tab without animation.
    */
  var scrollWithoutAnimation: js.UndefOr[Boolean] = js.native
  
  /**
    * style (View.propTypes.style)
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * color of the default tab bar's text when active, defaults to navy
    */
  var tabBarActiveTextColor: js.UndefOr[String] = js.native
  
  /**
    * color of the default tab bar's background, defaults to white
    */
  var tabBarBackgroundColor: js.UndefOr[String] = js.native
  
  /**
    * color of the default tab bar's text when inactive, defaults to black
    */
  var tabBarInactiveTextColor: js.UndefOr[String] = js.native
  
  /**
    * Defaults to "top".
    * "bottom" to position the tab bar below content.
    * "overlayTop" or "overlayBottom" for a semitransparent tab bar that overlays content. Custom
    * tab bars must consume a style prop on their outer element to support this feature: style={this.props.style}.
    */
  var tabBarPosition: js.UndefOr[top | bottom | overlayTop | overlayBottom] = js.native
  
  /**
    * additional styles to the tab bar's text
    */
  var tabBarTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  /**
    * style of the default tab bar's underline
    */
  var tabBarUnderlineStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object ScrollableTabViewProperties {
  
  @scala.inline
  def apply(): ScrollableTabViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollableTabViewProperties]
  }
  
  @scala.inline
  implicit class ScrollableTabViewPropertiesOps[Self <: ScrollableTabViewProperties] (val x: Self) extends AnyVal {
    
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
    def setContentProps(value: ScrollViewProps): Self = this.set("contentProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentProps: Self = this.set("contentProps", js.undefined)
    
    @scala.inline
    def setInitialPage(value: Double): Self = this.set("initialPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialPage: Self = this.set("initialPage", js.undefined)
    
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocked: Self = this.set("locked", js.undefined)
    
    @scala.inline
    def setOnChangeTab(value: /* value */ ChangeTabProperties => Unit): Self = this.set("onChangeTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChangeTab: Self = this.set("onChangeTab", js.undefined)
    
    @scala.inline
    def setOnScroll(value: /* value */ Double => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPrerenderingSiblingsNumber(value: Double): Self = this.set("prerenderingSiblingsNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrerenderingSiblingsNumber: Self = this.set("prerenderingSiblingsNumber", js.undefined)
    
    @scala.inline
    def setRenderTabBarFunction1(value: /* props */ typings.reactNativeScrollableTabView.anon.TabBarProps => Element): Self = this.set("renderTabBar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderTabBar(
      value: (js.Function1[/* props */ typings.reactNativeScrollableTabView.anon.TabBarProps, Element]) | `false`
    ): Self = this.set("renderTabBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderTabBar: Self = this.set("renderTabBar", js.undefined)
    
    @scala.inline
    def setScrollWithoutAnimation(value: Boolean): Self = this.set("scrollWithoutAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollWithoutAnimation: Self = this.set("scrollWithoutAnimation", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setTabBarActiveTextColor(value: String): Self = this.set("tabBarActiveTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarActiveTextColor: Self = this.set("tabBarActiveTextColor", js.undefined)
    
    @scala.inline
    def setTabBarBackgroundColor(value: String): Self = this.set("tabBarBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarBackgroundColor: Self = this.set("tabBarBackgroundColor", js.undefined)
    
    @scala.inline
    def setTabBarInactiveTextColor(value: String): Self = this.set("tabBarInactiveTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarInactiveTextColor: Self = this.set("tabBarInactiveTextColor", js.undefined)
    
    @scala.inline
    def setTabBarPosition(value: top | bottom | overlayTop | overlayBottom): Self = this.set("tabBarPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarPosition: Self = this.set("tabBarPosition", js.undefined)
    
    @scala.inline
    def setTabBarTextStyle(value: StyleProp[TextStyle]): Self = this.set("tabBarTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarTextStyle: Self = this.set("tabBarTextStyle", js.undefined)
    
    @scala.inline
    def setTabBarTextStyleNull: Self = this.set("tabBarTextStyle", null)
    
    @scala.inline
    def setTabBarUnderlineStyle(value: StyleProp[ViewStyle]): Self = this.set("tabBarUnderlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarUnderlineStyle: Self = this.set("tabBarUnderlineStyle", js.undefined)
    
    @scala.inline
    def setTabBarUnderlineStyleNull: Self = this.set("tabBarUnderlineStyle", null)
  }
}
