package typings.rcTabs

import typings.rcTabs.esInterfaceMod.EditableConfig
import typings.rcTabs.esInterfaceMod.Tab
import typings.react.mod.CSSProperties
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTabNavListTabNodeMod {
  
  @JSImport("rc-tabs/es/TabNavList/TabNode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: TabNodeProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait TabNodeProps extends StObject {
    
    var active: Boolean
    
    var closable: js.UndefOr[Boolean] = js.undefined
    
    var editable: js.UndefOr[EditableConfig] = js.undefined
    
    var id: String
    
    var onClick: js.UndefOr[
        js.Function1[/* e */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], Unit]
      ] = js.undefined
    
    var onFocus: FocusEventHandler[Element]
    
    var onResize: js.UndefOr[
        js.Function4[/* width */ Double, /* height */ Double, /* left */ Double, /* top */ Double, Unit]
      ] = js.undefined
    
    var prefixCls: String
    
    var removeAriaLabel: js.UndefOr[String] = js.undefined
    
    var removeIcon: js.UndefOr[ReactNode] = js.undefined
    
    var renderWrapper: js.UndefOr[js.Function1[/* node */ ReactElement, ReactElement]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tab: Tab
  }
  object TabNodeProps {
    
    inline def apply(
      active: Boolean,
      id: String,
      onFocus: FocusEvent[Element, Element] => Unit,
      prefixCls: String,
      tab: Tab
    ): TabNodeProps = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onFocus = js.Any.fromFunction1(onFocus), prefixCls = prefixCls.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabNodeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabNodeProps] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setEditable(value: EditableConfig): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: /* e */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[Element, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnResize(value: (/* width */ Double, /* height */ Double, /* left */ Double, /* top */ Double) => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction4(value))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setRemoveAriaLabel(value: String): Self = StObject.set(x, "removeAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setRemoveAriaLabelUndefined: Self = StObject.set(x, "removeAriaLabel", js.undefined)
      
      inline def setRemoveIcon(value: ReactNode): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
      
      inline def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
      
      inline def setRenderWrapper(value: /* node */ ReactElement => ReactElement): Self = StObject.set(x, "renderWrapper", js.Any.fromFunction1(value))
      
      inline def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTab(value: Tab): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    }
  }
}
