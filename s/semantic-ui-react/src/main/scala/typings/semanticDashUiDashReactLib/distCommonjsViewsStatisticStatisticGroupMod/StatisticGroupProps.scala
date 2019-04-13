package typings
package semanticDashUiDashReactLib.distCommonjsViewsStatisticStatisticGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatisticGroupProps
  extends StrictStatisticGroupProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object StatisticGroupProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
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
  ): StatisticGroupProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
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
    __obj.asInstanceOf[StatisticGroupProps]
  }
}

