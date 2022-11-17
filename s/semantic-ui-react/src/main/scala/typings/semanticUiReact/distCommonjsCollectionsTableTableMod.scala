package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ElementType
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.semanticUiReact.distCommonjsCollectionsTableTableBodyMod.TableBodyProps
import typings.semanticUiReact.distCommonjsCollectionsTableTableCellMod.TableCellProps
import typings.semanticUiReact.distCommonjsCollectionsTableTableFooterMod.TableFooterProps
import typings.semanticUiReact.distCommonjsCollectionsTableTableHeaderCellMod.TableHeaderCellProps
import typings.semanticUiReact.distCommonjsCollectionsTableTableHeaderMod.TableHeaderProps
import typings.semanticUiReact.distCommonjsCollectionsTableTableRowMod.TableRowProps
import typings.semanticUiReact.distCommonjsGenericMod.SemanticCOLORS
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandCollection
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticUiReact.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS
import typings.semanticUiReact.distCommonjsGenericMod.SemanticWIDTHS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsCollectionsTableTableMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Table/Table", JSImport.Default)
  @js.native
  val default: TableComponent = js.native
  
  trait StrictTableProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Attach table to other content */
    var attached: js.UndefOr[Boolean | "top" | "bottom"] = js.undefined
    
    /** A table can reduce its complexity to increase readability. */
    var basic: js.UndefOr[Boolean | "very"] = js.undefined
    
    /** A table may be divided into individual cells. */
    var celled: js.UndefOr[Boolean | "internally"] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** A table can be collapsing, taking up only as much space as its rows. */
    var collapsing: js.UndefOr[Boolean] = js.undefined
    
    /** A table can be given a color to distinguish it from other tables. */
    var color: js.UndefOr[SemanticCOLORS] = js.undefined
    
    /** A table can specify its column count to divide its content evenly. */
    var columns: js.UndefOr[SemanticWIDTHS] = js.undefined
    
    /** A table may sometimes need to be more compact to make more rows visible at a time. */
    var compact: js.UndefOr[Boolean | "very"] = js.undefined
    
    /** A table may be formatted to emphasize a first column that defines a rows content. */
    var definition: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A table can use fixed a special faster form of table rendering that does not resize table cells based on content.
      */
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand for a TableRow to be placed within Table.Footer. */
    var footerRow: js.UndefOr[SemanticShorthandItem[TableRowProps]] = js.undefined
    
    /** Shorthand for a TableRow to be placed within Table.Header. */
    var headerRow: js.UndefOr[SemanticShorthandItem[TableRowProps]] = js.undefined
    
    /** Shorthand for multiple TableRows to be placed within Table.Header. */
    var headerRows: js.UndefOr[SemanticShorthandCollection[TableRowProps]] = js.undefined
    
    /** A table's colors can be inverted. */
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    /** A table may sometimes need to be more padded for legibility. */
    var padded: js.UndefOr[Boolean | "very"] = js.undefined
    
    /**
      * Mapped over `tableData` and should return shorthand for each Table.Row to be placed within Table.Body.
      *
      * @param {*} data - An element in the `tableData` array.
      * @param {number} index - The index of the current element in `tableData`.
      * @returns {*} Shorthand for a Table.Row.
      */
    var renderBodyRow: js.UndefOr[js.Function2[/* data */ Any, /* index */ Double, Any]] = js.undefined
    
    /** A table can have its rows appear selectable. */
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    /** A table can specify that its cell contents should remain on a single line and not wrap. */
    var singleLine: js.UndefOr[Boolean] = js.undefined
    
    /** A table can also be small or large. */
    var size: js.UndefOr["small" | "large"] = js.undefined
    
    /** A table may allow a user to sort contents by clicking on a table header. */
    var sortable: js.UndefOr[Boolean] = js.undefined
    
    /** A table can specify how it stacks table content responsively. */
    var stackable: js.UndefOr[Boolean] = js.undefined
    
    /** A table can stripe alternate rows of content with a darker color to increase contrast. */
    var striped: js.UndefOr[Boolean] = js.undefined
    
    /** A table can be formatted to display complex structured data. */
    var structured: js.UndefOr[Boolean] = js.undefined
    
    /** Data to be passed to the renderBodyRow function. */
    var tableData: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** A table can adjust its text alignment. */
    var textAlign: js.UndefOr["center" | "left" | "right"] = js.undefined
    
    /** A table can specify how it stacks table content responsively. */
    var unstackable: js.UndefOr[Boolean] = js.undefined
    
    /** A table can adjust its text alignment. */
    var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.undefined
  }
  object StrictTableProps {
    
    inline def apply(): StrictTableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTableProps]
    }
    
    extension [Self <: StrictTableProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAttached(value: Boolean | "top" | "bottom"): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      inline def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      inline def setBasic(value: Boolean | "very"): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
      
      inline def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
      
      inline def setCelled(value: Boolean | "internally"): Self = StObject.set(x, "celled", value.asInstanceOf[js.Any])
      
      inline def setCelledUndefined: Self = StObject.set(x, "celled", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCollapsing(value: Boolean): Self = StObject.set(x, "collapsing", value.asInstanceOf[js.Any])
      
      inline def setCollapsingUndefined: Self = StObject.set(x, "collapsing", js.undefined)
      
      inline def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColumns(value: SemanticWIDTHS): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setCompact(value: Boolean | "very"): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setDefinition(value: Boolean): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setFooterRow(value: SemanticShorthandItem[TableRowProps]): Self = StObject.set(x, "footerRow", value.asInstanceOf[js.Any])
      
      inline def setFooterRowFunction3(
        value: (/* component */ ElementType[TableRowProps], TableRowProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "footerRow", js.Any.fromFunction3(value))
      
      inline def setFooterRowUndefined: Self = StObject.set(x, "footerRow", js.undefined)
      
      inline def setHeaderRow(value: SemanticShorthandItem[TableRowProps]): Self = StObject.set(x, "headerRow", value.asInstanceOf[js.Any])
      
      inline def setHeaderRowFunction3(
        value: (/* component */ ElementType[TableRowProps], TableRowProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "headerRow", js.Any.fromFunction3(value))
      
      inline def setHeaderRowUndefined: Self = StObject.set(x, "headerRow", js.undefined)
      
      inline def setHeaderRows(value: SemanticShorthandCollection[TableRowProps]): Self = StObject.set(x, "headerRows", value.asInstanceOf[js.Any])
      
      inline def setHeaderRowsUndefined: Self = StObject.set(x, "headerRows", js.undefined)
      
      inline def setHeaderRowsVarargs(value: SemanticShorthandItem[TableRowProps]*): Self = StObject.set(x, "headerRows", js.Array(value*))
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setPadded(value: Boolean | "very"): Self = StObject.set(x, "padded", value.asInstanceOf[js.Any])
      
      inline def setPaddedUndefined: Self = StObject.set(x, "padded", js.undefined)
      
      inline def setRenderBodyRow(value: (/* data */ Any, /* index */ Double) => Any): Self = StObject.set(x, "renderBodyRow", js.Any.fromFunction2(value))
      
      inline def setRenderBodyRowUndefined: Self = StObject.set(x, "renderBodyRow", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setSingleLine(value: Boolean): Self = StObject.set(x, "singleLine", value.asInstanceOf[js.Any])
      
      inline def setSingleLineUndefined: Self = StObject.set(x, "singleLine", js.undefined)
      
      inline def setSize(value: "small" | "large"): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      inline def setStackable(value: Boolean): Self = StObject.set(x, "stackable", value.asInstanceOf[js.Any])
      
      inline def setStackableUndefined: Self = StObject.set(x, "stackable", js.undefined)
      
      inline def setStriped(value: Boolean): Self = StObject.set(x, "striped", value.asInstanceOf[js.Any])
      
      inline def setStripedUndefined: Self = StObject.set(x, "striped", js.undefined)
      
      inline def setStructured(value: Boolean): Self = StObject.set(x, "structured", value.asInstanceOf[js.Any])
      
      inline def setStructuredUndefined: Self = StObject.set(x, "structured", js.undefined)
      
      inline def setTableData(value: js.Array[Any]): Self = StObject.set(x, "tableData", value.asInstanceOf[js.Any])
      
      inline def setTableDataUndefined: Self = StObject.set(x, "tableData", js.undefined)
      
      inline def setTableDataVarargs(value: Any*): Self = StObject.set(x, "tableData", js.Array(value*))
      
      inline def setTextAlign(value: "center" | "left" | "right"): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setUnstackable(value: Boolean): Self = StObject.set(x, "unstackable", value.asInstanceOf[js.Any])
      
      inline def setUnstackableUndefined: Self = StObject.set(x, "unstackable", js.undefined)
      
      inline def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    }
  }
  
  @js.native
  trait TableComponent
    extends StObject
       with FunctionComponent[TableProps] {
    
    var Body: FC[TableBodyProps] = js.native
    
    var Cell: FC[TableCellProps] = js.native
    
    var Footer: FC[TableFooterProps] = js.native
    
    var Header: FC[TableHeaderProps] = js.native
    
    var HeaderCell: FC[TableHeaderCellProps] = js.native
    
    var Row: FC[TableRowProps] = js.native
  }
  
  trait TableProps
    extends StObject
       with StrictTableProps
       with /* key */ StringDictionary[Any]
  object TableProps {
    
    inline def apply(): TableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableProps]
    }
  }
  
  type _To = TableComponent
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsCollectionsTableTableMod.foo` */
  override def _to: TableComponent = default
}
