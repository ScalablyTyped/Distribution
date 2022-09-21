package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.reactstrap.utilsMod.CSSModule
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navbarBrandMod {
  
  @JSImport("reactstrap/types/lib/NavbarBrand", JSImport.Default)
  @js.native
  open class default ()
    extends Component[NavbarBrandProps, js.Object, Any]
  
  type NavbarBrand = Component[NavbarBrandProps, js.Object, Any]
  
  trait NavbarBrandProps
    extends StObject
       with AnchorHTMLAttributes[HTMLAnchorElement]
       with /* key */ StringDictionary[Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var tag: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object NavbarBrandProps {
    
    inline def apply(): NavbarBrandProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarBrandProps]
    }
    
    extension [Self <: NavbarBrandProps](x: Self) {
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setTag(value: ElementType[Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
