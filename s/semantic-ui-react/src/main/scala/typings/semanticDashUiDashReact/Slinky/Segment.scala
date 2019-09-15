package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.semanticDashUiDashReact.distCommonjsElementsSegmentSegmentMod.SegmentProps
import typings.semanticDashUiDashReact.distCommonjsElementsSegmentSegmentMod.SegmentSizeProp
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticCOLORS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticFLOATS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticTEXTALIGNMENTS
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.bottom
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.top
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.very
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, className, disabled */
object Segment
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.semanticDashUiDashReact.distCommonjsElementsSegmentMod.default.asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    attached: Boolean | top | bottom = null,
    basic: js.UndefOr[Boolean] = js.undefined,
    circular: js.UndefOr[Boolean] = js.undefined,
    clearing: js.UndefOr[Boolean] = js.undefined,
    color: SemanticCOLORS = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    content: SemanticShorthandContent = null,
    floated: SemanticFLOATS = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    padded: Boolean | very = null,
    piled: js.UndefOr[Boolean] = js.undefined,
    placeholder: js.UndefOr[Boolean] = js.undefined,
    raised: js.UndefOr[Boolean] = js.undefined,
    secondary: js.UndefOr[Boolean] = js.undefined,
    size: SegmentSizeProp = null,
    stacked: js.UndefOr[Boolean] = js.undefined,
    tertiary: js.UndefOr[Boolean] = js.undefined,
    textAlign: SemanticTEXTALIGNMENTS = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (!js.isUndefined(basic)) __obj.updateDynamic("basic")(basic)
    if (!js.isUndefined(circular)) __obj.updateDynamic("circular")(circular)
    if (!js.isUndefined(clearing)) __obj.updateDynamic("clearing")(clearing)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (floated != null) __obj.updateDynamic("floated")(floated)
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (padded != null) __obj.updateDynamic("padded")(padded.asInstanceOf[js.Any])
    if (!js.isUndefined(piled)) __obj.updateDynamic("piled")(piled)
    if (!js.isUndefined(placeholder)) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(raised)) __obj.updateDynamic("raised")(raised)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(stacked)) __obj.updateDynamic("stacked")(stacked)
    if (!js.isUndefined(tertiary)) __obj.updateDynamic("tertiary")(tertiary)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SegmentProps
}

