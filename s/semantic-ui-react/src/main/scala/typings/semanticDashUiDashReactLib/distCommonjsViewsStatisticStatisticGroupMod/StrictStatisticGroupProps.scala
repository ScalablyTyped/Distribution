package typings
package semanticDashUiDashReactLib.distCommonjsViewsStatisticStatisticGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictStatisticGroupProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** A statistic group can be formatted to be different colors. */
  var color: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticCOLORS] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** A statistic group can present its measurement horizontally. */
  var horizontal: js.UndefOr[scala.Boolean] = js.undefined
  /** A statistic group can present its measurement horizontally. */
  var inverted: js.UndefOr[scala.Boolean] = js.undefined
  /** Array of props for Statistic. */
  var items: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandCollection[semanticDashUiDashReactLib.distCommonjsViewsStatisticStatisticMod.StatisticProps]
  ] = js.undefined
  /** A statistic group can vary in size. */
  var size: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsViewsStatisticStatisticMod.StatisticSizeProp
  ] = js.undefined
  /** A statistic group can have its items divided evenly. */
  var widths: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS] = js.undefined
}

object StrictStatisticGroupProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    color: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticCOLORS = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    horizontal: js.UndefOr[scala.Boolean] = js.undefined,
    inverted: js.UndefOr[scala.Boolean] = js.undefined,
    items: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandCollection[semanticDashUiDashReactLib.distCommonjsViewsStatisticStatisticMod.StatisticProps] = null,
    size: semanticDashUiDashReactLib.distCommonjsViewsStatisticStatisticMod.StatisticSizeProp = null,
    widths: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS = null
  ): StrictStatisticGroupProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (items != null) __obj.updateDynamic("items")(items)
    if (size != null) __obj.updateDynamic("size")(size)
    if (widths != null) __obj.updateDynamic("widths")(widths)
    __obj.asInstanceOf[StrictStatisticGroupProps]
  }
}

