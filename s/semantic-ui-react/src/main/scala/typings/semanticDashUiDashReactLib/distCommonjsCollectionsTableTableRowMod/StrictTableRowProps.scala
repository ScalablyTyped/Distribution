package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsTableTableRowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictTableRowProps extends js.Object {
  /** A row can be active or selected by a user. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** An element type to render as (string or function). */
  var cellAs: js.UndefOr[js.Any] = js.undefined
  /** Shorthand array of props for TableCell. */
  var cells: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandCollection[
      semanticDashUiDashReactLib.distCommonjsCollectionsTableTableCellMod.TableCellProps
    ]
  ] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** A row can be disabled. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** A row may call attention to an error or a negative value. */
  var error: js.UndefOr[scala.Boolean] = js.undefined
  /** A row may let a user know whether a value is bad. */
  var negative: js.UndefOr[scala.Boolean] = js.undefined
  /** A row may let a user know whether a value is good. */
  var positive: js.UndefOr[scala.Boolean] = js.undefined
  /** A table row can adjust its text alignment. */
  var textAlign: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.center | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right
  ] = js.undefined
  /** A table row can adjust its vertical alignment. */
  var verticalAlign: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS] = js.undefined
  /** A row may warn a user. */
  var warning: js.UndefOr[scala.Boolean] = js.undefined
}

object StrictTableRowProps {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    as: js.Any = null,
    cellAs: js.Any = null,
    cells: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandCollection[
      semanticDashUiDashReactLib.distCommonjsCollectionsTableTableCellMod.TableCellProps
    ] = null,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    negative: js.UndefOr[scala.Boolean] = js.undefined,
    positive: js.UndefOr[scala.Boolean] = js.undefined,
    textAlign: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.center | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right = null,
    verticalAlign: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS = null,
    warning: js.UndefOr[scala.Boolean] = js.undefined
  ): StrictTableRowProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (as != null) __obj.updateDynamic("as")(as)
    if (cellAs != null) __obj.updateDynamic("cellAs")(cellAs)
    if (cells != null) __obj.updateDynamic("cells")(cells)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(negative)) __obj.updateDynamic("negative")(negative)
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (!js.isUndefined(warning)) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[StrictTableRowProps]
  }
}

