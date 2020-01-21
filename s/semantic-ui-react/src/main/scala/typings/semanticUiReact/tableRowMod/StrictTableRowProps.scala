package typings.semanticUiReact.tableRowMod

import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typings.semanticUiReact.semanticUiReactStrings.center
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.right
import typings.semanticUiReact.tableCellMod.TableCellProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictTableRowProps extends js.Object {
  /** A row can be active or selected by a user. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** An element type to render as (string or function). */
  var cellAs: js.UndefOr[js.Any] = js.undefined
  /** Shorthand array of props for TableCell. */
  var cells: js.UndefOr[SemanticShorthandCollection[TableCellProps]] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** A row can be disabled. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** A row may call attention to an error or a negative value. */
  var error: js.UndefOr[Boolean] = js.undefined
  /** A row may let a user know whether a value is bad. */
  var negative: js.UndefOr[Boolean] = js.undefined
  /** A row may let a user know whether a value is good. */
  var positive: js.UndefOr[Boolean] = js.undefined
  /** A table row can adjust its text alignment. */
  var textAlign: js.UndefOr[center | left | right] = js.undefined
  /** A table row can adjust its vertical alignment. */
  var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.undefined
  /** A row may warn a user. */
  var warning: js.UndefOr[Boolean] = js.undefined
}

object StrictTableRowProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    cellAs: js.Any = null,
    cells: SemanticShorthandCollection[TableCellProps] = null,
    children: ReactNode = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    negative: js.UndefOr[Boolean] = js.undefined,
    positive: js.UndefOr[Boolean] = js.undefined,
    textAlign: center | left | right = null,
    verticalAlign: SemanticVERTICALALIGNMENTS = null,
    warning: js.UndefOr[Boolean] = js.undefined
  ): StrictTableRowProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (cellAs != null) __obj.updateDynamic("cellAs")(cellAs.asInstanceOf[js.Any])
    if (cells != null) __obj.updateDynamic("cells")(cells.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(negative)) __obj.updateDynamic("negative")(negative.asInstanceOf[js.Any])
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(warning)) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictTableRowProps]
  }
}

