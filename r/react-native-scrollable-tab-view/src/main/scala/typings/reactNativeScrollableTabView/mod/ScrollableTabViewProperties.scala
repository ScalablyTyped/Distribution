package typings.reactNativeScrollableTabView.mod

import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
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
import scala.scalajs.js.annotation._

trait ScrollableTabViewProperties extends Props[ScrollableTabView] {
  /**
    * props that are applied to root ScrollView/ViewPagerAndroid.
    * Note that overriding defaults set by the library may break functionality; see the source for details.
    */
  var contentProps: js.UndefOr[ScrollViewProps] = js.undefined
  /**
    * the index of the initially selected tab, defaults to 0 === first tab
    */
  var initialPage: js.UndefOr[Double] = js.undefined
  /**
    * disables horizontal dragging to scroll between tabs, default is false.
    */
  var locked: js.UndefOr[Boolean] = js.undefined
  /**
    * function to call when tab changes, should accept 1 argument which is
    * an Object containing two keys: i: the index of the tab that is selected, ref: the ref of the
    * tab that is selected
    */
  var onChangeTab: js.UndefOr[js.Function1[/* value */ ChangeTabProperties, Unit]] = js.undefined
  /**
    * function to call when the pages are sliding,
    * should accept 1 argument which is an Float number representing the page position in the slide frame.
    */
  var onScroll: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  /**
    * set selected tab(can be buggy see
    * https://github.com/skv-headless/react-native-scrollable-tab-view/issues/126
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * pre-render nearby # sibling, Infinity === render all
    * the siblings, default to 0 === render current page.
    */
  var prerenderingSiblingsNumber: js.UndefOr[Double] = js.undefined
  /**
    * accept 1 argument props and should return a component
    * to use as the tab bar. The component has goToPage, tabs, activeTab and ref added to the props,
    * and should implement setAnimationValue to be able to animate itself along with the tab content.
    * You can manually pass the props to the TabBar component.
    */
  var renderTabBar: js.UndefOr[
    (js.Function1[/* props */ typings.reactNativeScrollableTabView.anon.TabBarProps, Element]) | `false`
  ] = js.undefined
  /**
    * on tab press change tab without animation.
    */
  var scrollWithoutAnimation: js.UndefOr[Boolean] = js.undefined
  /**
    * style (View.propTypes.style)
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * color of the default tab bar's text when active, defaults to navy
    */
  var tabBarActiveTextColor: js.UndefOr[String] = js.undefined
  /**
    * color of the default tab bar's background, defaults to white
    */
  var tabBarBackgroundColor: js.UndefOr[String] = js.undefined
  /**
    * color of the default tab bar's text when inactive, defaults to black
    */
  var tabBarInactiveTextColor: js.UndefOr[String] = js.undefined
  /**
    * Defaults to "top".
    * "bottom" to position the tab bar below content.
    * "overlayTop" or "overlayBottom" for a semitransparent tab bar that overlays content. Custom
    * tab bars must consume a style prop on their outer element to support this feature: style={this.props.style}.
    */
  var tabBarPosition: js.UndefOr[top | bottom | overlayTop | overlayBottom] = js.undefined
  /**
    * additional styles to the tab bar's text
    */
  var tabBarTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * style of the default tab bar's underline
    */
  var tabBarUnderlineStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object ScrollableTabViewProperties {
  @scala.inline
  def apply(
    children: ReactNode = null,
    contentProps: ScrollViewProps = null,
    initialPage: js.UndefOr[Double] = js.undefined,
    key: Key = null,
    locked: js.UndefOr[Boolean] = js.undefined,
    onChangeTab: /* value */ ChangeTabProperties => Unit = null,
    onScroll: /* value */ Double => Unit = null,
    page: js.UndefOr[Double] = js.undefined,
    prerenderingSiblingsNumber: js.UndefOr[Double] = js.undefined,
    ref: js.UndefOr[Null | LegacyRef[ScrollableTabView]] = js.undefined,
    renderTabBar: (js.Function1[/* props */ typings.reactNativeScrollableTabView.anon.TabBarProps, Element]) | `false` = null,
    scrollWithoutAnimation: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    tabBarActiveTextColor: String = null,
    tabBarBackgroundColor: String = null,
    tabBarInactiveTextColor: String = null,
    tabBarPosition: top | bottom | overlayTop | overlayBottom = null,
    tabBarTextStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    tabBarUnderlineStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined
  ): ScrollableTabViewProperties = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (contentProps != null) __obj.updateDynamic("contentProps")(contentProps.asInstanceOf[js.Any])
    if (!js.isUndefined(initialPage)) __obj.updateDynamic("initialPage")(initialPage.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.get.asInstanceOf[js.Any])
    if (onChangeTab != null) __obj.updateDynamic("onChangeTab")(js.Any.fromFunction1(onChangeTab))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(prerenderingSiblingsNumber)) __obj.updateDynamic("prerenderingSiblingsNumber")(prerenderingSiblingsNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (renderTabBar != null) __obj.updateDynamic("renderTabBar")(renderTabBar.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollWithoutAnimation)) __obj.updateDynamic("scrollWithoutAnimation")(scrollWithoutAnimation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabBarActiveTextColor != null) __obj.updateDynamic("tabBarActiveTextColor")(tabBarActiveTextColor.asInstanceOf[js.Any])
    if (tabBarBackgroundColor != null) __obj.updateDynamic("tabBarBackgroundColor")(tabBarBackgroundColor.asInstanceOf[js.Any])
    if (tabBarInactiveTextColor != null) __obj.updateDynamic("tabBarInactiveTextColor")(tabBarInactiveTextColor.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(tabBarTextStyle)) __obj.updateDynamic("tabBarTextStyle")(tabBarTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(tabBarUnderlineStyle)) __obj.updateDynamic("tabBarUnderlineStyle")(tabBarUnderlineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollableTabViewProperties]
  }
}

