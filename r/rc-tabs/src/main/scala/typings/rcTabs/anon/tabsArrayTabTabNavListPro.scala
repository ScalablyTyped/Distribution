package typings.rcTabs.anon

import typings.rcTabs.interfaceMod.AnimatedConfig
import typings.rcTabs.interfaceMod.EditableConfig
import typings.rcTabs.interfaceMod.OnTabScroll
import typings.rcTabs.interfaceMod.RenderTabBar
import typings.rcTabs.interfaceMod.Tab
import typings.rcTabs.interfaceMod.TabPosition
import typings.rcTabs.interfaceMod.TabsLocale
import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  tabs :std.Array<rc-tabs.rc-tabs/es/interface.Tab>} & rc-tabs.rc-tabs/es/TabNavList.TabNavListProps */
@js.native
trait tabsArrayTabTabNavListPro extends js.Object {
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
  var tabs: js.Array[Tab] = js.native
  def onTabClick(activeKey: Key, e: KeyboardEvent[Element]): Unit = js.native
  def onTabClick(activeKey: Key, e: MouseEvent[Element, NativeMouseEvent]): Unit = js.native
}

