package typings.rmcTabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTabBar extends js.Object {
  var TabBar: AnonActiveTextColor
  var Tabs: AnonBottomTabBarSplitLine
}

object AnonTabBar {
  @scala.inline
  def apply(TabBar: AnonActiveTextColor, Tabs: AnonBottomTabBarSplitLine): AnonTabBar = {
    val __obj = js.Dynamic.literal(TabBar = TabBar.asInstanceOf[js.Any], Tabs = Tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTabBar]
  }
}

