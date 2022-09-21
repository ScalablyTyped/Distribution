package typings.reactDayPicker

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableTableMod {
  
  @JSImport("react-day-picker/dist/components/Table/Table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Table(props: TableProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Table")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait TableProps extends StObject {
    
    /** The ID of the label of the table (the same given to the Caption). */
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    /** The month where the table is displayed. */
    var displayMonth: js.Date
  }
  object TableProps {
    
    inline def apply(displayMonth: js.Date): TableProps = {
      val __obj = js.Dynamic.literal(displayMonth = displayMonth.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableProps]
    }
    
    extension [Self <: TableProps](x: Self) {
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def setDisplayMonth(value: js.Date): Self = StObject.set(x, "displayMonth", value.asInstanceOf[js.Any])
    }
  }
}
