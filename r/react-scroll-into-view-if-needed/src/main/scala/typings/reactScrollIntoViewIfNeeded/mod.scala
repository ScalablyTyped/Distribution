package typings.reactScrollIntoViewIfNeeded

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.scrollIntoViewIfNeeded.mod.Options
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-scroll-into-view-if-needed", JSImport.Default)
  @js.native
  class default ()
    extends Component[ReactScrollIntoViewIfNeededProps, js.Object, js.Any]
  
  type ReactScrollIntoViewIfNeeded = Component[ReactScrollIntoViewIfNeededProps, js.Object, js.Any]
  
  trait ReactScrollIntoViewIfNeededProps
    extends StObject
       with HTMLProps[HTMLElement] {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var elementType: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
      ] = js.undefined
    
    var options: js.UndefOr[Options[js.Any]] = js.undefined
  }
  object ReactScrollIntoViewIfNeededProps {
    
    @scala.inline
    def apply(): ReactScrollIntoViewIfNeededProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactScrollIntoViewIfNeededProps]
    }
    
    @scala.inline
    implicit class ReactScrollIntoViewIfNeededPropsMutableBuilder[Self <: ReactScrollIntoViewIfNeededProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setElementType(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementTypeUndefined: Self = StObject.set(x, "elementType", js.undefined)
      
      @scala.inline
      def setOptions(value: Options[js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
