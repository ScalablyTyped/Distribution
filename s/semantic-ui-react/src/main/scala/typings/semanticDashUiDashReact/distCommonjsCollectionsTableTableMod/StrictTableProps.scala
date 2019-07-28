package typings.semanticDashUiDashReact.distCommonjsCollectionsTableTableMod

import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsCollectionsTableTableRowMod.TableRowProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticCOLORS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandCollection
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticWIDTHS
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.bottom
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.center
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.internally
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.large
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.left
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.right
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.small
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.top
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.very
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictTableProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Attach table to other content */
  var attached: js.UndefOr[Boolean | top | bottom] = js.undefined
  /** A table can reduce its complexity to increase readability. */
  var basic: js.UndefOr[Boolean | very] = js.undefined
  /** A table may be divided each row into separate cells. */
  var celled: js.UndefOr[Boolean | internally] = js.undefined
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
  var compact: js.UndefOr[Boolean | very] = js.undefined
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
  var padded: js.UndefOr[Boolean | very] = js.undefined
  /**
    * Mapped over `tableData` and should return shorthand for each Table.Row to be placed within Table.Body.
    *
    * @param {*} data - An element in the `tableData` array.
    * @param {number} index - The index of the current element in `tableData`.
    * @returns {*} Shorthand for a Table.Row.
    */
  var renderBodyRow: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, _]] = js.undefined
  /** A table can have its rows appear selectable. */
  var selectable: js.UndefOr[Boolean] = js.undefined
  /** A table can specify that its cell contents should remain on a single line and not wrap. */
  var singleLine: js.UndefOr[Boolean] = js.undefined
  /** A table can also be small or large. */
  var size: js.UndefOr[small | large] = js.undefined
  /** A table may allow a user to sort contents by clicking on a table header. */
  var sortable: js.UndefOr[Boolean] = js.undefined
  /** A table can specify how it stacks table content responsively. */
  var stackable: js.UndefOr[Boolean] = js.undefined
  /** A table can stripe alternate rows of content with a darker color to increase contrast. */
  var striped: js.UndefOr[Boolean] = js.undefined
  /** A table can be formatted to display complex structured data. */
  var structured: js.UndefOr[Boolean] = js.undefined
  /** Data to be passed to the renderBodyRow function. */
  var tableData: js.UndefOr[js.Array[_]] = js.undefined
  /** A table can adjust its text alignment. */
  var textAlign: js.UndefOr[center | left | right] = js.undefined
  /** A table can specify how it stacks table content responsively. */
  var unstackable: js.UndefOr[Boolean] = js.undefined
  /** A table can adjust its text alignment. */
  var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.undefined
}

object StrictTableProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    attached: Boolean | top | bottom = null,
    basic: Boolean | very = null,
    celled: Boolean | internally = null,
    children: ReactNode = null,
    className: String = null,
    collapsing: js.UndefOr[Boolean] = js.undefined,
    color: SemanticCOLORS = null,
    columns: SemanticWIDTHS = null,
    compact: Boolean | very = null,
    definition: js.UndefOr[Boolean] = js.undefined,
    fixed: js.UndefOr[Boolean] = js.undefined,
    footerRow: SemanticShorthandItem[TableRowProps] = null,
    headerRow: SemanticShorthandItem[TableRowProps] = null,
    headerRows: SemanticShorthandCollection[TableRowProps] = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    padded: Boolean | very = null,
    renderBodyRow: (/* data */ js.Any, /* index */ Double) => _ = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    singleLine: js.UndefOr[Boolean] = js.undefined,
    size: small | large = null,
    sortable: js.UndefOr[Boolean] = js.undefined,
    stackable: js.UndefOr[Boolean] = js.undefined,
    striped: js.UndefOr[Boolean] = js.undefined,
    structured: js.UndefOr[Boolean] = js.undefined,
    tableData: js.Array[_] = null,
    textAlign: center | left | right = null,
    unstackable: js.UndefOr[Boolean] = js.undefined,
    verticalAlign: SemanticVERTICALALIGNMENTS = null
  ): StrictTableProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (basic != null) __obj.updateDynamic("basic")(basic.asInstanceOf[js.Any])
    if (celled != null) __obj.updateDynamic("celled")(celled.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(collapsing)) __obj.updateDynamic("collapsing")(collapsing)
    if (color != null) __obj.updateDynamic("color")(color)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (compact != null) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (!js.isUndefined(definition)) __obj.updateDynamic("definition")(definition)
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed)
    if (footerRow != null) __obj.updateDynamic("footerRow")(footerRow.asInstanceOf[js.Any])
    if (headerRow != null) __obj.updateDynamic("headerRow")(headerRow.asInstanceOf[js.Any])
    if (headerRows != null) __obj.updateDynamic("headerRows")(headerRows)
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (padded != null) __obj.updateDynamic("padded")(padded.asInstanceOf[js.Any])
    if (renderBodyRow != null) __obj.updateDynamic("renderBodyRow")(js.Any.fromFunction2(renderBodyRow))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (!js.isUndefined(singleLine)) __obj.updateDynamic("singleLine")(singleLine)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable)
    if (!js.isUndefined(stackable)) __obj.updateDynamic("stackable")(stackable)
    if (!js.isUndefined(striped)) __obj.updateDynamic("striped")(striped)
    if (!js.isUndefined(structured)) __obj.updateDynamic("structured")(structured)
    if (tableData != null) __obj.updateDynamic("tableData")(tableData)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(unstackable)) __obj.updateDynamic("unstackable")(unstackable)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    __obj.asInstanceOf[StrictTableProps]
  }
}

