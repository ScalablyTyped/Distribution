package typings
package semanticDashUiDashReactLib.distCommonjsElementsIconIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps
  extends StrictIconProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object IconProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    `aria-hidden`: java.lang.String = null,
    `aria-label`: java.lang.String = null,
    as: js.Any = null,
    bordered: js.UndefOr[scala.Boolean] = js.undefined,
    circular: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    color: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticCOLORS = null,
    corner: scala.Boolean | IconCorner = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    fitted: js.UndefOr[scala.Boolean] = js.undefined,
    flipped: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.horizontally | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.vertically = null,
    inverted: js.UndefOr[scala.Boolean] = js.undefined,
    link: js.UndefOr[scala.Boolean] = js.undefined,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    name: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticICONS = null,
    rotated: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.clockwise | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.counterclockwise = null,
    size: IconSizeProp = null
  ): IconProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`aria-hidden` != null) __obj.updateDynamic("aria-hidden")(`aria-hidden`)
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered)
    if (!js.isUndefined(circular)) __obj.updateDynamic("circular")(circular)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (corner != null) __obj.updateDynamic("corner")(corner.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(fitted)) __obj.updateDynamic("fitted")(fitted)
    if (flipped != null) __obj.updateDynamic("flipped")(flipped.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (!js.isUndefined(link)) __obj.updateDynamic("link")(link)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (name != null) __obj.updateDynamic("name")(name)
    if (rotated != null) __obj.updateDynamic("rotated")(rotated.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[IconProps]
  }
}

