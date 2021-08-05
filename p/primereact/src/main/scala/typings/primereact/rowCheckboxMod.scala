package typings.primereact

import typings.primereact.anon.CheckedData
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowCheckboxMod {
  
  @JSImport("primereact/components/datatable/RowCheckbox", "RowCheckbox")
  @js.native
  class RowCheckbox protected ()
    extends Component[RowCheckboxProps, js.Any, js.Any] {
    def this(props: RowCheckboxProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RowCheckboxProps, context: js.Any) = this()
  }
  
  trait RowCheckboxProps extends StObject {
    
    var onClick: js.UndefOr[js.Function1[/* e */ CheckedData, Unit]] = js.undefined
    
    var rowData: js.UndefOr[js.Object] = js.undefined
  }
  object RowCheckboxProps {
    
    inline def apply(): RowCheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowCheckboxProps]
    }
    
    extension [Self <: RowCheckboxProps](x: Self) {
      
      inline def setOnClick(value: /* e */ CheckedData => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setRowData(value: js.Object): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      inline def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
    }
  }
}
