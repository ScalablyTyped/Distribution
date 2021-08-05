package typings.primereact

import typings.primereact.anon.DataObject
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowRadioButtonMod {
  
  @JSImport("primereact/components/datatable/RowRadioButton", "RowRadioButton")
  @js.native
  class RowRadioButton protected ()
    extends Component[RowRadioButtonProps, js.Any, js.Any] {
    def this(props: RowRadioButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RowRadioButtonProps, context: js.Any) = this()
  }
  
  trait RowRadioButtonProps extends StObject {
    
    var onClick: js.UndefOr[js.Function1[/* e */ DataObject, Unit]] = js.undefined
    
    var rowData: js.UndefOr[js.Object] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
  }
  object RowRadioButtonProps {
    
    inline def apply(): RowRadioButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowRadioButtonProps]
    }
    
    extension [Self <: RowRadioButtonProps](x: Self) {
      
      inline def setOnClick(value: /* e */ DataObject => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setRowData(value: js.Object): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      inline def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
}
