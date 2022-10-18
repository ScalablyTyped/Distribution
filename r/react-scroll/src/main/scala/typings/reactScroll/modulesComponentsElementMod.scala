package typings.reactScroll

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesComponentsElementMod {
  
  @JSImport("react-scroll/modules/components/Element", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ElementProps, js.Object, Any]
  
  type Element = Component[ElementProps, js.Object, Any]
  
  trait ElementProps
    extends StObject
       with HTMLProps[HTMLDivElement] {
    
    @JSName("name")
    var name_ElementProps: String
  }
  object ElementProps {
    
    inline def apply(name: String): ElementProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementProps]
    }
    
    extension [Self <: ElementProps](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
