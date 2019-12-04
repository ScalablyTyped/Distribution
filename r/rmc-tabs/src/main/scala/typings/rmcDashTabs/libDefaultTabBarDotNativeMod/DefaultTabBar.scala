package typings.rmcDashTabs.libDefaultTabBarDotNativeMod

import typings.react.reactMod.Component
import typings.react.reactMod._Global_.JSX.Element
import typings.reactDashNative.reactDashNativeMod.ScrollView
import typings.rmcDashTabs.libModelsMod.Models.TabData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-tabs/lib/DefaultTabBar.native", "DefaultTabBar")
@js.native
class DefaultTabBar protected ()
  extends Component[PropsType, StateType, js.Any] {
  def this(props: PropsType) = this()
  var _containerMeasurements: js.Any = js.native
  var _scrollView: ScrollView = js.native
  var _tabContainerMeasurements: js.Any = js.native
  var _tabsMeasurements: js.Array[_] = js.native
  @JSName("componentDidMount")
  def componentDidMount_MDefaultTabBar(): Unit = js.native
  def measureTab(page: Double, event: js.Any): Unit = js.native
  def necessarilyMeasurementsCompleted(position: Double, isLastTab: Boolean): js.Any = js.native
  def onContainerLayout(
    e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.LayoutChangeEvent */ js.Any
  ): Unit = js.native
  def onPress(index: Double): Unit = js.native
  def onTabContainerLayout(
    e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.LayoutChangeEvent */ js.Any
  ): Unit = js.native
  def renderTab(tab: TabData, index: Double, width: Double, onLayoutHandler: js.Any): Element = js.native
  def updateTabPanel(position: Double, pageOffset: Double): Unit = js.native
  def updateTabUnderline(position: Double, pageOffset: Double, tabCount: Double): Unit = js.native
  def updateView(offset: js.Any): Unit = js.native
}

/* static members */
@JSImport("rmc-tabs/lib/DefaultTabBar.native", "DefaultTabBar")
@js.native
object DefaultTabBar extends js.Object {
  var defaultProps: PropsType = js.native
}

