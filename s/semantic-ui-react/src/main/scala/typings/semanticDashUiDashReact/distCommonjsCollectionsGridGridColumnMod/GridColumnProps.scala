package typings.semanticDashUiDashReact.distCommonjsCollectionsGridGridColumnMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticCOLORS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticFLOATS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticTEXTALIGNMENTS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticWIDTHS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridColumnProps
  extends StrictGridColumnProps
     with /* key */ StringDictionary[js.Any]

object GridColumnProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
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

