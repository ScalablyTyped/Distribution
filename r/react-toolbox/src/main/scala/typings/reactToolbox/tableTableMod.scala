package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableTableMod {
  
  @JSImport("react-toolbox/components/table/Table", JSImport.Default)
  @js.native
  open class default protected () extends Table {
    def this(props: TableProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TableProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/table/Table", "Table")
  @js.native
  open class Table protected ()
    extends Component[TableProps, js.Object, Any] {
    def this(props: TableProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TableProps, context: Any) = this()
  }
  
  trait TableProps
    extends StObject
       with Props {
    
    /**
      * If true, the header and each row will display a checkbox to allow the user to select multiple rows.
      * @default true
      */
    var multiSelectable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Will be called when the row selection changes. It passes an array of selected indexes as first parameter so you can figure out changes in your local state.
      */
    var onRowSelect: js.UndefOr[js.Function] = js.undefined
    
    /**
      * If true, each row will display a checkbox to allow the user to select that one row.
      * @default true
      */
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[TableTheme] = js.undefined
  }
  object TableProps {
    
    inline def apply(): TableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableProps]
    }
    
    extension [Self <: TableProps](x: Self) {
      
      inline def setMultiSelectable(value: Boolean): Self = StObject.set(x, "multiSelectable", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectableUndefined: Self = StObject.set(x, "multiSelectable", js.undefined)
      
      inline def setOnRowSelect(value: js.Function): Self = StObject.set(x, "onRowSelect", value.asInstanceOf[js.Any])
      
      inline def setOnRowSelectUndefined: Self = StObject.set(x, "onRowSelect", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setTheme(value: TableTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait TableTheme extends StObject {
    
    /**
      * Used for the `thead` element.
      */
    var head: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the root element of the component (`table`).
      */
    var table: js.UndefOr[String] = js.undefined
  }
  object TableTheme {
    
    inline def apply(): TableTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableTheme]
    }
    
    extension [Self <: TableTheme](x: Self) {
      
      inline def setHead(value: String): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    }
  }
}
