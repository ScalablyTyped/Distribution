package typings
package semanticDashUiDashReactLib.distCommonjsElementsSegmentSegmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictSegmentProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Attach segment to other content, like a header. */
  var attached: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.top | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.bottom
  ] = js.undefined
  /** A basic segment has no special formatting. */
  var basic: js.UndefOr[scala.Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** A segment can be circular. */
  var circular: js.UndefOr[scala.Boolean] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** A segment can clear floated content. */
  var clearing: js.UndefOr[scala.Boolean] = js.undefined
  /** Segment can be colored. */
  var color: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticCOLORS] = js.undefined
  /** A segment may take up only as much space as is necessary. */
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** A segment may show its content is disabled. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Segment content can be floated to the left or right. */
  var floated: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticFLOATS] = js.undefined
  /** A segment can have its colors inverted for contrast. */
  var inverted: js.UndefOr[scala.Boolean] = js.undefined
  /** A segment may show its content is being loaded. */
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  /** A segment can increase its padding. */
  var padded: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.very
  ] = js.undefined
  /** Formatted to look like a pile of pages. */
  var piled: js.UndefOr[scala.Boolean] = js.undefined
  /** A segment can be used to reserve space for conditionally displayed content. */
  var placeholder: js.UndefOr[scala.Boolean] = js.undefined
  /** A segment may be formatted to raise above the page. */
  var raised: js.UndefOr[scala.Boolean] = js.undefined
  /** A segment can be formatted to appear less noticeable. */
  var secondary: js.UndefOr[scala.Boolean] = js.undefined
  /** A segment can have different sizes. */
  var size: js.UndefOr[SegmentSizeProp] = js.undefined
  /** Formatted to show it contains multiple pages. */
  var stacked: js.UndefOr[scala.Boolean] = js.undefined
  /** A segment can be formatted to appear even less noticeable. */
  var tertiary: js.UndefOr[scala.Boolean] = js.undefined
  /** Formats content to be aligned as part of a vertical group. */
  var textAlign: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticTEXTALIGNMENTS] = js.undefined
  /** Formats content to be aligned vertically. */
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

object StrictSegmentProps {
  @scala.inline
  def apply(
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
  ): StrictSegmentProps = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[StrictSegmentProps]
  }
}

