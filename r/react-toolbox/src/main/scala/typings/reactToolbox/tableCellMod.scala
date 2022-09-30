package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.mod.ReactToolbox.Props
import typings.reactToolbox.reactToolboxStrings.asc
import typings.reactToolbox.reactToolboxStrings.desc
import typings.reactToolbox.reactToolboxStrings.td
import typings.reactToolbox.reactToolboxStrings.th
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableCellMod {
  
  @JSImport("react-toolbox/components/table/TableCell", JSImport.Default)
  @js.native
  open class default protected () extends TableCell {
    def this(props: TableCellProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TableCellProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/table/TableCell", "TableCell")
  @js.native
  open class TableCell protected ()
    extends Component[TableCellProps, js.Object, Any] {
    def this(props: TableCellProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TableCellProps, context: Any) = this()
  }
  
  trait TableCellProps
    extends StObject
       with Props {
    
    /**
      * The column number of this cell.
      */
    var column: js.UndefOr[Double] = js.undefined
    
    /**
      * If true the cell is considered as numeric and the content will be displayed aligned to right.
      * @default false
      */
    var numeric: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The row number of the cell.
      */
    var row: js.UndefOr[Double] = js.undefined
    
    /**
      * If you provide a value the cell will show an arrow pointing down or up depending on the value to indicate it is a sorted element. Useful only for columns.
      */
    var sorted: js.UndefOr[asc | desc] = js.undefined
    
    /**
      * The element tag, either `td` or `th`.
      * @default 'td'
      */
    var tagName: js.UndefOr[td | th] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[TableCellTheme] = js.undefined
  }
  object TableCellProps {
    
    inline def apply(): TableCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableCellProps]
    }
    
    extension [Self <: TableCellProps](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      inline def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setSorted(value: asc | desc): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
      
      inline def setSortedUndefined: Self = StObject.set(x, "sorted", js.undefined)
      
      inline def setTagName(value: td | th): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      inline def setTheme(value: TableCellTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait TableCellTheme extends StObject {
    
    /**
      * Modifier for the icon in case the order is ascendent.
      */
    var asc: js.UndefOr[String] = js.undefined
    
    /**
      * Added to each cell displayed in the head.
      */
    var headCell: js.UndefOr[String] = js.undefined
    
    /**
      * Modifier for cells that are numeric.
      */
    var numeric: js.UndefOr[String] = js.undefined
    
    /**
      * Added to each cell displayed in the table body.
      */
    var rowCell: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the sort icon included in sorted cells.
      */
    var sortIcon: js.UndefOr[String] = js.undefined
    
    /**
      * Modifier for cells that are sorted asc or desc.
      */
    var sorted: js.UndefOr[String] = js.undefined
    
    /**
      * Applied to the root element of the cell.
      */
    var tableCell: js.UndefOr[String] = js.undefined
  }
  object TableCellTheme {
    
    inline def apply(): TableCellTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableCellTheme]
    }
    
    extension [Self <: TableCellTheme](x: Self) {
      
      inline def setAsc(value: String): Self = StObject.set(x, "asc", value.asInstanceOf[js.Any])
      
      inline def setAscUndefined: Self = StObject.set(x, "asc", js.undefined)
      
      inline def setHeadCell(value: String): Self = StObject.set(x, "headCell", value.asInstanceOf[js.Any])
      
      inline def setHeadCellUndefined: Self = StObject.set(x, "headCell", js.undefined)
      
      inline def setNumeric(value: String): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      inline def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
      
      inline def setRowCell(value: String): Self = StObject.set(x, "rowCell", value.asInstanceOf[js.Any])
      
      inline def setRowCellUndefined: Self = StObject.set(x, "rowCell", js.undefined)
      
      inline def setSortIcon(value: String): Self = StObject.set(x, "sortIcon", value.asInstanceOf[js.Any])
      
      inline def setSortIconUndefined: Self = StObject.set(x, "sortIcon", js.undefined)
      
      inline def setSorted(value: String): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
      
      inline def setSortedUndefined: Self = StObject.set(x, "sorted", js.undefined)
      
      inline def setTableCell(value: String): Self = StObject.set(x, "tableCell", value.asInstanceOf[js.Any])
      
      inline def setTableCellUndefined: Self = StObject.set(x, "tableCell", js.undefined)
    }
  }
}
