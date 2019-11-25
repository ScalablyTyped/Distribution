package typings.semanticDashUiDashReact.distCommonjsElementsDividerDividerMod

import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictDividerProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Divider can clear the content above it. */
  var clearing: js.UndefOr[Boolean] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** Divider can be fitted without any space above or below it. */
  var fitted: js.UndefOr[Boolean] = js.undefined
  /** Divider can divide content without creating a dividing line. */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /** Divider can segment content horizontally. */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  /** Divider can have its colours inverted. */
  var inverted: js.UndefOr[Boolean] = js.undefined
  /** Divider can provide greater margins to divide sections of content. */
  var section: js.UndefOr[Boolean] = js.undefined
  /** Divider can segment content vertically. */
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object StrictDividerProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    clearing: js.UndefOr[Boolean] = js.undefined,
    content: SemanticShorthandContent = null,
    fitted: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    section: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): StrictDividerProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clearing)) __obj.updateDynamic("clearing")(clearing.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(fitted)) __obj.updateDynamic("fitted")(fitted.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (!js.isUndefined(section)) __obj.updateDynamic("section")(section.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictDividerProps]
  }
}

