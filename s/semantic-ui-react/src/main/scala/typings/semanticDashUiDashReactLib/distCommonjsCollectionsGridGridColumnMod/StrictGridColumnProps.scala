package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsGridGridColumnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictGridColumnProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** A grid column can be colored. */
  var color: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticCOLORS] = js.undefined
  /** A column can specify a width for a computer. */
  var computer: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS] = js.undefined
  /** A column can sit flush against the left or right edge of a row. */
  var floated: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticFLOATS] = js.undefined
  /** A column can specify a width for a large screen device. */
  var largeScreen: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS] = js.undefined
  /** A column can specify a width for a mobile device. */
  var mobile: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS] = js.undefined
  /** A column can appear only for a specific device, or screen sizes. */
  var only: js.UndefOr[GridOnlyProp] = js.undefined
  /** An can stretch its contents to take up the entire grid or row height. */
  var stretched: js.UndefOr[scala.Boolean] = js.undefined
  /** A column can specify a width for a tablet device. */
  var tablet: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS] = js.undefined
  /** A row can specify its text alignment. */
  var textAlign: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticTEXTALIGNMENTS] = js.undefined
  /** A column can specify its vertical alignment to have all its columns vertically centered. */
  var verticalAlign: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS] = js.undefined
  /** A column can specify a width for a wide screen device. */
  var widescreen: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS] = js.undefined
  /** Represents width of column. */
  var width: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS] = js.undefined
}

object StrictGridColumnProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    color: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticCOLORS = null,
    computer: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS = null,
    floated: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticFLOATS = null,
    largeScreen: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS = null,
    mobile: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS = null,
    only: GridOnlyProp = null,
    stretched: js.UndefOr[scala.Boolean] = js.undefined,
    tablet: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS = null,
    textAlign: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticTEXTALIGNMENTS = null,
    verticalAlign: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS = null,
    widescreen: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS = null,
    width: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS = null
  ): StrictGridColumnProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (computer != null) __obj.updateDynamic("computer")(computer)
    if (floated != null) __obj.updateDynamic("floated")(floated)
    if (largeScreen != null) __obj.updateDynamic("largeScreen")(largeScreen)
    if (mobile != null) __obj.updateDynamic("mobile")(mobile)
    if (only != null) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (!js.isUndefined(stretched)) __obj.updateDynamic("stretched")(stretched)
    if (tablet != null) __obj.updateDynamic("tablet")(tablet)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (widescreen != null) __obj.updateDynamic("widescreen")(widescreen)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[StrictGridColumnProps]
  }
}

