package typings.semanticUiReact.tableTableMod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.ReactType
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
import typings.semanticUiReact.tableRowMod.TableRowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictTableProps extends js.Object {
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
  implicit class StrictTablePropsOps[Self <: StrictTableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setAttached(value: Boolean | top | bottom): Self = this.set("attached", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttached: Self = this.set("attached", js.undefined)
    @scala.inline
    def setBasic(value: Boolean | very): Self = this.set("basic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasic: Self = this.set("basic", js.undefined)
    @scala.inline
    def setCelled(value: Boolean | internally): Self = this.set("celled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCelled: Self = this.set("celled", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCollapsing(value: Boolean): Self = this.set("collapsing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsing: Self = this.set("collapsing", js.undefined)
    @scala.inline
    def setColor(value: SemanticCOLORS): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setColumns(value: SemanticWIDTHS): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setCompact(value: Boolean | very): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    @scala.inline
    def setDefinition(value: Boolean): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinition: Self = this.set("definition", js.undefined)
    @scala.inline
    def setFixed(value: Boolean): Self = this.set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    @scala.inline
    def setFooterRowFunction3(
      value: (/* component */ ReactType[TableRowProps], TableRowProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("footerRow", js.Any.fromFunction3(value))
    @scala.inline
    def setFooterRow(value: SemanticShorthandItem[TableRowProps]): Self = this.set("footerRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterRow: Self = this.set("footerRow", js.undefined)
    @scala.inline
    def setHeaderRowFunction3(
      value: (/* component */ ReactType[TableRowProps], TableRowProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("headerRow", js.Any.fromFunction3(value))
    @scala.inline
    def setHeaderRow(value: SemanticShorthandItem[TableRowProps]): Self = this.set("headerRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderRow: Self = this.set("headerRow", js.undefined)
    @scala.inline
    def setHeaderRowsVarargs(value: SemanticShorthandItem[TableRowProps]*): Self = this.set("headerRows", js.Array(value :_*))
    @scala.inline
    def setHeaderRows(value: SemanticShorthandCollection[TableRowProps]): Self = this.set("headerRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderRows: Self = this.set("headerRows", js.undefined)
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    @scala.inline
    def setPadded(value: Boolean | very): Self = this.set("padded", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadded: Self = this.set("padded", js.undefined)
    @scala.inline
    def setRenderBodyRow(value: (/* data */ js.Any, /* index */ Double) => _): Self = this.set("renderBodyRow", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRenderBodyRow: Self = this.set("renderBodyRow", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setSingleLine(value: Boolean): Self = this.set("singleLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleLine: Self = this.set("singleLine", js.undefined)
    @scala.inline
    def setSize(value: small | large): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSortable(value: Boolean): Self = this.set("sortable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
    @scala.inline
    def setStackable(value: Boolean): Self = this.set("stackable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackable: Self = this.set("stackable", js.undefined)
    @scala.inline
    def setStriped(value: Boolean): Self = this.set("striped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStriped: Self = this.set("striped", js.undefined)
    @scala.inline
    def setStructured(value: Boolean): Self = this.set("structured", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStructured: Self = this.set("structured", js.undefined)
    @scala.inline
    def setTableDataVarargs(value: js.Any*): Self = this.set("tableData", js.Array(value :_*))
    @scala.inline
    def setTableData(value: js.Array[_]): Self = this.set("tableData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableData: Self = this.set("tableData", js.undefined)
    @scala.inline
    def setTextAlign(value: center | left | right): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    @scala.inline
    def setUnstackable(value: Boolean): Self = this.set("unstackable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnstackable: Self = this.set("unstackable", js.undefined)
    @scala.inline
    def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
  }
  
}

