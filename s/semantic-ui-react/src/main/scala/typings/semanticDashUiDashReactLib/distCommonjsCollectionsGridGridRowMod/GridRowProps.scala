package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsGridGridRowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridRowProps
  extends StrictGridRowProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object GridRowProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    as: js.Any = null,
    centered: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    color: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticCOLORS = null,
    columns: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.equal = null,
    divided: js.UndefOr[scala.Boolean] = js.undefined,
    only: semanticDashUiDashReactLib.distCommonjsCollectionsGridGridColumnMod.GridOnlyProp = null,
    reversed: semanticDashUiDashReactLib.distCommonjsCollectionsGridGridMod.GridReversedProp = null,
    stretched: js.UndefOr[scala.Boolean] = js.undefined,
    textAlign: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticTEXTALIGNMENTS = null,
    verticalAlign: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS = null
  ): GridRowProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
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
    __obj.asInstanceOf[GridRowProps]
  }
}

