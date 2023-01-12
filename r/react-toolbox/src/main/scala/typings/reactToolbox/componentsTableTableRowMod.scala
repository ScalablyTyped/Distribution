package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsTableTableRowMod {
  
  @JSImport("react-toolbox/components/table/TableRow", JSImport.Default)
  @js.native
  open class default protected () extends TableRow {
    def this(props: TableRowProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TableRowProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/table/TableRow", "TableRow")
  @js.native
  open class TableRow protected ()
    extends Component[TableRowProps, js.Object, Any] {
    def this(props: TableRowProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TableRowProps, context: Any) = this()
  }
  
  trait TableRowProps
    extends StObject
       with Props {
    
    /**
      * The index of the row.
      */
    var idx: js.UndefOr[Double] = js.undefined
    
    /**
      * Handle the select state change of the checkbox in the ow.
      */
    var onSelect: js.UndefOr[js.Function] = js.undefined
    
    /**
      * If true, each row will display a checkbox to allow the user to select that one row.
      * @default true
      */
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the row will be considered as selected so the row will display a selected style with the selection control activated. This property is used by `Table` to figure out the selection when you interact with the Table.
      */
    var selected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[TableRowTheme] = js.undefined
  }
  object TableRowProps {
    
    inline def apply(): TableRowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableRowProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableRowProps] (val x: Self) extends AnyVal {
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setIdxUndefined: Self = StObject.set(x, "idx", js.undefined)
      
      inline def setOnSelect(value: js.Function): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setTheme(value: TableRowTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait TableRowTheme extends StObject {
    
    /**
      * Modifier for cells that include a select checkbox.
      */
    var checkboxCell: js.UndefOr[String] = js.undefined
    
    /**
      * Added to each row in the table except for the header.
      */
    var row: js.UndefOr[String] = js.undefined
    
    /**
      * Modifier for rows that are selected.
      */
    var selected: js.UndefOr[String] = js.undefined
  }
  object TableRowTheme {
    
    inline def apply(): TableRowTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableRowTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableRowTheme] (val x: Self) extends AnyVal {
      
      inline def setCheckboxCell(value: String): Self = StObject.set(x, "checkboxCell", value.asInstanceOf[js.Any])
      
      inline def setCheckboxCellUndefined: Self = StObject.set(x, "checkboxCell", js.undefined)
      
      inline def setRow(value: String): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
}
