package typings.reactSketchapp

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipPathMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/ClipPath", JSImport.Default)
  @js.native
  class default ()
    extends Component[ClipPathProps, js.Object, js.Any]
  
  type ClipPath = Component[ClipPathProps, js.Object, js.Any]
  
  trait ClipPathProps extends StObject {
    
    var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
    
    var id: String
  }
  object ClipPathProps {
    
    inline def apply(id: String): ClipPathProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClipPathProps]
    }
    
    extension [Self <: ClipPathProps](x: Self) {
      
      inline def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
