package typings.rcTabs

import typings.rcTabs.interfaceMod.AnimatedConfig
import typings.rcTabs.interfaceMod.EditableConfig
import typings.rcTabs.interfaceMod.OnTabScroll
import typings.rcTabs.interfaceMod.RenderTabBar
import typings.rcTabs.interfaceMod.TabPosition
import typings.rcTabs.interfaceMod.TabsLocale
import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.Key
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.Element
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-tabs/es/TabNavList", JSImport.Namespace)
@js.native
object tabNavListMod extends js.Object {
  @js.native
  trait TabNavListProps extends js.Object {
    var activeKey: String = js.native
    var animated: js.UndefOr[AnimatedConfig] = js.native
    var children: js.UndefOr[js.Function1[/* node */ ReactElement, ReactElement]] = js.native
    var className: js.UndefOr[String] = js.native
    var editable: js.UndefOr[EditableConfig] = js.native
    var extra: js.UndefOr[ReactNode] = js.native
    var id: String = js.native
    var locale: js.UndefOr[TabsLocale] = js.native
    var mobile: Boolean = js.native
    var moreIcon: js.UndefOr[ReactNode] = js.native
    var moreTransitionName: js.UndefOr[String] = js.native
    var onTabScroll: js.UndefOr[OnTabScroll] = js.native
    var panes: ReactNode = js.native
    var renderTabBar: js.UndefOr[RenderTabBar] = js.native
    var rtl: Boolean = js.native
    var style: js.UndefOr[CSSProperties] = js.native
    var tabBarGutter: js.UndefOr[Double] = js.native
    var tabPosition: TabPosition = js.native
    def onTabClick(activeKey: Key, e: KeyboardEvent[Element]): Unit = js.native
    def onTabClick(activeKey: Key, e: MouseEvent[Element, NativeMouseEvent]): Unit = js.native
  }
  
  val default: ForwardRefExoticComponent[TabNavListProps with RefAttributes[HTMLDivElement]] = js.native
}

