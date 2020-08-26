package typings.rmcTabs

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.rmcTabs.anon.ActiveTab
import typings.rmcTabs.modelsMod.Models.TabData
import typings.rmcTabs.propsTypeMod.PropsType
import typings.rmcTabs.rmcTabsStrings.horizontal
import typings.rmcTabs.rmcTabsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-tabs/lib/Tabs.base", JSImport.Namespace)
@js.native
object tabsBaseMod extends js.Object {
  @js.native
  class StateType () extends js.Object {
    var currentTab: Double = js.native
  }
  
  @js.native
  abstract class Tabs[P /* <: PropsType */, S /* <: StateType */] protected ()
    extends Component[P, S, js.Any] {
    def this(props: P) = this()
    var instanceId: Double = js.native
    /** compatible for different between react and preact in `setState`. */
    var nextCurrentTab: js.Any = js.native
    var prevCurrentTab: Double = js.native
    var tabCache: NumberDictionary[ReactNode] = js.native
    @JSName("componentDidMount")
    def componentDidMount_MTabs(): Unit = js.native
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTabs(): Unit = js.native
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MTabs(nextProps: P): Unit = js.native
    def getOffsetIndex(current: Double, width: Double): Double = js.native
    @JSName("getOffsetIndex")
    def getOffsetIndex_distanceToChangeTab(
      current: Double,
      width: Double,
      threshold: /* import warning: importer.ImportType#apply Failed type conversion: P['distanceToChangeTab'] */ js.Any
    ): Double = js.native
    def getSubElement(
      tab: TabData,
      index: Double,
      subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[_]]
    ): js.Any = js.native
    def getSubElement(
      tab: TabData,
      index: Double,
      subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[_]],
      defaultPrefix: js.UndefOr[scala.Nothing],
      allPrefix: String
    ): js.Any = js.native
    def getSubElement(
      tab: TabData,
      index: Double,
      subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[_]],
      defaultPrefix: String
    ): js.Any = js.native
    def getSubElement(
      tab: TabData,
      index: Double,
      subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[_]],
      defaultPrefix: String,
      allPrefix: String
    ): js.Any = js.native
    def getSubElements(): js.Function2[
        /* defaultPrefix */ js.UndefOr[String], 
        /* allPrefix */ js.UndefOr[String], 
        StringDictionary[ReactNode]
      ] = js.native
    def getTabBarBaseProps(): ActiveTab[S, P] = js.native
    def getTabIndex(props: P): Double = js.native
    def goToTab(index: Double): Boolean = js.native
    def goToTab(index: Double, force: js.UndefOr[scala.Nothing], newState: js.UndefOr[scala.Nothing], props: P): Boolean = js.native
    def goToTab(index: Double, force: js.UndefOr[scala.Nothing], newState: js.Any): Boolean = js.native
    def goToTab(index: Double, force: js.UndefOr[scala.Nothing], newState: js.Any, props: P): Boolean = js.native
    def goToTab(index: Double, force: Boolean): Boolean = js.native
    def goToTab(index: Double, force: Boolean, newState: js.UndefOr[scala.Nothing], props: P): Boolean = js.native
    def goToTab(index: Double, force: Boolean, newState: js.Any): Boolean = js.native
    def goToTab(index: Double, force: Boolean, newState: js.Any, props: P): Boolean = js.native
    def isTabVertical(): Boolean = js.native
    @JSName("isTabVertical")
    def isTabVertical_horizontal(direction: horizontal): Boolean = js.native
    @JSName("isTabVertical")
    def isTabVertical_vertical(direction: vertical): Boolean = js.native
    def renderTabBar(tabBarProps: js.Any, DefaultTabBar: ComponentClass[js.Object, ComponentState]): js.UndefOr[js.Object | Null] = js.native
    def shouldRenderTab(idx: Double): Boolean = js.native
    def tabClickGoToTab(index: Double): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Tabs extends js.Object {
    var defaultProps: PropsType = js.native
  }
  
}

