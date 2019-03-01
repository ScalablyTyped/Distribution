package typings
package semanticDashUiDashReactLib.distCommonjsElementsSegmentSegmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentProps
  extends StrictSegmentProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object SegmentProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    as: js.Any = null,
    attached: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.top | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.bottom = null,
    basic: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    circular: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    clearing: js.UndefOr[scala.Boolean] = js.undefined,
    color: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticCOLORS = null,
    compact: js.UndefOr[scala.Boolean] = js.undefined,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    floated: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticFLOATS = null,
    inverted: js.UndefOr[scala.Boolean] = js.undefined,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    padded: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.very = null,
    piled: js.UndefOr[scala.Boolean] = js.undefined,
    placeholder: js.UndefOr[scala.Boolean] = js.undefined,
    raised: js.UndefOr[scala.Boolean] = js.undefined,
    secondary: js.UndefOr[scala.Boolean] = js.undefined,
    size: SegmentSizeProp = null,
    stacked: js.UndefOr[scala.Boolean] = js.undefined,
    tertiary: js.UndefOr[scala.Boolean] = js.undefined,
    textAlign: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticTEXTALIGNMENTS = null,
    vertical: js.UndefOr[scala.Boolean] = js.undefined
  ): SegmentProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (!js.isUndefined(basic)) __obj.updateDynamic("basic")(basic)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(circular)) __obj.updateDynamic("circular")(circular)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(clearing)) __obj.updateDynamic("clearing")(clearing)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
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
    __obj.asInstanceOf[SegmentProps]
  }
}

