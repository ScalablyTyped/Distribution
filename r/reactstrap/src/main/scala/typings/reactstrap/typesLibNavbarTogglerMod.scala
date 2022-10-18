package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.reactstrap.typesLibUtilsMod.CSSModule
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibNavbarTogglerMod {
  
  @JSImport("reactstrap/types/lib/NavbarToggler", JSImport.Default)
  @js.native
  open class default ()
    extends Component[NavbarTogglerProps, js.Object, Any]
  
  type NavbarToggler = Component[NavbarTogglerProps, js.Object, Any]
  
  trait NavbarTogglerProps
    extends StObject
       with ButtonHTMLAttributes[HTMLButtonElement]
       with /* key */ StringDictionary[Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var tag: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object NavbarTogglerProps {
    
    inline def apply(): NavbarTogglerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarTogglerProps]
    }
    
    extension [Self <: NavbarTogglerProps](x: Self) {
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setTag(value: ElementType[Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
