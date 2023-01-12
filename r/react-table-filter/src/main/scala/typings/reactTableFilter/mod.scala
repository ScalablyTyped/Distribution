package typings.reactTableFilter

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-table-filter", "TableFilter")
  @js.native
  open class TableFilter protected ()
    extends Component[TabfilterProps, js.Object, Any] {
    def this(props: TabfilterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabfilterProps, context: Any) = this()
  }
  
  trait TabfilterProps extends StObject {
    
    var initialFilters: js.UndefOr[String | js.Array[String] | StringDictionary[Boolean]] = js.undefined
    
    def onFilterUpdate(filteredArray: js.Array[String], currentFilters: js.Array[Any]): js.Array[Any] | Unit
    
    var rowClass: js.UndefOr[String] = js.undefined
    
    var rows: String | js.Array[String] | StringDictionary[Boolean]
  }
  object TabfilterProps {
    
    inline def apply(
      onFilterUpdate: (js.Array[String], js.Array[Any]) => js.Array[Any] | Unit,
      rows: String | js.Array[String] | StringDictionary[Boolean]
    ): TabfilterProps = {
      val __obj = js.Dynamic.literal(onFilterUpdate = js.Any.fromFunction2(onFilterUpdate), rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabfilterProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabfilterProps] (val x: Self) extends AnyVal {
      
      inline def setInitialFilters(value: String | js.Array[String] | StringDictionary[Boolean]): Self = StObject.set(x, "initialFilters", value.asInstanceOf[js.Any])
      
      inline def setInitialFiltersUndefined: Self = StObject.set(x, "initialFilters", js.undefined)
      
      inline def setInitialFiltersVarargs(value: String*): Self = StObject.set(x, "initialFilters", js.Array(value*))
      
      inline def setOnFilterUpdate(value: (js.Array[String], js.Array[Any]) => js.Array[Any] | Unit): Self = StObject.set(x, "onFilterUpdate", js.Any.fromFunction2(value))
      
      inline def setRowClass(value: String): Self = StObject.set(x, "rowClass", value.asInstanceOf[js.Any])
      
      inline def setRowClassUndefined: Self = StObject.set(x, "rowClass", js.undefined)
      
      inline def setRows(value: String | js.Array[String] | StringDictionary[Boolean]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsVarargs(value: String*): Self = StObject.set(x, "rows", js.Array(value*))
    }
  }
}
