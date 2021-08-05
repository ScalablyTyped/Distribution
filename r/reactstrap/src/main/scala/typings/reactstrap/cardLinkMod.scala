package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.Ref
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardLinkMod {
  
  @JSImport("reactstrap/lib/CardLink", JSImport.Default)
  @js.native
  class default ()
    extends Component[CardLinkProps, js.Object, js.Any]
  
  type CardLink = Component[CardLinkProps, js.Object, js.Any]
  
  trait CardLinkProps
    extends StObject
       with AnchorHTMLAttributes[HTMLAnchorElement]
       with /* key */ StringDictionary[js.Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var innerRef: js.UndefOr[Ref[HTMLAnchorElement]] = js.undefined
    
    var tag: js.UndefOr[ElementType[js.Any]] = js.undefined
  }
  object CardLinkProps {
    
    inline def apply(): CardLinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardLinkProps]
    }
    
    extension [Self <: CardLinkProps](x: Self) {
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setInnerRef(value: Ref[HTMLAnchorElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ HTMLAnchorElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setTag(value: ElementType[js.Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
