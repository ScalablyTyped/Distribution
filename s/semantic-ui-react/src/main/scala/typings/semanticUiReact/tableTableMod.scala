package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ElementType
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticCOLORS
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typings.semanticUiReact.genericMod.SemanticWIDTHS
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.center
import typings.semanticUiReact.semanticUiReactStrings.internally
import typings.semanticUiReact.semanticUiReactStrings.large
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.right
import typings.semanticUiReact.semanticUiReactStrings.small
import typings.semanticUiReact.semanticUiReactStrings.top
import typings.semanticUiReact.semanticUiReactStrings.very
import typings.semanticUiReact.tableBodyMod.TableBodyProps
import typings.semanticUiReact.tableCellMod.TableCellProps
import typings.semanticUiReact.tableFooterMod.TableFooterProps
import typings.semanticUiReact.tableHeaderCellMod.TableHeaderCellProps
import typings.semanticUiReact.tableHeaderMod.TableHeaderProps
import typings.semanticUiReact.tableRowMod.TableRowProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableTableMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Table/Table", JSImport.Default)
  @js.native
  val default: TableComponent = js.native
  
  @js.native
  trait StrictTableProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Attach table to other content */
    var attached: js.UndefOr[Boolean | top | bottom] = js.native
    
    /** A table can reduce its complexity to increase readability. */
    var basic: js.UndefOr[Boolean | very] = js.native
    
    /** A table may be divided each row into separate cells. */
    var celled: js.UndefOr[Boolean | internally] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** A table can be collapsing, taking up only as much space as its rows. */
    var collapsing: js.UndefOr[Boolean] = js.native
    
    /** A table can be given a color to distinguish it from other tables. */
    var color: js.UndefOr[SemanticCOLORS] = js.native
    
    /** A table can specify its column count to divide its content evenly. */
    var columns: js.UndefOr[SemanticWIDTHS] = js.native
    
    /** A table may sometimes need to be more compact to make more rows visible at a time. */
    var compact: js.UndefOr[Boolean | very] = js.native
    
    /** A table may be formatted to emphasize a first column that defines a rows content. */
    var definition: js.UndefOr[Boolean] = js.native
    
    /**
      * A table can use fixed a special faster form of table rendering that does not resize table cells based on content.
      */
    var fixed: js.UndefOr[Boolean] = js.native
    
    /** Shorthand for a TableRow to be placed within Table.Footer. */
    var footerRow: js.UndefOr[SemanticShorthandItem[TableRowProps]] = js.native
    
    /** Shorthand for a TableRow to be placed within Table.Header. */
    var headerRow: js.UndefOr[SemanticShorthandItem[TableRowProps]] = js.native
    
    /** Shorthand for multiple TableRows to be placed within Table.Header. */
    var headerRows: js.UndefOr[SemanticShorthandCollection[TableRowProps]] = js.native
    
    /** A table's colors can be inverted. */
    var inverted: js.UndefOr[Boolean] = js.native
    
    /** A table may sometimes need to be more padded for legibility. */
    var padded: js.UndefOr[Boolean | very] = js.native
    
    /**
      * Mapped over `tableData` and should return shorthand for each Table.Row to be placed within Table.Body.
      *
      * @param {*} data - An element in the `tableData` array.
      * @param {number} index - The index of the current element in `tableData`.
      * @returns {*} Shorthand for a Table.Row.
      */
    var renderBodyRow: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, _]] = js.native
    
    /** A table can have its rows appear selectable. */
    var selectable: js.UndefOr[Boolean] = js.native
    
    /** A table can specify that its cell contents should remain on a single line and not wrap. */
    var singleLine: js.UndefOr[Boolean] = js.native
    
    /** A table can also be small or large. */
    var size: js.UndefOr[small | large] = js.native
    
    /** A table may allow a user to sort contents by clicking on a table header. */
    var sortable: js.UndefOr[Boolean] = js.native
    
    /** A table can specify how it stacks table content responsively. */
    var stackable: js.UndefOr[Boolean] = js.native
    
    /** A table can stripe alternate rows of content with a darker color to increase contrast. */
    var striped: js.UndefOr[Boolean] = js.native
    
    /** A table can be formatted to display complex structured data. */
    var structured: js.UndefOr[Boolean] = js.native
    
    /** Data to be passed to the renderBodyRow function. */
    var tableData: js.UndefOr[js.Array[_]] = js.native
    
    /** A table can adjust its text alignment. */
    var textAlign: js.UndefOr[center | left | right] = js.native
    
    /** A table can specify how it stacks table content responsively. */
    var unstackable: js.UndefOr[Boolean] = js.native
    
    /** A table can adjust its text alignment. */
    var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.native
  }
  object StrictTableProps {
    
    @scala.inline
    def apply(): StrictTableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTableProps]
    }
    
    @scala.inline
    implicit class StrictTablePropsMutableBuilder[Self <: StrictTableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setAttached(value: Boolean | top | bottom): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      @scala.inline
      def setBasic(value: Boolean | very): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
      
      @scala.inline
      def setCelled(value: Boolean | internally): Self = StObject.set(x, "celled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCelledUndefined: Self = StObject.set(x, "celled", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCollapsing(value: Boolean): Self = StObject.set(x, "collapsing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsingUndefined: Self = StObject.set(x, "collapsing", js.undefined)
      
      @scala.inline
      def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColumns(value: SemanticWIDTHS): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean | very): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setDefinition(value: Boolean): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
      
      @scala.inline
      def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      @scala.inline
      def setFooterRow(value: SemanticShorthandItem[TableRowProps]): Self = StObject.set(x, "footerRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterRowFunction3(
        value: (/* component */ ElementType[TableRowProps], TableRowProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "footerRow", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFooterRowUndefined: Self = StObject.set(x, "footerRow", js.undefined)
      
      @scala.inline
      def setHeaderRow(value: SemanticShorthandItem[TableRowProps]): Self = StObject.set(x, "headerRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderRowFunction3(
        value: (/* component */ ElementType[TableRowProps], TableRowProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "headerRow", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHeaderRowUndefined: Self = StObject.set(x, "headerRow", js.undefined)
      
      @scala.inline
      def setHeaderRows(value: SemanticShorthandCollection[TableRowProps]): Self = StObject.set(x, "headerRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderRowsUndefined: Self = StObject.set(x, "headerRows", js.undefined)
      
      @scala.inline
      def setHeaderRowsVarargs(value: SemanticShorthandItem[TableRowProps]*): Self = StObject.set(x, "headerRows", js.Array(value :_*))
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      @scala.inline
      def setPadded(value: Boolean | very): Self = StObject.set(x, "padded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddedUndefined: Self = StObject.set(x, "padded", js.undefined)
      
      @scala.inline
      def setRenderBodyRow(value: (/* data */ js.Any, /* index */ Double) => _): Self = StObject.set(x, "renderBodyRow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderBodyRowUndefined: Self = StObject.set(x, "renderBodyRow", js.undefined)
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      @scala.inline
      def setSingleLine(value: Boolean): Self = StObject.set(x, "singleLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleLineUndefined: Self = StObject.set(x, "singleLine", js.undefined)
      
      @scala.inline
      def setSize(value: small | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      @scala.inline
      def setStackable(value: Boolean): Self = StObject.set(x, "stackable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackableUndefined: Self = StObject.set(x, "stackable", js.undefined)
      
      @scala.inline
      def setStriped(value: Boolean): Self = StObject.set(x, "striped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripedUndefined: Self = StObject.set(x, "striped", js.undefined)
      
      @scala.inline
      def setStructured(value: Boolean): Self = StObject.set(x, "structured", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStructuredUndefined: Self = StObject.set(x, "structured", js.undefined)
      
      @scala.inline
      def setTableData(value: js.Array[_]): Self = StObject.set(x, "tableData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableDataUndefined: Self = StObject.set(x, "tableData", js.undefined)
      
      @scala.inline
      def setTableDataVarargs(value: js.Any*): Self = StObject.set(x, "tableData", js.Array(value :_*))
      
      @scala.inline
      def setTextAlign(value: center | left | right): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setUnstackable(value: Boolean): Self = StObject.set(x, "unstackable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnstackableUndefined: Self = StObject.set(x, "unstackable", js.undefined)
      
      @scala.inline
      def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    }
  }
  
  @js.native
  trait TableComponent extends FunctionComponent[TableProps] {
    
    var Body: StatelessComponent[TableBodyProps] = js.native
    
    var Cell: StatelessComponent[TableCellProps] = js.native
    
    var Footer: StatelessComponent[TableFooterProps] = js.native
    
    var Header: StatelessComponent[TableHeaderProps] = js.native
    
    var HeaderCell: StatelessComponent[TableHeaderCellProps] = js.native
    
    var Row: StatelessComponent[TableRowProps] = js.native
  }
  
  @js.native
  trait TableProps
    extends StrictTableProps
       with /* key */ StringDictionary[js.Any]
  object TableProps {
    
    @scala.inline
    def apply(): TableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableProps]
    }
  }
  
  type _To = TableComponent
  
  /* This means you don't have to write `default`, but can instead just say `tableTableMod.foo` */
  override def _to: TableComponent = default
}
