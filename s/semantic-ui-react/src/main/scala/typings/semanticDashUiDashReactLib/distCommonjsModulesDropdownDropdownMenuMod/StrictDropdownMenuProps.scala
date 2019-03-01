package typings
package semanticDashUiDashReactLib.distCommonjsModulesDropdownDropdownMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictDropdownMenuProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** A dropdown menu can open to the left or to the right. */
  var direction: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right
  ] = js.undefined
  /** Whether or not the dropdown menu is displayed. */
  var open: js.UndefOr[scala.Boolean] = js.undefined
  /** A dropdown menu can scroll. */
  var scrolling: js.UndefOr[scala.Boolean] = js.undefined
}

object StrictDropdownMenuProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    direction: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    scrolling: js.UndefOr[scala.Boolean] = js.undefined
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

