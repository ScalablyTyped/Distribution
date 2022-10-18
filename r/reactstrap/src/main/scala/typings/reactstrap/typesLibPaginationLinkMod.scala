package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.reactstrap.typesLibUtilsMod.CSSModule
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibPaginationLinkMod {
  
  @JSImport("reactstrap/types/lib/PaginationLink", JSImport.Default)
  @js.native
  open class default ()
    extends Component[PaginationLinkProps, js.Object, Any]
  
  type PaginationLink = Component[PaginationLinkProps, js.Object, Any]
  
  trait PaginationLinkProps
    extends StObject
       with AnchorHTMLAttributes[HTMLAnchorElement]
       with /* key */ StringDictionary[Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var first: js.UndefOr[Boolean] = js.undefined
    
    var last: js.UndefOr[Boolean] = js.undefined
    
    var next: js.UndefOr[Boolean] = js.undefined
    
    var previous: js.UndefOr[Boolean] = js.undefined
    
    var tag: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object PaginationLinkProps {
    
    inline def apply(): PaginationLinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationLinkProps]
    }
    
    extension [Self <: PaginationLinkProps](x: Self) {
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      inline def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
      
      inline def setNext(value: Boolean): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPrevious(value: Boolean): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      
      inline def setTag(value: ElementType[Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
