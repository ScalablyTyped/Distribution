package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsGridGridRowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictGridRowProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A row can have its columns centered. */
  var centered: js.UndefOr[scala.Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** A grid row can be colored. */
  var color: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticCOLORS] = js.undefined
  /** Represents column count per line in Row. */
  var columns: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.equal
  ] = js.undefined
  /** A row can have dividers between its columns. */
  var divided: js.UndefOr[scala.Boolean] = js.undefined
  /** A row can appear only for a specific device, or screen sizes. */
  var only: js.UndefOr[semanticDashUiDashReactLib.distCommonjsCollectionsGridGridColumnMod.GridOnlyProp] = js.undefined
  /** A  row can specify that its columns should reverse order at different device sizes. */
  var reversed: js.UndefOr[semanticDashUiDashReactLib.distCommonjsCollectionsGridGridMod.GridReversedProp] = js.undefined
  /** An can stretch its contents to take up the entire column height. */
  var stretched: js.UndefOr[scala.Boolean] = js.undefined
  /** A row can specify its text alignment. */
  var textAlign: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticTEXTALIGNMENTS] = js.undefined
  /** A row can specify its vertical alignment to have all its columns vertically centered. */
  var verticalAlign: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS] = js.undefined
}

object StrictGridRowProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    centered: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    color: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticCOLORS = null,
    columns: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.equal = null,
    divided: js.UndefOr[scala.Boolean] = js.undefined,
    only: semanticDashUiDashReactLib.distCommonjsCollectionsGridGridColumnMod.GridOnlyProp = null,
    reversed: semanticDashUiDashReactLib.distCommonjsCollectionsGridGridMod.GridReversedProp = null,
    stretched: js.UndefOr[scala.Boolean] = js.undefined,
    textAlign: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticTEXTALIGNMENTS = null,
    verticalAlign: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS = null
  ): StrictGridRowProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(divided)) __obj.updateDynamic("divided")(divided)
    if (only != null) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (reversed != null) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    if (!js.isUndefined(stretched)) __obj.updateDynamic("stretched")(stretched)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    __obj.asInstanceOf[StrictGridRowProps]
  }
}

