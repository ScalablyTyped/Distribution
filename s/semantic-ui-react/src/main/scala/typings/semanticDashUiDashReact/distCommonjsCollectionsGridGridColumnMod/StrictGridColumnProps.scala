package typings.semanticDashUiDashReact.distCommonjsCollectionsGridGridColumnMod

import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticCOLORS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticFLOATS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticTEXTALIGNMENTS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticWIDTHS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictGridColumnProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** A grid column can be colored. */
  var color: js.UndefOr[SemanticCOLORS] = js.undefined
  /** A column can specify a width for a computer. */
  var computer: js.UndefOr[SemanticWIDTHS] = js.undefined
  /** A column can sit flush against the left or right edge of a row. */
  var floated: js.UndefOr[SemanticFLOATS] = js.undefined
  /** A column can specify a width for a large screen device. */
  var largeScreen: js.UndefOr[SemanticWIDTHS] = js.undefined
  /** A column can specify a width for a mobile device. */
  var mobile: js.UndefOr[SemanticWIDTHS] = js.undefined
  /** A column can appear only for a specific device, or screen sizes. */
  var only: js.UndefOr[GridOnlyProp] = js.undefined
  /** An can stretch its contents to take up the entire grid or row height. */
  var stretched: js.UndefOr[Boolean] = js.undefined
  /** A column can specify a width for a tablet device. */
  var tablet: js.UndefOr[SemanticWIDTHS] = js.undefined
  /** A row can specify its text alignment. */
  var textAlign: js.UndefOr[SemanticTEXTALIGNMENTS] = js.undefined
  /** A column can specify its vertical alignment to have all its columns vertically centered. */
  var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.undefined
  /** A column can specify a width for a wide screen device. */
  var widescreen: js.UndefOr[SemanticWIDTHS] = js.undefined
  /** Represents width of column. */
  var width: js.UndefOr[SemanticWIDTHS] = js.undefined
}

object StrictGridColumnProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    color: SemanticCOLORS = null,
    computer: SemanticWIDTHS = null,
    floated: SemanticFLOATS = null,
    largeScreen: SemanticWIDTHS = null,
    mobile: SemanticWIDTHS = null,
    only: GridOnlyProp = null,
    stretched: js.UndefOr[Boolean] = js.undefined,
    tablet: SemanticWIDTHS = null,
    textAlign: SemanticTEXTALIGNMENTS = null,
    verticalAlign: SemanticVERTICALALIGNMENTS = null,
    widescreen: SemanticWIDTHS = null,
    width: SemanticWIDTHS = null
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

