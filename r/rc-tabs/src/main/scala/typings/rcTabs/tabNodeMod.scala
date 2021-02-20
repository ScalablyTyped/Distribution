package typings.rcTabs

import org.scalablytyped.runtime.Shortcut
import typings.rcTabs.interfaceMod.EditableConfig
import typings.rcTabs.interfaceMod.Tab
import typings.rcTabs.interfaceMod.TabPosition
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.Element
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabNodeMod extends Shortcut {
  
  @JSImport("rc-tabs/es/TabNavList/TabNode", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TabNodeProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait TabNodeProps extends StObject {
    
    var active: Boolean = js.native
    
    var closable: js.UndefOr[Boolean] = js.native
    
    var editable: js.UndefOr[EditableConfig] = js.native
    
    var id: String = js.native
    
    var onClick: js.UndefOr[
        js.Function1[/* e */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], Unit]
      ] = js.native
    
    var onFocus: FocusEventHandler[Element] = js.native
    
    def onRemove(): Unit = js.native
    
    var onResize: js.UndefOr[
        js.Function4[/* width */ Double, /* height */ Double, /* left */ Double, /* top */ Double, Unit]
      ] = js.native
    
    var prefixCls: String = js.native
    
    var removeAriaLabel: js.UndefOr[String] = js.native
    
    var removeIcon: js.UndefOr[ReactNode] = js.native
    
    var renderWrapper: js.UndefOr[js.Function1[/* node */ ReactElement, ReactElement]] = js.native
    
    var rtl: Boolean = js.native
    
    var tab: Tab = js.native
    
    var tabBarGutter: js.UndefOr[Double] = js.native
    
    var tabPosition: TabPosition = js.native
  }
  object TabNodeProps {
    
    @scala.inline
    def apply(
      active: Boolean,
      id: String,
      onFocus: FocusEvent[Element] => Unit,
      onRemove: () => Unit,
      prefixCls: String,
      rtl: Boolean,
      tab: Tab,
      tabPosition: TabPosition
    ): TabNodeProps = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onFocus = js.Any.fromFunction1(onFocus), onRemove = js.Any.fromFunction0(onRemove), prefixCls = prefixCls.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any], tabPosition = tabPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabNodeProps]
    }
    
    @scala.inline
    implicit class TabNodePropsMutableBuilder[Self <: TabNodeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      @scala.inline
      def setEditable(value: EditableConfig): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: /* e */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnFocus(value: FocusEvent[Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRemove(value: () => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnResize(value: (/* width */ Double, /* height */ Double, /* left */ Double, /* top */ Double) => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveAriaLabel(value: String): Self = StObject.set(x, "removeAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveAriaLabelUndefined: Self = StObject.set(x, "removeAriaLabel", js.undefined)
      
      @scala.inline
      def setRemoveIcon(value: ReactNode): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
      
      @scala.inline
      def setRenderWrapper(value: /* node */ ReactElement => ReactElement): Self = StObject.set(x, "renderWrapper", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTab(value: Tab): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarGutter(value: Double): Self = StObject.set(x, "tabBarGutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarGutterUndefined: Self = StObject.set(x, "tabBarGutter", js.undefined)
      
      @scala.inline
      def setTabPosition(value: TabPosition): Self = StObject.set(x, "tabPosition", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[TabNodeProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `tabNodeMod.foo` */
  override def _to: ForwardRefExoticComponent[TabNodeProps with RefAttributes[HTMLDivElement]] = default
}
