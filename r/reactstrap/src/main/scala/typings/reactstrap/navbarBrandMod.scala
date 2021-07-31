package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navbarBrandMod {
  
  @JSImport("reactstrap/lib/NavbarBrand", JSImport.Default)
  @js.native
  class default ()
    extends Component[NavbarBrandProps, js.Object, js.Any]
  
  type NavbarBrand = Component[NavbarBrandProps, js.Object, js.Any]
  
  trait NavbarBrandProps
    extends StObject
       with AnchorHTMLAttributes[HTMLAnchorElement]
       with /* key */ StringDictionary[js.Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var tag: js.UndefOr[ElementType[js.Any]] = js.undefined
  }
  object NavbarBrandProps {
    
    @scala.inline
    def apply(): NavbarBrandProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarBrandProps]
    }
    
    @scala.inline
    implicit class NavbarBrandPropsMutableBuilder[Self <: NavbarBrandProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setTag(value: ElementType[js.Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
