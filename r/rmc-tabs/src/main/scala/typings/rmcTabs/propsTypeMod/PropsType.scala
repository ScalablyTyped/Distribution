package typings.rmcTabs.propsTypeMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.rmcTabs.modelsMod.Models.TabData
import typings.rmcTabs.rmcTabsBooleans.`false`
import typings.rmcTabs.rmcTabsStrings.bottom
import typings.rmcTabs.rmcTabsStrings.horizontal
import typings.rmcTabs.rmcTabsStrings.left
import typings.rmcTabs.rmcTabsStrings.right
import typings.rmcTabs.rmcTabsStrings.top
import typings.rmcTabs.rmcTabsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  /** whether to change tabs with animation | default: true */
  var animated: js.UndefOr[Boolean] = js.undefined
  /** destroy inactive tab | default: false */
  var destroyInactiveTab: js.UndefOr[Boolean] = js.undefined
  /** distance to change tab, width ratio | default: 0.3 */
  var distanceToChangeTab: js.UndefOr[Double] = js.undefined
  /** initial Tab, index or key */
  var initialPage: js.UndefOr[Double | String] = js.undefined
  /** can't render content | default: false */
  var noRenderContent: js.UndefOr[Boolean] = js.undefined
  /** callback when tab is switched */
  var onChange: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.undefined
  /** on tab click */
  var onTabClick: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.undefined
  /** current tab, index or key */
  var page: js.UndefOr[Double | String] = js.undefined
  /** pre-render nearby # sibling, Infinity: render all the siblings, 0: render current page | default: 1 */
  var prerenderingSiblingsNumber: js.UndefOr[Double] = js.undefined
  /** render for TabBar */
  var renderTabBar: js.UndefOr[(js.Function1[/* props */ TabBarPropsType, ReactNode]) | `false`] = js.undefined
  /** whether to switch tabs with swipe gestrue in the content | default: true */
  var swipeable: js.UndefOr[Boolean] = js.undefined
  /** tabBar active text color */
  var tabBarActiveTextColor: js.UndefOr[String] = js.undefined
  /** tabBar background color */
  var tabBarBackgroundColor: js.UndefOr[String] = js.undefined
  /** tabBar inactive text color */
  var tabBarInactiveTextColor: js.UndefOr[String] = js.undefined
  /** TabBar's position | default: top */
  var tabBarPosition: js.UndefOr[top | bottom | left | right] = js.undefined
  /** tabBar text style */
  var tabBarTextStyle: js.UndefOr[CSSProperties | js.Any] = js.undefined
  /** tabBar underline style */
  var tabBarUnderlineStyle: js.UndefOr[CSSProperties | js.Any] = js.undefined
  /** tab paging direction | default: horizontal */
  var tabDirection: js.UndefOr[horizontal | vertical] = js.undefined
  /** tabs data */
  var tabs: js.Array[TabData]
  /** use left instead of transform | default: false */
  var useLeftInsteadTransform: js.UndefOr[Boolean] = js.undefined
  /** use scroll follow pan | default: true */
  var useOnPan: js.UndefOr[Boolean] = js.undefined
  /** use paged | default: true */
  var usePaged: js.UndefOr[Boolean] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    tabs: js.Array[TabData],
    animated: js.UndefOr[Boolean] = js.undefined,
    destroyInactiveTab: js.UndefOr[Boolean] = js.undefined,
    distanceToChangeTab: js.UndefOr[Double] = js.undefined,
    initialPage: Double | String = null,
    noRenderContent: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* tab */ TabData, /* index */ Double) => Unit = null,
    onTabClick: (/* tab */ TabData, /* index */ Double) => Unit = null,
    page: Double | String = null,
    prerenderingSiblingsNumber: js.UndefOr[Double] = js.undefined,
    renderTabBar: (js.Function1[/* props */ TabBarPropsType, ReactNode]) | `false` = null,
    swipeable: js.UndefOr[Boolean] = js.undefined,
    tabBarActiveTextColor: String = null,
    tabBarBackgroundColor: String = null,
    tabBarInactiveTextColor: String = null,
    tabBarPosition: top | bottom | left | right = null,
    tabBarTextStyle: CSSProperties | js.Any = null,
    tabBarUnderlineStyle: CSSProperties | js.Any = null,
    tabDirection: horizontal | vertical = null,
    useLeftInsteadTransform: js.UndefOr[Boolean] = js.undefined,
    useOnPan: js.UndefOr[Boolean] = js.undefined,
    usePaged: js.UndefOr[Boolean] = js.undefined
  ): PropsType = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyInactiveTab)) __obj.updateDynamic("destroyInactiveTab")(destroyInactiveTab.get.asInstanceOf[js.Any])
    if (!js.isUndefined(distanceToChangeTab)) __obj.updateDynamic("distanceToChangeTab")(distanceToChangeTab.get.asInstanceOf[js.Any])
    if (initialPage != null) __obj.updateDynamic("initialPage")(initialPage.asInstanceOf[js.Any])
    if (!js.isUndefined(noRenderContent)) __obj.updateDynamic("noRenderContent")(noRenderContent.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(js.Any.fromFunction2(onTabClick))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (!js.isUndefined(prerenderingSiblingsNumber)) __obj.updateDynamic("prerenderingSiblingsNumber")(prerenderingSiblingsNumber.get.asInstanceOf[js.Any])
    if (renderTabBar != null) __obj.updateDynamic("renderTabBar")(renderTabBar.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable.get.asInstanceOf[js.Any])
    if (tabBarActiveTextColor != null) __obj.updateDynamic("tabBarActiveTextColor")(tabBarActiveTextColor.asInstanceOf[js.Any])
    if (tabBarBackgroundColor != null) __obj.updateDynamic("tabBarBackgroundColor")(tabBarBackgroundColor.asInstanceOf[js.Any])
    if (tabBarInactiveTextColor != null) __obj.updateDynamic("tabBarInactiveTextColor")(tabBarInactiveTextColor.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (tabBarTextStyle != null) __obj.updateDynamic("tabBarTextStyle")(tabBarTextStyle.asInstanceOf[js.Any])
    if (tabBarUnderlineStyle != null) __obj.updateDynamic("tabBarUnderlineStyle")(tabBarUnderlineStyle.asInstanceOf[js.Any])
    if (tabDirection != null) __obj.updateDynamic("tabDirection")(tabDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(useLeftInsteadTransform)) __obj.updateDynamic("useLeftInsteadTransform")(useLeftInsteadTransform.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useOnPan)) __obj.updateDynamic("useOnPan")(useOnPan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(usePaged)) __obj.updateDynamic("usePaged")(usePaged.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}

