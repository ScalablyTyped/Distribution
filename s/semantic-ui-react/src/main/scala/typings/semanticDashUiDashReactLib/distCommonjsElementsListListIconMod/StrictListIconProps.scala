package typings
package semanticDashUiDashReactLib.distCommonjsElementsListListIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictListIconProps
  extends semanticDashUiDashReactLib.distCommonjsElementsIconIconMod.StrictIconProps {
  /** An element inside a list can be vertically aligned. */
  var verticalAlign: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS] = js.undefined
}

object StrictListIconProps {
  @scala.inline
  def apply(
    `aria-hidden`: java.lang.String = null,
    `aria-label`: java.lang.String = null,
    as: js.Any = null,
    bordered: js.UndefOr[scala.Boolean] = js.undefined,
    circular: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    color: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticCOLORS = null,
    corner: scala.Boolean | semanticDashUiDashReactLib.distCommonjsElementsIconIconMod.IconCorner = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    fitted: js.UndefOr[scala.Boolean] = js.undefined,
    flipped: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.horizontally | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.vertically = null,
    inverted: js.UndefOr[scala.Boolean] = js.undefined,
    link: js.UndefOr[scala.Boolean] = js.undefined,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    name: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticICONS = null,
    rotated: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.clockwise | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.counterclockwise = null,
    size: semanticDashUiDashReactLib.distCommonjsElementsIconIconMod.IconSizeProp = null,
    verticalAlign: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS = null
  ): StrictListIconProps = {
    val __obj = js.Dynamic.literal()
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
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    __obj.asInstanceOf[StrictListIconProps]
  }
}

