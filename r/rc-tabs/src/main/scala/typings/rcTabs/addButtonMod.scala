package typings.rcTabs

import org.scalablytyped.runtime.Shortcut
import typings.rcTabs.interfaceMod.EditableConfig
import typings.rcTabs.interfaceMod.TabsLocale
import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addButtonMod extends Shortcut {
  
  @JSImport("rc-tabs/es/TabNavList/AddButton", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[AddButtonProps & RefAttributes[HTMLButtonElement]] = js.native
  
  trait AddButtonProps extends StObject {
    
    var editable: js.UndefOr[EditableConfig] = js.undefined
    
    var locale: js.UndefOr[TabsLocale] = js.undefined
    
    var prefixCls: String
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object AddButtonProps {
    
    @scala.inline
    def apply(prefixCls: String): AddButtonProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddButtonProps]
    }
    
    @scala.inline
    implicit class AddButtonPropsMutableBuilder[Self <: AddButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEditable(value: EditableConfig): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      @scala.inline
      def setLocale(value: TabsLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[AddButtonProps & RefAttributes[HTMLButtonElement]]
  
  /* This means you don't have to write `default`, but can instead just say `addButtonMod.foo` */
  override def _to: ForwardRefExoticComponent[AddButtonProps & RefAttributes[HTMLButtonElement]] = default
}
