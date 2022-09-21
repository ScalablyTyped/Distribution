package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.reactstrap.utilsMod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverBodyMod {
  
  @JSImport("reactstrap/types/lib/PopoverBody", JSImport.Default)
  @js.native
  open class default ()
    extends Component[PopoverBodyProps, js.Object, Any]
  
  type PopoverBody = Component[PopoverBodyProps, js.Object, Any]
  
  trait PopoverBodyProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var tag: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object PopoverBodyProps {
    
    inline def apply(): PopoverBodyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverBodyProps]
    }
    
    extension [Self <: PopoverBodyProps](x: Self) {
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setTag(value: ElementType[Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
