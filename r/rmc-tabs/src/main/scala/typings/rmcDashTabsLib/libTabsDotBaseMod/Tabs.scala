package typings
package rmcDashTabsLib.libTabsDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-tabs/lib/Tabs.base", "Tabs")
@js.native
abstract class Tabs[P /* <: rmcDashTabsLib.libPropsTypeMod.PropsType */, S /* <: StateType */] protected ()
  extends reactLib.reactMod.PureComponent[P, S, js.Any] {
  def this(props: P) = this()
  var instanceId: scala.Double = js.native
  /** compatible for different between react and preact in `setState`. */
  var nextCurrentTab: js.Any = js.native
  var prevCurrentTab: scala.Double = js.native
  var tabCache: org.scalablytyped.runtime.NumberDictionary[reactLib.reactMod.ReactNs.ReactNode] = js.native
  @JSName("componentDidMount")
  def componentDidMount_MTabs(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTabs(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MTabs(nextProps: P): scala.Unit = js.native
  def getOffsetIndex(current: scala.Double, width: scala.Double): scala.Double = js.native
  @JSName("getOffsetIndex")
  def getOffsetIndex_distanceToChangeTab(
    current: scala.Double,
    width: scala.Double,
    threshold: /* import warning: ImportType.apply Failed type conversion: P['distanceToChangeTab'] */ js.Any
  ): scala.Double = js.native
  def getSubElement(
    tab: rmcDashTabsLib.libModelsMod.ModelsNs.TabData,
    index: scala.Double,
    subElements: js.Function2[
      /* defaultPrefix */ java.lang.String, 
      /* allPrefix */ java.lang.String, 
      org.scalablytyped.runtime.StringDictionary[_]
    ]
  ): js.Any = js.native
  def getSubElement(
    tab: rmcDashTabsLib.libModelsMod.ModelsNs.TabData,
    index: scala.Double,
    subElements: js.Function2[
      /* defaultPrefix */ java.lang.String, 
      /* allPrefix */ java.lang.String, 
      org.scalablytyped.runtime.StringDictionary[_]
    ],
    defaultPrefix: java.lang.String
  ): js.Any = js.native
  def getSubElement(
    tab: rmcDashTabsLib.libModelsMod.ModelsNs.TabData,
    index: scala.Double,
    subElements: js.Function2[
      /* defaultPrefix */ java.lang.String, 
      /* allPrefix */ java.lang.String, 
      org.scalablytyped.runtime.StringDictionary[_]
    ],
    defaultPrefix: java.lang.String,
    allPrefix: java.lang.String
  ): js.Any = js.native
  def getSubElements(): js.Function2[
    /* defaultPrefix */ js.UndefOr[java.lang.String], 
    /* allPrefix */ js.UndefOr[java.lang.String], 
    org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNs.ReactNode]
  ] = js.native
  def getTabBarBaseProps(): rmcDashTabsLib.Anon_ActiveTab[S, P] = js.native
  def getTabIndex(props: P): scala.Double = js.native
  def goToTab(index: scala.Double): scala.Boolean = js.native
  def goToTab(index: scala.Double, force: scala.Boolean): scala.Boolean = js.native
  def goToTab(index: scala.Double, force: scala.Boolean, newState: js.Any): scala.Boolean = js.native
  def goToTab(index: scala.Double, force: scala.Boolean, newState: js.Any, props: P): scala.Boolean = js.native
  def isTabVertical(): scala.Boolean = js.native
  @JSName("isTabVertical")
  def isTabVertical_horizontal(direction: rmcDashTabsLib.rmcDashTabsLibStrings.horizontal): scala.Boolean = js.native
  @JSName("isTabVertical")
  def isTabVertical_vertical(direction: rmcDashTabsLib.rmcDashTabsLibStrings.vertical): scala.Boolean = js.native
  def renderTabBar(
    tabBarProps: js.Any,
    DefaultTabBar: reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]
  ): js.UndefOr[js.Object | scala.Null] = js.native
  def shouldRenderTab(idx: scala.Double): scala.Boolean = js.native
  def tabClickGoToTab(index: scala.Double): scala.Unit = js.native
}

/* static members */
@JSImport("rmc-tabs/lib/Tabs.base", "Tabs")
@js.native
object Tabs extends js.Object {
  var defaultProps: rmcDashTabsLib.libPropsTypeMod.PropsType = js.native
}

