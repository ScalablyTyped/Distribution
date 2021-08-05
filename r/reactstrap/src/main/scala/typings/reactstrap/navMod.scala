package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navMod {
  
  @JSImport("reactstrap/lib/Nav", JSImport.Default)
  @js.native
  class default ()
    extends Component[NavProps, js.Object, js.Any]
  
  type Nav = Component[NavProps, js.Object, js.Any]
  
  trait NavProps
    extends StObject
       with HTMLAttributes[HTMLUListElement]
       with /* key */ StringDictionary[js.Any] {
    
    var card: js.UndefOr[Boolean] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var fill: js.UndefOr[Boolean] = js.undefined
    
    var horizontal: js.UndefOr[String] = js.undefined
    
    var justified: js.UndefOr[Boolean] = js.undefined
    
    var navbar: js.UndefOr[Boolean] = js.undefined
    
    var pills: js.UndefOr[Boolean] = js.undefined
    
    var tabs: js.UndefOr[Boolean] = js.undefined
    
    var tag: js.UndefOr[ElementType[js.Any]] = js.undefined
    
    var vertical: js.UndefOr[Boolean | String] = js.undefined
  }
  object NavProps {
    
    inline def apply(): NavProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavProps]
    }
    
    extension [Self <: NavProps](x: Self) {
      
      inline def setCard(value: Boolean): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setJustified(value: Boolean): Self = StObject.set(x, "justified", value.asInstanceOf[js.Any])
      
      inline def setJustifiedUndefined: Self = StObject.set(x, "justified", js.undefined)
      
      inline def setNavbar(value: Boolean): Self = StObject.set(x, "navbar", value.asInstanceOf[js.Any])
      
      inline def setNavbarUndefined: Self = StObject.set(x, "navbar", js.undefined)
      
      inline def setPills(value: Boolean): Self = StObject.set(x, "pills", value.asInstanceOf[js.Any])
      
      inline def setPillsUndefined: Self = StObject.set(x, "pills", js.undefined)
      
      inline def setTabs(value: Boolean): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
      
      inline def setTag(value: ElementType[js.Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setVertical(value: Boolean | String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
}
