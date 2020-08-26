package typings.rcTabs

import typings.rcTabs.interfaceMod.EditableConfig
import typings.rcTabs.interfaceMod.Tab
import typings.rcTabs.interfaceMod.TabsLocale
import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.Key
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.Element
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tabs/es/TabNavList/OperationNode", JSImport.Namespace)
@js.native
object operationNodeMod extends js.Object {
  @js.native
  trait OperationNodeProps extends js.Object {
    var activeKey: String = js.native
    var className: js.UndefOr[String] = js.native
    var editable: js.UndefOr[EditableConfig] = js.native
    var id: String = js.native
    var locale: js.UndefOr[TabsLocale] = js.native
    var mobile: Boolean = js.native
    var moreIcon: js.UndefOr[ReactNode] = js.native
    var moreTransitionName: js.UndefOr[String] = js.native
    var prefixCls: String = js.native
    var rtl: Boolean = js.native
    var style: js.UndefOr[CSSProperties] = js.native
    var tabBarGutter: js.UndefOr[Double] = js.native
    var tabs: js.Array[Tab] = js.native
    def onTabClick(key: Key, e: KeyboardEvent[Element]): Unit = js.native
    def onTabClick(key: Key, e: MouseEvent[Element, NativeMouseEvent]): Unit = js.native
  }
  
  val default: ForwardRefExoticComponent[OperationNodeProps with RefAttributes[HTMLDivElement]] = js.native
}

