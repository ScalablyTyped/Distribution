package typings.semanticDashUiDashReact.distCommonjsCollectionsTableTableCellMod

import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsElementsIconIconMod.IconProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticWIDTHS
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.center
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.left
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictTableCellProps extends js.Object {
  /** A cell can be active or selected by a user. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** A table can be collapsing, taking up only as much space as its rows. */
  var collapsing: js.UndefOr[Boolean] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** A cell can be disabled. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** A cell may call attention to an error or a negative value. */
  var error: js.UndefOr[Boolean] = js.undefined
  /** Add an Icon by name, props object, or pass an <Icon /> */
  var icon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.undefined
  /** A cell may let a user know whether a value is bad. */
  var negative: js.UndefOr[Boolean] = js.undefined
  /** A cell may let a user know whether a value is good. */
  var positive: js.UndefOr[Boolean] = js.undefined
  /** A cell can be selectable. */
  var selectable: js.UndefOr[Boolean] = js.undefined
  /** A cell can specify that its contents should remain on a single line and not wrap. */
  var singleLine: js.UndefOr[Boolean] = js.undefined
  /** A table cell can adjust its text alignment. */
  var textAlign: js.UndefOr[center | left | right] = js.undefined
  /** A table cell can adjust its text alignment. */
  var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.undefined
  /** A cell may warn a user. */
  var warning: js.UndefOr[Boolean] = js.undefined
  /** A table can specify the width of individual columns independently. */
  var width: js.UndefOr[SemanticWIDTHS] = js.undefined
}

object StrictTableCellProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    collapsing: js.UndefOr[Boolean] = js.undefined,
    content: SemanticShorthandContent = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    icon: SemanticShorthandItem[IconProps] = null,
    negative: js.UndefOr[Boolean] = js.undefined,
    positive: js.UndefOr[Boolean] = js.undefined,
    selectable: js.UndefOr[Boolean] = js.undefined,
    singleLine: js.UndefOr[Boolean] = js.undefined,
    textAlign: center | left | right = null,
    verticalAlign: SemanticVERTICALALIGNMENTS = null,
    warning: js.UndefOr[Boolean] = js.undefined,
    width: SemanticWIDTHS = null
  ): StrictTableCellProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(collapsing)) __obj.updateDynamic("collapsing")(collapsing)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(negative)) __obj.updateDynamic("negative")(negative)
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (!js.isUndefined(singleLine)) __obj.updateDynamic("singleLine")(singleLine)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (!js.isUndefined(warning)) __obj.updateDynamic("warning")(warning)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[StrictTableCellProps]
  }
}

