package typings.reactD3Graph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<react-d3-graph.react-d3-graph.NodeLevelNodeConfiguration> */
trait GraphNode extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var fontColor: js.UndefOr[String] = js.undefined
  var id: String
  var labelProperty: js.UndefOr[NodeLabelProperty[NodeWithExtraParameters]] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var renderLabel: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var strokeColor: js.UndefOr[String] = js.undefined
  var strokeWidth: js.UndefOr[Double] = js.undefined
  var svg: js.UndefOr[String] = js.undefined
  var symbolType: js.UndefOr[String] = js.undefined
  var viewGenerator: js.UndefOr[js.Function1[/* node */ NodeWithExtraParameters, _]] = js.undefined
}

object GraphNode {
  @scala.inline
  def apply(
    id: String,
    color: String = null,
    fontColor: String = null,
    labelProperty: NodeLabelProperty[NodeWithExtraParameters] = null,
    opacity: js.UndefOr[Double] = js.undefined,
    renderLabel: js.UndefOr[Boolean] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    strokeColor: String = null,
    strokeWidth: js.UndefOr[Double] = js.undefined,
    svg: String = null,
    symbolType: String = null,
    viewGenerator: /* node */ NodeWithExtraParameters => _ = null
  ): GraphNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontColor != null) __obj.updateDynamic("fontColor")(fontColor.asInstanceOf[js.Any])
    if (labelProperty != null) __obj.updateDynamic("labelProperty")(labelProperty.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(renderLabel)) __obj.updateDynamic("renderLabel")(renderLabel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWidth)) __obj.updateDynamic("strokeWidth")(strokeWidth.get.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (symbolType != null) __obj.updateDynamic("symbolType")(symbolType.asInstanceOf[js.Any])
    if (viewGenerator != null) __obj.updateDynamic("viewGenerator")(js.Any.fromFunction1(viewGenerator))
    __obj.asInstanceOf[GraphNode]
  }
}

