package typings.reactSketchapp

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symbolMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Symbol", JSImport.Default)
  @js.native
  class default ()
    extends Component[SymbolProps, js.Object, js.Any]
  
  type Symbol = Component[SymbolProps, js.Object, js.Any]
  
  @js.native
  trait SymbolProps extends StObject {
    
    var children: js.Array[ReactNode] | ReactNode = js.native
    
    var id: String = js.native
    
    var preserveAspectRatio: js.UndefOr[String] = js.native
    
    var viewBox: js.UndefOr[String] = js.native
  }
  object SymbolProps {
    
    @scala.inline
    def apply(id: String): SymbolProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SymbolProps]
    }
    
    @scala.inline
    implicit class SymbolPropsMutableBuilder[Self <: SymbolProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      @scala.inline
      def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    }
  }
}
