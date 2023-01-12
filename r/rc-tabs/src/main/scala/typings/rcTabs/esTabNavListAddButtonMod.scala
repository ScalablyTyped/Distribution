package typings.rcTabs

import org.scalablytyped.runtime.Shortcut
import typings.rcTabs.esInterfaceMod.EditableConfig
import typings.rcTabs.esInterfaceMod.TabsLocale
import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTabNavListAddButtonMod extends Shortcut {
  
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
    
    inline def apply(prefixCls: String): AddButtonProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddButtonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddButtonProps] (val x: Self) extends AnyVal {
      
      inline def setEditable(value: EditableConfig): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setLocale(value: TabsLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[AddButtonProps & RefAttributes[HTMLButtonElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esTabNavListAddButtonMod.foo` */
  override def _to: ForwardRefExoticComponent[AddButtonProps & RefAttributes[HTMLButtonElement]] = default
}
