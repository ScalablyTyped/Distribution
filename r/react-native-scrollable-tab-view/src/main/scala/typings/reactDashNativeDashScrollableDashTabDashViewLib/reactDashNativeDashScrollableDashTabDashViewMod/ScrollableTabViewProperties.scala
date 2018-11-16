package typings
package reactDashNativeDashScrollableDashTabDashViewLib.reactDashNativeDashScrollableDashTabDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ScrollableTabViewProperties
  extends reactLib.reactMod.ReactNs.Props[ScrollableTabView] {
  /**
       * props that are applied to root ScrollView/ViewPagerAndroid.
       * Note that overriding defaults set by the library may break functionality; see the source for details.
       */
  var contentProps: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ScrollViewProps] = js.undefined
  /**
       * the index of the initially selected tab, defaults to 0 === first tab
       */
  var initialPage: js.UndefOr[scala.Double] = js.undefined
  /**
       * disables horizontal dragging to scroll between tabs, default is false.
       */
  var locked: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * function to call when tab changes, should accept 1 argument which is
       * an Object containing two keys: i: the index of the tab that is selected, ref: the ref of the
       * tab that is selected
       */
  var onChangeTab: js.UndefOr[js.Function1[/* value */ ChangeTabProperties, scala.Unit]] = js.undefined
  /**
       * function to call when the pages are sliding,
       * should accept 1 argument which is an Float number representing the page position in the slide frame.
       */
  var onScroll: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  /**
       * set selected tab(can be buggy see
       * https://github.com/skv-headless/react-native-scrollable-tab-view/issues/126
       */
  var page: js.UndefOr[scala.Double] = js.undefined
  /**
       * pre-render nearby # sibling, Infinity === render all
       * the siblings, default to 0 === render current page.
       */
  var prerenderingSiblingsNumber: js.UndefOr[scala.Double] = js.undefined
  /**
       * accept 1 argument props and should return a component
       * to use as the tab bar. The component has goToPage, tabs, activeTab and ref added to the props,
       * and should implement setAnimationValue to be able to animate itself along with the tab content.
       * You can manually pass the props to the TabBar component.
       */
  var renderTabBar: js.UndefOr[
    (js.Function1[/* props */ TabBarProps[js.Object], reactLib.reactMod.Global.JSXNs.Element]) | reactDashNativeDashScrollableDashTabDashViewLib.reactDashNativeDashScrollableDashTabDashViewLibNumbers.`false`
  ] = js.undefined
  /**
       * on tab press change tab without animation.
       */
  var scrollWithoutAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * style (View.propTypes.style)
       */
  var style: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  /**
       * color of the default tab bar's text when active, defaults to navy
       */
  var tabBarActiveTextColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * color of the default tab bar's background, defaults to white
       */
  var tabBarBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * color of the default tab bar's text when inactive, defaults to black
       */
  var tabBarInactiveTextColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Defaults to "top".
       * "bottom" to position the tab bar below content.
       * "overlayTop" or "overlayBottom" for a semitransparent tab bar that overlays content. Custom
       * tab bars must consume a style prop on their outer element to support this feature: style={this.props.style}.
       */
  var tabBarPosition: js.UndefOr[
    reactDashNativeDashScrollableDashTabDashViewLib.reactDashNativeDashScrollableDashTabDashViewLibStrings.top | reactDashNativeDashScrollableDashTabDashViewLib.reactDashNativeDashScrollableDashTabDashViewLibStrings.bottom | reactDashNativeDashScrollableDashTabDashViewLib.reactDashNativeDashScrollableDashTabDashViewLibStrings.overlayTop | reactDashNativeDashScrollableDashTabDashViewLib.reactDashNativeDashScrollableDashTabDashViewLibStrings.overlayBottom
  ] = js.undefined
  /**
       * additional styles to the tab bar's text
       */
  var tabBarTextStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.TextStyle] = js.undefined
  /**
       * style of the default tab bar's underline
       */
  var tabBarUnderlineStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
}

