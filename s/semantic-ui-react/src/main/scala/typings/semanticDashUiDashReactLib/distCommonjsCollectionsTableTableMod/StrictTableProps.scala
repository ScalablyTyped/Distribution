package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsTableTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictTableProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Attach table to other content */
  var attached: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.top | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.bottom
  ] = js.undefined
  /** A table can reduce its complexity to increase readability. */
  var basic: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.very
  ] = js.undefined
  /** A table may be divided each row into separate cells. */
  var celled: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.internally
  ] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** A table can be collapsing, taking up only as much space as its rows. */
  var collapsing: js.UndefOr[scala.Boolean] = js.undefined
  /** A table can be given a color to distinguish it from other tables. */
  var color: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticCOLORS] = js.undefined
  /** A table can specify its column count to divide its content evenly. */
  var columns: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS] = js.undefined
  /** A table may sometimes need to be more compact to make more rows visible at a time. */
  var compact: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.very
  ] = js.undefined
  /** A table may be formatted to emphasize a first column that defines a rows content. */
  var definition: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A table can use fixed a special faster form of table rendering that does not resize table cells based on content.
    */
  var fixed: js.UndefOr[scala.Boolean] = js.undefined
  /** Shorthand for a TableRow to be placed within Table.Footer. */
  var footerRow: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsCollectionsTableTableRowMod.TableRowProps]
  ] = js.undefined
  /** Shorthand for a TableRow to be placed within Table.Header. */
  var headerRow: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsCollectionsTableTableRowMod.TableRowProps]
  ] = js.undefined
  /** A table's colors can be inverted. */
  var inverted: js.UndefOr[scala.Boolean] = js.undefined
  /** A table may sometimes need to be more padded for legibility. */
  var padded: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.very
  ] = js.undefined
  /**
    * Mapped over `tableData` and should return shorthand for each Table.Row to be placed within Table.Body.
    *
    * @param {*} data - An element in the `tableData` array.
    * @param {number} index - The index of the current element in `tableData`.
    * @returns {*} Shorthand for a Table.Row.
    */
  var renderBodyRow: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ scala.Double, _]] = js.undefined
  /** A table can have its rows appear selectable. */
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  /** A table can specify that its cell contents should remain on a single line and not wrap. */
  var singleLine: js.UndefOr[scala.Boolean] = js.undefined
  /** A table can also be small or large. */
  var size: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.small | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.large
  ] = js.undefined
  /** A table may allow a user to sort contents by clicking on a table header. */
  var sortable: js.UndefOr[scala.Boolean] = js.undefined
  /** A table can specify how it stacks table content responsively. */
  var stackable: js.UndefOr[scala.Boolean] = js.undefined
  /** A table can stripe alternate rows of content with a darker color to increase contrast. */
  var striped: js.UndefOr[scala.Boolean] = js.undefined
  /** A table can be formatted to display complex structured data. */
  var structured: js.UndefOr[scala.Boolean] = js.undefined
  /** Data to be passed to the renderBodyRow function. */
  var tableData: js.UndefOr[js.Array[_]] = js.undefined
  /** A table can adjust its text alignment. */
  var textAlign: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.center | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right
  ] = js.undefined
  /** A table can specify how it stacks table content responsively. */
  var unstackable: js.UndefOr[scala.Boolean] = js.undefined
  /** A table can adjust its text alignment. */
  var verticalAlign: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS] = js.undefined
}

object StrictTableProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    attached: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.top | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.bottom = null,
    basic: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.very = null,
    celled: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.internally = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    collapsing: js.UndefOr[scala.Boolean] = js.undefined,
    color: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticCOLORS = null,
    columns: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS = null,
    compact: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.very = null,
    definition: js.UndefOr[scala.Boolean] = js.undefined,
    fixed: js.UndefOr[scala.Boolean] = js.undefined,
    footerRow: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsCollectionsTableTableRowMod.TableRowProps] = null,
    headerRow: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsCollectionsTableTableRowMod.TableRowProps] = null,
    inverted: js.UndefOr[scala.Boolean] = js.undefined,
    padded: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.very = null,
    renderBodyRow: js.Function2[/* data */ js.Any, /* index */ scala.Double, _] = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    singleLine: js.UndefOr[scala.Boolean] = js.undefined,
    size: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.small | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.large = null,
    sortable: js.UndefOr[scala.Boolean] = js.undefined,
    stackable: js.UndefOr[scala.Boolean] = js.undefined,
    striped: js.UndefOr[scala.Boolean] = js.undefined,
    structured: js.UndefOr[scala.Boolean] = js.undefined,
    tableData: js.Array[_] = null,
    textAlign: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.center | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right = null,
    unstackable: js.UndefOr[scala.Boolean] = js.undefined,
    verticalAlign: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS = null
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
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (padded != null) __obj.updateDynamic("padded")(padded.asInstanceOf[js.Any])
    if (renderBodyRow != null) __obj.updateDynamic("renderBodyRow")(renderBodyRow)
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

