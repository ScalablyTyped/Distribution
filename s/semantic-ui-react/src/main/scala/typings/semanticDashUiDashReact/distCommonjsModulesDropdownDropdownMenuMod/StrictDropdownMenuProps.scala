package typings.semanticDashUiDashReact.distCommonjsModulesDropdownDropdownMenuMod

import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.left
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictDropdownMenuProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** A dropdown menu can open to the left or to the right. */
  var direction: js.UndefOr[left | right] = js.undefined
  /** Whether or not the dropdown menu is displayed. */
  var open: js.UndefOr[Boolean] = js.undefined
  /** A dropdown menu can scroll. */
  var scrolling: js.UndefOr[Boolean] = js.undefined
}

object StrictDropdownMenuProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    direction: left | right = null,
    open: js.UndefOr[Boolean] = js.undefined,
    scrolling: js.UndefOr[Boolean] = js.undefined
  ): StrictDropdownMenuProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (!js.isUndefined(scrolling)) __obj.updateDynamic("scrolling")(scrolling)
    __obj.asInstanceOf[StrictDropdownMenuProps]
  }
}

