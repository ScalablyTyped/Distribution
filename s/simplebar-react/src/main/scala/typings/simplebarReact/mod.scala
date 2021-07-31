package typings.simplebarReact

import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("simplebar-react", JSImport.Default)
  @js.native
  class default ()
    extends Component[Props, js.Object, js.Any]
  
  trait Props
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    var options: js.UndefOr[js.Object] = js.undefined
    
    var scrollableNodeProps: js.UndefOr[js.Object] = js.undefined
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setScrollableNodeProps(value: js.Object): Self = StObject.set(x, "scrollableNodeProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollableNodePropsUndefined: Self = StObject.set(x, "scrollableNodeProps", js.undefined)
    }
  }
  
  type SimpleBar = Component[Props, js.Object, js.Any]
}
