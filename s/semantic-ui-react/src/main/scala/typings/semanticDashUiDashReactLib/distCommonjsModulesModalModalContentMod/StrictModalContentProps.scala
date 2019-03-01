package typings
package semanticDashUiDashReactLib.distCommonjsModulesModalModalContentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictModalContentProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** A modal can contain image content. */
  var image: js.UndefOr[scala.Boolean] = js.undefined
  /** A modal can use the entire size of the screen. */
  var scrolling: js.UndefOr[scala.Boolean] = js.undefined
}

object StrictModalContentProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    image: js.UndefOr[scala.Boolean] = js.undefined,
    scrolling: js.UndefOr[scala.Boolean] = js.undefined
  ): StrictModalContentProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(image)) __obj.updateDynamic("image")(image)
    if (!js.isUndefined(scrolling)) __obj.updateDynamic("scrolling")(scrolling)
    __obj.asInstanceOf[StrictModalContentProps]
  }
}

