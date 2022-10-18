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

object typesLibPlaceholderButtonMod {
  
  @JSImport("reactstrap/types/lib/PlaceholderButton", JSImport.Default)
  @js.native
  open class default ()
    extends Component[PlaceholderButtonProps, js.Object, Any]
  
  type PlaceholderButton = Component[PlaceholderButtonProps, js.Object, Any]
  
  trait PlaceholderButtonProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var outline: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object PlaceholderButtonProps {
    
    inline def apply(): PlaceholderButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlaceholderButtonProps]
    }
    
    extension [Self <: PlaceholderButtonProps](x: Self) {
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setOutline(value: Boolean): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
      
      inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTag(value: ElementType[Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
