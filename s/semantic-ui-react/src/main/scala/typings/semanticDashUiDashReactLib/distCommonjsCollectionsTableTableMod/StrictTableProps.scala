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

