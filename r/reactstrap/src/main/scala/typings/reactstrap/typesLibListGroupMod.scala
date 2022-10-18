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

object typesLibListGroupMod {
  
  @JSImport("reactstrap/types/lib/ListGroup", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ListGroupProps, js.Object, Any]
  
  type ListGroup = Component[ListGroupProps, js.Object, Any]
  
  trait ListGroupProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var flush: js.UndefOr[Boolean] = js.undefined
    
    var horizontal: js.UndefOr[Boolean | String] = js.undefined
    
    var numbered: js.UndefOr[Boolean] = js.undefined
    
    var tag: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object ListGroupProps {
    
    inline def apply(): ListGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListGroupProps]
    }
    
    extension [Self <: ListGroupProps](x: Self) {
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setFlush(value: Boolean): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
      
      inline def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
      
      inline def setHorizontal(value: Boolean | String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setNumbered(value: Boolean): Self = StObject.set(x, "numbered", value.asInstanceOf[js.Any])
      
      inline def setNumberedUndefined: Self = StObject.set(x, "numbered", js.undefined)
      
      inline def setTag(value: ElementType[Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
