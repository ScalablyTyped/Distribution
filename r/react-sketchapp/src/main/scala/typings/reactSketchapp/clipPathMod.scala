package typings.reactSketchapp

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipPathMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/ClipPath", JSImport.Default)
  @js.native
  class default ()
    extends Component[ClipPathProps, js.Object, js.Any]
  
  type ClipPath = Component[ClipPathProps, js.Object, js.Any]
  
  @js.native
  trait ClipPathProps extends StObject {
    
    var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.native
    
    var id: String = js.native
  }
  object ClipPathProps {
    
    @scala.inline
    def apply(id: String): ClipPathProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClipPathProps]
    }
    
    @scala.inline
    implicit class ClipPathPropsMutableBuilder[Self <: ClipPathProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
