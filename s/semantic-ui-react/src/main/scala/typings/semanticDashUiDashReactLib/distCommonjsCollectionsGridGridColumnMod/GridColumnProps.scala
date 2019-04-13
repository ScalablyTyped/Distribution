package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsGridGridColumnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridColumnProps
  extends StrictGridColumnProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object GridColumnProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    as: js.Any = null,
    children: reactLib.reactMod.ReactNode = null,
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
  ): GridColumnProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
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
    __obj.asInstanceOf[GridColumnProps]
  }
}

