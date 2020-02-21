package typings.reactRouterTabs.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutedTabsProps extends js.Object {
  var activeTabClassName: js.UndefOr[String] = js.undefined
  var activeTabStyle: js.UndefOr[js.Object] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var startPathWith: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabClassName: js.UndefOr[String] = js.undefined
  var tabStyle: js.UndefOr[js.Object] = js.undefined
}

object RoutedTabsProps {
  @scala.inline
  def apply(
    activeTabClassName: String = null,
    activeTabStyle: js.Object = null,
    children: ReactNode = null,
    className: String = null,
    startPathWith: String = null,
    style: js.Object = null,
    tabClassName: String = null,
    tabStyle: js.Object = null
  ): RoutedTabsProps = {
    val __obj = js.Dynamic.literal()
    if (activeTabClassName != null) __obj.updateDynamic("activeTabClassName")(activeTabClassName.asInstanceOf[js.Any])
    if (activeTabStyle != null) __obj.updateDynamic("activeTabStyle")(activeTabStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (startPathWith != null) __obj.updateDynamic("startPathWith")(startPathWith.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabClassName != null) __obj.updateDynamic("tabClassName")(tabClassName.asInstanceOf[js.Any])
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutedTabsProps]
  }
}

