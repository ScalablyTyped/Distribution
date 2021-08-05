package typings.reactSketchapp

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defsMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Defs", JSImport.Default)
  @js.native
  class default ()
    extends Component[DefsProps, js.Object, js.Any]
  
  type Defs = Component[DefsProps, js.Object, js.Any]
  
  trait DefsProps extends StObject {
    
    var children: js.Array[ReactNode] | ReactNode
  }
  object DefsProps {
    
    inline def apply(): DefsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefsProps]
    }
    
    extension [Self <: DefsProps](x: Self) {
      
      inline def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    }
  }
}
