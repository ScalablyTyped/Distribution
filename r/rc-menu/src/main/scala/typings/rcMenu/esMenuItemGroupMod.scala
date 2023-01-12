package typings.rcMenu

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMenuItemGroupMod {
  
  @JSImport("rc-menu/es/MenuItemGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: MenuItemGroupProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  /* Inlined parent std.Omit<rc-menu.rc-menu/es/interface.MenuItemGroupType, 'type' | 'children' | 'label'> */
  trait MenuItemGroupProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** @private Internal filled key. Do not set it directly */
    var eventKey: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
    
    /** @private Do not use. Private warning empty usage */
    var warnKey: js.UndefOr[Boolean] = js.undefined
  }
  object MenuItemGroupProps {
    
    inline def apply(): MenuItemGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemGroupProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuItemGroupProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setEventKey(value: String): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWarnKey(value: Boolean): Self = StObject.set(x, "warnKey", value.asInstanceOf[js.Any])
      
      inline def setWarnKeyUndefined: Self = StObject.set(x, "warnKey", js.undefined)
    }
  }
}
