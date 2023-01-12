package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.reactstrap.reactstrapStrings.fluid
import typings.reactstrap.reactstrapStrings.lg
import typings.reactstrap.reactstrapStrings.md
import typings.reactstrap.reactstrapStrings.sm
import typings.reactstrap.reactstrapStrings.xl
import typings.reactstrap.reactstrapStrings.xxl
import typings.reactstrap.typesLibUtilsMod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibNavbarMod {
  
  @JSImport("reactstrap/types/lib/Navbar", JSImport.Default)
  @js.native
  open class default ()
    extends Component[NavbarProps, js.Object, Any]
  
  type Navbar = Component[NavbarProps, js.Object, Any]
  
  trait NavbarProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var container: js.UndefOr[Boolean | fluid | sm | md | lg | xl | xxl] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var dark: js.UndefOr[Boolean] = js.undefined
    
    var expand: js.UndefOr[Boolean | String] = js.undefined
    
    var fixed: js.UndefOr[String] = js.undefined
    
    var full: js.UndefOr[Boolean] = js.undefined
    
    var light: js.UndefOr[Boolean] = js.undefined
    
    var sticky: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object NavbarProps {
    
    inline def apply(): NavbarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavbarProps] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: Boolean | fluid | sm | md | lg | xl | xxl): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setDark(value: Boolean): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
      
      inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
      
      inline def setExpand(value: Boolean | String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      inline def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      inline def setLight(value: Boolean): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
      
      inline def setSticky(value: String): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
      
      inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
      
      inline def setTag(value: ElementType[Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
