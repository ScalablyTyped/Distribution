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
  open class default ()
    extends Component[ReactScrollIntoViewIfNeededProps, js.Object, Any]
  
  type ReactScrollIntoViewIfNeeded = Component[ReactScrollIntoViewIfNeededProps, js.Object, Any]
  
  trait ReactScrollIntoViewIfNeededProps
    extends StObject
       with HTMLProps[HTMLElement] {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var elementType: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.reactScrollIntoViewIfNeeded.reactScrollIntoViewIfNeededStrings.a, typings.reactScrollIntoViewIfNeeded.reactScrollIntoViewIfNeededStrings.abbr, typings.reactScrollIntoViewIfNeeded.reactScrollIntoViewIfNeededStrings.address */ Any
      ] = js.undefined
    
    var options: js.UndefOr[Options[Any]] = js.undefined
  }
  object ReactScrollIntoViewIfNeededProps {
    
    inline def apply(): ReactScrollIntoViewIfNeededProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactScrollIntoViewIfNeededProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactScrollIntoViewIfNeededProps] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setElementType(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.reactScrollIntoViewIfNeeded.reactScrollIntoViewIfNeededStrings.a, typings.reactScrollIntoViewIfNeeded.reactScrollIntoViewIfNeededStrings.abbr, typings.reactScrollIntoViewIfNeeded.reactScrollIntoViewIfNeededStrings.address */ Any
      ): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
      
      inline def setElementTypeUndefined: Self = StObject.set(x, "elementType", js.undefined)
      
      inline def setOptions(value: Options[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
