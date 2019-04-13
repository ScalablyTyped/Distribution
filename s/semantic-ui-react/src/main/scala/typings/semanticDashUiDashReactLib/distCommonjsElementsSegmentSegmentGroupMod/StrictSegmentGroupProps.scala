package typings
package semanticDashUiDashReactLib.distCommonjsElementsSegmentSegmentGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictSegmentGroupProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** A segment may take up only as much space as is necessary. */
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** Formats content to be aligned horizontally. */
  var horizontal: js.UndefOr[scala.Boolean] = js.undefined
  /** Formatted to look like a pile of pages. */
  var piled: js.UndefOr[scala.Boolean] = js.undefined
  /** A segment group may be formatted to raise above the page. */
  var raised: js.UndefOr[scala.Boolean] = js.undefined
  /** A segment group can have different sizes. */
  var size: js.UndefOr[semanticDashUiDashReactLib.distCommonjsElementsSegmentSegmentMod.SegmentSizeProp] = js.undefined
  /** Formatted to show it contains multiple pages. */
  var stacked: js.UndefOr[scala.Boolean] = js.undefined
}

object StrictSegmentGroupProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    compact: js.UndefOr[scala.Boolean] = js.undefined,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    horizontal: js.UndefOr[scala.Boolean] = js.undefined,
    piled: js.UndefOr[scala.Boolean] = js.undefined,
    raised: js.UndefOr[scala.Boolean] = js.undefined,
    size: semanticDashUiDashReactLib.distCommonjsElementsSegmentSegmentMod.SegmentSizeProp = null,
    stacked: js.UndefOr[scala.Boolean] = js.undefined
  ): StrictSegmentGroupProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (!js.isUndefined(piled)) __obj.updateDynamic("piled")(piled)
    if (!js.isUndefined(raised)) __obj.updateDynamic("raised")(raised)
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(stacked)) __obj.updateDynamic("stacked")(stacked)
    __obj.asInstanceOf[StrictSegmentGroupProps]
  }
}

