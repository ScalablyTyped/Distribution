package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navbarTogglerMod {
  
  @JSImport("reactstrap/lib/NavbarToggler", JSImport.Default)
  @js.native
  class default ()
    extends Component[NavbarTogglerProps, js.Object, js.Any]
  
  type NavbarToggler = Component[NavbarTogglerProps, js.Object, js.Any]
  
  @js.native
  trait NavbarTogglerProps
    extends ButtonHTMLAttributes[HTMLButtonElement]
       with /* key */ StringDictionary[js.Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var tag: js.UndefOr[ElementType[_]] = js.native
  }
  object NavbarTogglerProps {
    
    @scala.inline
    def apply(): NavbarTogglerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarTogglerProps]
    }
    
    @scala.inline
    implicit class NavbarTogglerPropsMutableBuilder[Self <: NavbarTogglerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setTag(value: ElementType[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
