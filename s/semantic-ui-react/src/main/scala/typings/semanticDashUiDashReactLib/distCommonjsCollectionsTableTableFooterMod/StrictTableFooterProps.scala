package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsTableTableFooterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictTableFooterProps
  extends semanticDashUiDashReactLib.distCommonjsCollectionsTableTableHeaderMod.StrictTableHeaderProps

object StrictTableFooterProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    fullWidth: js.UndefOr[scala.Boolean] = js.undefined
  ): StrictTableFooterProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    __obj.asInstanceOf[StrictTableFooterProps]
  }
}

