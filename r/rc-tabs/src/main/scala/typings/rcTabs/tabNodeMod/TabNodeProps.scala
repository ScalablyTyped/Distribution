package typings.rcTabs.tabNodeMod

import typings.rcTabs.interfaceMod.EditableConfig
import typings.rcTabs.interfaceMod.Tab
import typings.rcTabs.interfaceMod.TabPosition
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabNodeProps extends js.Object {
  
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
  implicit class TabNodePropsOps[Self <: TabNodeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFocus(value: FocusEvent[Element] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRemove(value: () => Unit): Self = this.set("onRemove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTab(value: Tab): Self = this.set("tab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabPosition(value: TabPosition): Self = this.set("tabPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    
    @scala.inline
    def setEditable(value: EditableConfig): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* e */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnResize(value: (/* width */ Double, /* height */ Double, /* left */ Double, /* top */ Double) => Unit): Self = this.set("onResize", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    
    @scala.inline
    def setRemoveAriaLabel(value: String): Self = this.set("removeAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveAriaLabel: Self = this.set("removeAriaLabel", js.undefined)
    
    @scala.inline
    def setRemoveIcon(value: ReactNode): Self = this.set("removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveIcon: Self = this.set("removeIcon", js.undefined)
    
    @scala.inline
    def setRenderWrapper(value: /* node */ ReactElement => ReactElement): Self = this.set("renderWrapper", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderWrapper: Self = this.set("renderWrapper", js.undefined)
    
    @scala.inline
    def setTabBarGutter(value: Double): Self = this.set("tabBarGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarGutter: Self = this.set("tabBarGutter", js.undefined)
  }
}
