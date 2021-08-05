package typings.reactMdList

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLOListElement
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @JSImport("@react-md/list/types/List", "List")
  @js.native
  val List: ForwardRefExoticComponent[ListProps & RefAttributes[ListElement]] = js.native
  
  type ListElement = HTMLUListElement | HTMLOListElement
  
  trait ListProps
    extends StObject
       with HTMLAttributes[ListElement] {
    
    /**
      * Boolean if the dense spec should be applied to the list.
      */
    var dense: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the list should appear horizontally instead of vertically.
      */
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the list's order is important. This will update the list to be
      * rendered as an `<ol>` instead of `<ul>`.
      */
    var ordered: js.UndefOr[Boolean] = js.undefined
  }
  object ListProps {
    
    inline def apply(): ListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListProps]
    }
    
    extension [Self <: ListProps](x: Self) {
      
      inline def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
      
      inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
      
      inline def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
    }
  }
}
