package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navMod {
  
  @JSImport("reactstrap/lib/Nav", JSImport.Default)
  @js.native
  class default ()
    extends Component[NavProps, js.Object, js.Any]
  
  type Nav = Component[NavProps, js.Object, js.Any]
  
  @js.native
  trait NavProps
    extends HTMLAttributes[HTMLUListElement]
       with /* key */ StringDictionary[js.Any] {
    
    var card: js.UndefOr[Boolean] = js.native
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var fill: js.UndefOr[Boolean] = js.native
    
    var horizontal: js.UndefOr[String] = js.native
    
    var justified: js.UndefOr[Boolean] = js.native
    
    var navbar: js.UndefOr[Boolean] = js.native
    
    var pills: js.UndefOr[Boolean] = js.native
    
    var tabs: js.UndefOr[Boolean] = js.native
    
    var tag: js.UndefOr[ElementType[_]] = js.native
    
    var vertical: js.UndefOr[Boolean | String] = js.native
  }
  object NavProps {
    
    @scala.inline
    def apply(): NavProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavProps]
    }
    
    @scala.inline
    implicit class NavPropsMutableBuilder[Self <: NavProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCard(value: Boolean): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setJustified(value: Boolean): Self = StObject.set(x, "justified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifiedUndefined: Self = StObject.set(x, "justified", js.undefined)
      
      @scala.inline
      def setNavbar(value: Boolean): Self = StObject.set(x, "navbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavbarUndefined: Self = StObject.set(x, "navbar", js.undefined)
      
      @scala.inline
      def setPills(value: Boolean): Self = StObject.set(x, "pills", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPillsUndefined: Self = StObject.set(x, "pills", js.undefined)
      
      @scala.inline
      def setTabs(value: Boolean): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
      
      @scala.inline
      def setTag(value: ElementType[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean | String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
}
