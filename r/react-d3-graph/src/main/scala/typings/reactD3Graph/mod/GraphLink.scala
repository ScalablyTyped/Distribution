package typings.reactD3Graph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<react-d3-graph.react-d3-graph.LinkLevelLinkConfiguration> */
trait GraphLink extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var fontColor: js.UndefOr[String] = js.undefined
  var markerWidth: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var source: String
  var strokeWidth: js.UndefOr[Double] = js.undefined
  var target: String
}

object GraphLink {
  @scala.inline
  def apply(
    source: String,
    target: String,
    color: String = null,
    fontColor: String = null,
    markerWidth: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    strokeWidth: js.UndefOr[Double] = js.undefined
  ): GraphLink = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontColor != null) __obj.updateDynamic("fontColor")(fontColor.asInstanceOf[js.Any])
    if (!js.isUndefined(markerWidth)) __obj.updateDynamic("markerWidth")(markerWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWidth)) __obj.updateDynamic("strokeWidth")(strokeWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphLink]
  }
}

