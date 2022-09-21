package typings.rmcTabs

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.rmcTabs.anon.ActiveTab
import typings.rmcTabs.modelsMod.Models.TabData
import typings.rmcTabs.propsTypeMod.PropsType
import typings.rmcTabs.rmcTabsStrings.horizontal
import typings.rmcTabs.rmcTabsStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsBaseMod {
  
  @JSImport("rmc-tabs/lib/Tabs.base", "StateType")
  @js.native
  open class StateType () extends StObject {
    
    var currentTab: Double = js.native
  }
  
  @JSImport("rmc-tabs/lib/Tabs.base", "Tabs")
  @js.native
  abstract class Tabs[P /* <: PropsType */, S /* <: StateType */] protected () extends PureComponent[P, S, Any] {
    def this(props: P) = this()
    
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
      subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[Any]]
    ): Any = js.native
    def getSubElement(
      tab: TabData,
      index: Double,
      subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[Any]],
      defaultPrefix: String
    ): Any = js.native
    def getSubElement(
      tab: TabData,
      index: Double,
      subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[Any]],
      defaultPrefix: String,
      allPrefix: String
    ): Any = js.native
    def getSubElement(
      tab: TabData,
      index: Double,
      subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[Any]],
      defaultPrefix: Unit,
      allPrefix: String
    ): Any = js.native
    
    def getSubElements(): js.Function2[
        /* defaultPrefix */ js.UndefOr[String], 
        /* allPrefix */ js.UndefOr[String], 
        StringDictionary[ReactNode]
      ] = js.native
    
    def getTabBarBaseProps(): ActiveTab[S, P] = js.native
    
    def getTabIndex(props: P): Double = js.native
    
    def goToTab(index: Double): Boolean = js.native
    def goToTab(index: Double, force: Boolean): Boolean = js.native
    def goToTab(index: Double, force: Boolean, newState: Any): Boolean = js.native
    def goToTab(index: Double, force: Boolean, newState: Any, props: P): Boolean = js.native
    def goToTab(index: Double, force: Boolean, newState: Unit, props: P): Boolean = js.native
    def goToTab(index: Double, force: Unit, newState: Any): Boolean = js.native
    def goToTab(index: Double, force: Unit, newState: Any, props: P): Boolean = js.native
    def goToTab(index: Double, force: Unit, newState: Unit, props: P): Boolean = js.native
    
    /* protected */ var instanceId: Double = js.native
    
    def isTabVertical(): Boolean = js.native
    def isTabVertical(direction: horizontal | vertical): Boolean = js.native
    
    /** compatible for different between react and preact in `setState`. */
    /* private */ var nextCurrentTab: Any = js.native
    
    /* protected */ var prevCurrentTab: Double = js.native
    
    def renderTabBar(tabBarProps: Any, DefaultTabBar: ComponentClass[js.Object, ComponentState]): js.UndefOr[js.Object | Null] = js.native
    
    def shouldRenderTab(idx: Double): Boolean = js.native
    
    /* protected */ var tabCache: NumberDictionary[ReactNode] = js.native
    
    def tabClickGoToTab(index: Double): Unit = js.native
  }
  /* static members */
  object Tabs {
    
    @JSImport("rmc-tabs/lib/Tabs.base", "Tabs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-tabs/lib/Tabs.base", "Tabs.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    inline def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
