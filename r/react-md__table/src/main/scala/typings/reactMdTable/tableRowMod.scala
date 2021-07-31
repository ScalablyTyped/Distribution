package typings.reactMdTable

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.reactMdTable.configMod.TableRowConfiguration
import typings.std.HTMLTableRowElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableRowMod {
  
  @JSImport("@react-md/table/types/TableRow", "TableRow")
  @js.native
  val TableRow: ForwardRefExoticComponent[TableRowProps & RefAttributes[HTMLTableRowElement]] = js.native
  
  trait TableRowProps
    extends StObject
       with HTMLAttributes[HTMLTableRowElement]
       with TableRowConfiguration {
    
    /**
      * Boolean if the row should be clickable and update the cursor while hovered
      * to be a pointer.
      */
    var clickable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the current row has been selected and should apply the selected
      * background-color.
      */
    var selected: js.UndefOr[Boolean] = js.undefined
  }
  object TableRowProps {
    
    @scala.inline
    def apply(): TableRowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableRowProps]
    }
    
    @scala.inline
    implicit class TableRowPropsMutableBuilder[Self <: TableRowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
}
