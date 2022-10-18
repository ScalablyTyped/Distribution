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

object typesLibOffcanvasBodyMod {
  
  @JSImport("reactstrap/types/lib/OffcanvasBody", JSImport.Default)
  @js.native
  open class default ()
    extends Component[OffcanvasBodyProps, js.Object, Any]
  
  type OffcanvasBody = Component[OffcanvasBodyProps, js.Object, Any]
  
  trait OffcanvasBodyProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var tag: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object OffcanvasBodyProps {
    
    inline def apply(): OffcanvasBodyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OffcanvasBodyProps]
    }
    
    extension [Self <: OffcanvasBodyProps](x: Self) {
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setTag(value: ElementType[Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
