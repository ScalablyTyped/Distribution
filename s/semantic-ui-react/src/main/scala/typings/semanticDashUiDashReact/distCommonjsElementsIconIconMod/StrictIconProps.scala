package typings.semanticDashUiDashReact.distCommonjsElementsIconIconMod

import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticCOLORS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticICONS
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.clockwise
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.counterclockwise
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.horizontally
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.vertically
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictIconProps extends js.Object {
  /** Icon can have an aria hidden. */
  var `aria-hidden`: js.UndefOr[String] = js.undefined
  /** Icon can have an aria label. */
  var `aria-label`: js.UndefOr[String] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Formatted to appear bordered */
  var bordered: js.UndefOr[Boolean] = js.undefined
  /** Icon can formatted to appear circular. */
  var circular: js.UndefOr[Boolean] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Color of the icon. */
  var color: js.UndefOr[SemanticCOLORS] = js.undefined
  /** Icons can display a smaller corner icon. */
  var corner: js.UndefOr[Boolean | IconCorner] = js.undefined
  /** Show that the icon is inactive. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** Fitted, without space to left or right of Icon. */
  var fitted: js.UndefOr[Boolean] = js.undefined
  /** Icon can be flipped. */
  var flipped: js.UndefOr[horizontally | vertically] = js.undefined
  /** Formatted to have its colors inverted for contrast. */
  var inverted: js.UndefOr[Boolean] = js.undefined
  /** Icon can be formatted as a link. */
  var link: js.UndefOr[Boolean] = js.undefined
  /** Icon can be used as a simple loader. */
  var loading: js.UndefOr[Boolean] = js.undefined
  /** Name of the icon. */
  var name: js.UndefOr[SemanticICONS] = js.undefined
  /** Icon can rotated. */
  var rotated: js.UndefOr[clockwise | counterclockwise] = js.undefined
  /** Size of the icon. */
  var size: js.UndefOr[IconSizeProp] = js.undefined
}

object StrictIconProps {
  @scala.inline
  def apply(
    `aria-hidden`: String = null,
    `aria-label`: String = null,
    as: js.Any = null,
    bordered: js.UndefOr[Boolean] = js.undefined,
    circular: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    color: SemanticCOLORS = null,
    corner: Boolean | IconCorner = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fitted: js.UndefOr[Boolean] = js.undefined,
    flipped: horizontally | vertically = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    link: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    name: SemanticICONS = null,
    rotated: clockwise | counterclockwise = null,
    size: IconSizeProp = null
  ): StrictIconProps = {
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
    __obj.asInstanceOf[StrictIconProps]
  }
}

