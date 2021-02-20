package typings.reactMdList

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLOListElement
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @JSImport("@react-md/list/types/List", "List")
  @js.native
  val List: ForwardRefExoticComponent[ListProps with RefAttributes[ListElement]] = js.native
  
  type ListElement = HTMLUListElement | HTMLOListElement
  
  @js.native
  trait ListProps extends HTMLAttributes[ListElement] {
    
    /**
      * Boolean if the dense spec should be applied to the list.
      */
    var dense: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the list should appear horizontally instead of vertically.
      */
    var horizontal: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the list's order is important. This will update the list to be
      * rendered as an `<ol>` instead of `<ul>`.
      */
    var ordered: js.UndefOr[Boolean] = js.native
  }
  object ListProps {
    
    @scala.inline
    def apply(): ListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListProps]
    }
    
    @scala.inline
    implicit class ListPropsMutableBuilder[Self <: ListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
    }
  }
}
