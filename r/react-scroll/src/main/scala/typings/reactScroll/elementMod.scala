package typings.reactScroll

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementMod {
  
  @JSImport("react-scroll/modules/components/Element", JSImport.Default)
  @js.native
  class default ()
    extends Component[ElementProps, js.Object, js.Any]
  
  type Element = Component[ElementProps, js.Object, js.Any]
  
  @js.native
  trait ElementProps extends HTMLProps[HTMLDivElement] {
    
    @JSName("name")
    var name_ElementProps: String = js.native
  }
  object ElementProps {
    
    @scala.inline
    def apply(name: String): ElementProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementProps]
    }
    
    @scala.inline
    implicit class ElementPropsMutableBuilder[Self <: ElementProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
