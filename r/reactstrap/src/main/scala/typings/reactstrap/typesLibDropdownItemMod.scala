package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.reactstrap.typesLibUtilsMod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibDropdownItemMod {
  
  @JSImport("reactstrap/types/lib/DropdownItem", JSImport.Default)
  @js.native
  open class default ()
    extends Component[DropdownItemProps, js.Object, Any]
  
  type DropdownItem = Component[DropdownItemProps, js.Object, Any]
  
  trait DropdownItemProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var divider: js.UndefOr[Boolean] = js.undefined
    
    var header: js.UndefOr[Boolean] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[ElementType[Any]] = js.undefined
    
    var text: js.UndefOr[Boolean] = js.undefined
    
    var toggle: js.UndefOr[Boolean] = js.undefined
  }
  object DropdownItemProps {
    
    inline def apply(): DropdownItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownItemProps]
    }
    
    extension [Self <: DropdownItemProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDivider(value: Boolean): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setTag(value: ElementType[Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    }
  }
}
