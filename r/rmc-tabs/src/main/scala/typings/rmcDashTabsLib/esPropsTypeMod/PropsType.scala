package typings
package rmcDashTabsLib.esPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  /** whether to change tabs with animation | default: true */
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  /** destroy inactive tab | default: false */
  var destroyInactiveTab: js.UndefOr[scala.Boolean] = js.undefined
  /** distance to change tab, width ratio | default: 0.3 */
  var distanceToChangeTab: js.UndefOr[scala.Double] = js.undefined
  /** initial Tab, index or key */
  var initialPage: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** can't render content | default: false */
  var noRenderContent: js.UndefOr[scala.Boolean] = js.undefined
  /** callback when tab is switched */
  var onChange: js.UndefOr[
    js.Function2[
      /* tab */ rmcDashTabsLib.esModelsMod.ModelsNs.TabData, 
      /* index */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /** on tab click */
  var onTabClick: js.UndefOr[
    js.Function2[
      /* tab */ rmcDashTabsLib.esModelsMod.ModelsNs.TabData, 
      /* index */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /** current tab, index or key */
  var page: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** pre-render nearby # sibling, Infinity: render all the siblings, 0: render current page | default: 1 */
  var prerenderingSiblingsNumber: js.UndefOr[scala.Double] = js.undefined
  /** render for TabBar */
  var renderTabBar: js.UndefOr[
    (js.Function1[/* props */ TabBarPropsType, reactLib.reactMod.ReactNode]) | rmcDashTabsLib.rmcDashTabsLibNumbers.`false`
  ] = js.undefined
  /** whether to switch tabs with swipe gestrue in the content | default: true */
  var swipeable: js.UndefOr[scala.Boolean] = js.undefined
  /** tabBar active text color */
  var tabBarActiveTextColor: js.UndefOr[java.lang.String] = js.undefined
  /** tabBar background color */
  var tabBarBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /** tabBar inactive text color */
  var tabBarInactiveTextColor: js.UndefOr[java.lang.String] = js.undefined
  /** TabBar's position | default: top */
  var tabBarPosition: js.UndefOr[
    rmcDashTabsLib.rmcDashTabsLibStrings.top | rmcDashTabsLib.rmcDashTabsLibStrings.bottom | rmcDashTabsLib.rmcDashTabsLibStrings.left | rmcDashTabsLib.rmcDashTabsLibStrings.right
  ] = js.undefined
  /** tabBar text style */
  var tabBarTextStyle: js.UndefOr[reactLib.reactMod.CSSProperties | js.Any] = js.undefined
  /** tabBar underline style */
  var tabBarUnderlineStyle: js.UndefOr[reactLib.reactMod.CSSProperties | js.Any] = js.undefined
  /** tab paging direction | default: horizontal */
  var tabDirection: js.UndefOr[
    rmcDashTabsLib.rmcDashTabsLibStrings.horizontal | rmcDashTabsLib.rmcDashTabsLibStrings.vertical
  ] = js.undefined
  /** tabs data */
  var tabs: js.Array[rmcDashTabsLib.esModelsMod.ModelsNs.TabData]
  /** use left instead of transform | default: false */
  var useLeftInsteadTransform: js.UndefOr[scala.Boolean] = js.undefined
  /** use scroll follow pan | default: true */
  var useOnPan: js.UndefOr[scala.Boolean] = js.undefined
  /** use paged | default: true */
  var usePaged: js.UndefOr[scala.Boolean] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    tabs: js.Array[rmcDashTabsLib.esModelsMod.ModelsNs.TabData],
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    destroyInactiveTab: js.UndefOr[scala.Boolean] = js.undefined,
    distanceToChangeTab: scala.Int | scala.Double = null,
    initialPage: scala.Double | java.lang.String = null,
    noRenderContent: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: (/* tab */ rmcDashTabsLib.esModelsMod.ModelsNs.TabData, /* index */ scala.Double) => scala.Unit = null,
    onTabClick: (/* tab */ rmcDashTabsLib.esModelsMod.ModelsNs.TabData, /* index */ scala.Double) => scala.Unit = null,
    page: scala.Double | java.lang.String = null,
    prerenderingSiblingsNumber: scala.Int | scala.Double = null,
    renderTabBar: (js.Function1[/* props */ TabBarPropsType, reactLib.reactMod.ReactNode]) | rmcDashTabsLib.rmcDashTabsLibNumbers.`false` = null,
    swipeable: js.UndefOr[scala.Boolean] = js.undefined,
    tabBarActiveTextColor: java.lang.String = null,
    tabBarBackgroundColor: java.lang.String = null,
    tabBarInactiveTextColor: java.lang.String = null,
    tabBarPosition: rmcDashTabsLib.rmcDashTabsLibStrings.top | rmcDashTabsLib.rmcDashTabsLibStrings.bottom | rmcDashTabsLib.rmcDashTabsLibStrings.left | rmcDashTabsLib.rmcDashTabsLibStrings.right = null,
    tabBarTextStyle: reactLib.reactMod.CSSProperties | js.Any = null,
    tabBarUnderlineStyle: reactLib.reactMod.CSSProperties | js.Any = null,
    tabDirection: rmcDashTabsLib.rmcDashTabsLibStrings.horizontal | rmcDashTabsLib.rmcDashTabsLibStrings.vertical = null,
    useLeftInsteadTransform: js.UndefOr[scala.Boolean] = js.undefined,
    useOnPan: js.UndefOr[scala.Boolean] = js.undefined,
    usePaged: js.UndefOr[scala.Boolean] = js.undefined
  ): PropsType = {
    val __obj = js.Dynamic.literal(tabs = tabs)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (!js.isUndefined(destroyInactiveTab)) __obj.updateDynamic("destroyInactiveTab")(destroyInactiveTab)
    if (distanceToChangeTab != null) __obj.updateDynamic("distanceToChangeTab")(distanceToChangeTab.asInstanceOf[js.Any])
    if (initialPage != null) __obj.updateDynamic("initialPage")(initialPage.asInstanceOf[js.Any])
    if (!js.isUndefined(noRenderContent)) __obj.updateDynamic("noRenderContent")(noRenderContent)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(js.Any.fromFunction2(onTabClick))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (prerenderingSiblingsNumber != null) __obj.updateDynamic("prerenderingSiblingsNumber")(prerenderingSiblingsNumber.asInstanceOf[js.Any])
    if (renderTabBar != null) __obj.updateDynamic("renderTabBar")(renderTabBar.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable)
    if (tabBarActiveTextColor != null) __obj.updateDynamic("tabBarActiveTextColor")(tabBarActiveTextColor)
    if (tabBarBackgroundColor != null) __obj.updateDynamic("tabBarBackgroundColor")(tabBarBackgroundColor)
    if (tabBarInactiveTextColor != null) __obj.updateDynamic("tabBarInactiveTextColor")(tabBarInactiveTextColor)
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (tabBarTextStyle != null) __obj.updateDynamic("tabBarTextStyle")(tabBarTextStyle.asInstanceOf[js.Any])
    if (tabBarUnderlineStyle != null) __obj.updateDynamic("tabBarUnderlineStyle")(tabBarUnderlineStyle.asInstanceOf[js.Any])
    if (tabDirection != null) __obj.updateDynamic("tabDirection")(tabDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(useLeftInsteadTransform)) __obj.updateDynamic("useLeftInsteadTransform")(useLeftInsteadTransform)
    if (!js.isUndefined(useOnPan)) __obj.updateDynamic("useOnPan")(useOnPan)
    if (!js.isUndefined(usePaged)) __obj.updateDynamic("usePaged")(usePaged)
    __obj.asInstanceOf[PropsType]
  }
}

