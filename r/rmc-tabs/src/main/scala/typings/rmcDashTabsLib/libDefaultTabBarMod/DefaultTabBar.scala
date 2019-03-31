package typings
package rmcDashTabsLib.libDefaultTabBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-tabs/lib/DefaultTabBar", "DefaultTabBar")
@js.native
class DefaultTabBar protected ()
  extends reactLib.reactMod.PureComponent[PropsType, StateType, js.Any] {
  def this(props: PropsType) = this()
  var layout: stdLib.HTMLDivElement = js.native
  var onPan: rmcDashTabsLib.Anon_Offset = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MDefaultTabBar(nextProps: PropsType): scala.Unit = js.native
  def getTabSize(page: scala.Double, tabLength: scala.Double): scala.Double = js.native
  def getTransformByIndex(props: PropsType): rmcDashTabsLib.Anon_ShowNext = js.native
  def isTabBarVertical(): scala.Boolean = js.native
  @JSName("isTabBarVertical")
  def isTabBarVertical_bottom(position: rmcDashTabsLib.rmcDashTabsLibStrings.bottom): scala.Boolean = js.native
  @JSName("isTabBarVertical")
  def isTabBarVertical_left(position: rmcDashTabsLib.rmcDashTabsLibStrings.left): scala.Boolean = js.native
  @JSName("isTabBarVertical")
  def isTabBarVertical_right(position: rmcDashTabsLib.rmcDashTabsLibStrings.right): scala.Boolean = js.native
  @JSName("isTabBarVertical")
  def isTabBarVertical_top(position: rmcDashTabsLib.rmcDashTabsLibStrings.top): scala.Boolean = js.native
  def onPress(index: scala.Double): scala.Unit = js.native
  def renderTab(
    t: rmcDashTabsLib.libModelsMod.ModelsNs.TabData,
    i: scala.Double,
    size: scala.Double,
    isTabBarVertical: scala.Boolean
  ): reactLib.reactMod.Global.JSXNs.Element = js.native
  def setContentLayout(div: stdLib.HTMLDivElement): scala.Unit = js.native
}

/* static members */
@JSImport("rmc-tabs/lib/DefaultTabBar", "DefaultTabBar")
@js.native
object DefaultTabBar extends js.Object {
  var defaultProps: rmcDashTabsLib.libDefaultTabBarMod.PropsType = js.native
}

