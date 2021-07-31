package typings.rcTabs

import org.scalablytyped.runtime.Shortcut
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationNodeMod extends Shortcut {
  
  @JSImport("rc-tabs/es/TabNavList/OperationNode", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[OperationNodeProps & RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait OperationNodeProps extends StObject {
    
    var activeKey: String = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var editable: js.UndefOr[EditableConfig] = js.native
    
    var id: String = js.native
    
    var locale: js.UndefOr[TabsLocale] = js.native
    
    var mobile: Boolean = js.native
    
    var moreIcon: js.UndefOr[ReactNode] = js.native
    
    var moreTransitionName: js.UndefOr[String] = js.native
    
    def onTabClick(key: Key, e: KeyboardEvent[Element]): Unit = js.native
    def onTabClick(key: Key, e: MouseEvent[Element, NativeMouseEvent]): Unit = js.native
    
    var prefixCls: String = js.native
    
    var rtl: Boolean = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tabBarGutter: js.UndefOr[Double] = js.native
    
    var tabs: js.Array[Tab] = js.native
  }
  
  type _To = ForwardRefExoticComponent[OperationNodeProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `operationNodeMod.foo` */
  override def _to: ForwardRefExoticComponent[OperationNodeProps & RefAttributes[HTMLDivElement]] = default
}
