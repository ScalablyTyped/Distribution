package typings.rmcTabs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBar extends js.Object {
  var TabBar: ActiveTextColor
  var Tabs: BottomTabBarSplitLine
}

object TabBar {
  @scala.inline
  def apply(TabBar: ActiveTextColor, Tabs: BottomTabBarSplitLine): TabBar = {
    val __obj = js.Dynamic.literal(TabBar = TabBar.asInstanceOf[js.Any], Tabs = Tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBar]
  }
}

