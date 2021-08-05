package typings.reactSketchapp

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symbolMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Symbol", JSImport.Default)
  @js.native
  class default ()
    extends Component[SymbolProps, js.Object, js.Any]
  
  type Symbol = Component[SymbolProps, js.Object, js.Any]
  
  trait SymbolProps extends StObject {
    
    var children: js.Array[ReactNode] | ReactNode
    
    var id: String
    
    var preserveAspectRatio: js.UndefOr[String] = js.undefined
    
    var viewBox: js.UndefOr[String] = js.undefined
  }
  object SymbolProps {
    
    inline def apply(id: String): SymbolProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SymbolProps]
    }
    
    extension [Self <: SymbolProps](x: Self) {
      
      inline def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    }
  }
}
