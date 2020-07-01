package typings.reactD3Graph.mod

import typings.reactD3Graph.reactD3GraphStrings.SAME
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphLevelNodeConfiguration[N /* <: GraphNode */] extends js.Object {
  var color: String
  var fontColor: String
  var fontSize: Double
  var fontWeight: String
  var highlightColor: String
  var highlightFontSize: Double
  var highlightFontWeight: String
  var highlightStrokeColor: SAME | String
  var highlightStrokeWidth: SAME | Double
  var labelProperty: NodeLabelProperty[N]
  var mouseCursor: String
  var opacity: Double
  var renderLabel: Boolean
  var size: Double
  var strokeColor: String
  var strokeWidth: Double
  var svg: String
  var symbolType: String
  def viewGenerator(node: N): js.Any
}

object GraphLevelNodeConfiguration {
  @scala.inline
  def apply[/* <: typings.reactD3Graph.mod.GraphNode */ N](
    color: String,
    fontColor: String,
    fontSize: Double,
    fontWeight: String,
    highlightColor: String,
    highlightFontSize: Double,
    highlightFontWeight: String,
    highlightStrokeColor: SAME | String,
    highlightStrokeWidth: SAME | Double,
    labelProperty: NodeLabelProperty[N],
    mouseCursor: String,
    opacity: Double,
    renderLabel: Boolean,
    size: Double,
    strokeColor: String,
    strokeWidth: Double,
    svg: String,
    symbolType: String,
    viewGenerator: N => js.Any
  ): GraphLevelNodeConfiguration[N] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontColor = fontColor.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], highlightColor = highlightColor.asInstanceOf[js.Any], highlightFontSize = highlightFontSize.asInstanceOf[js.Any], highlightFontWeight = highlightFontWeight.asInstanceOf[js.Any], highlightStrokeColor = highlightStrokeColor.asInstanceOf[js.Any], highlightStrokeWidth = highlightStrokeWidth.asInstanceOf[js.Any], labelProperty = labelProperty.asInstanceOf[js.Any], mouseCursor = mouseCursor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], renderLabel = renderLabel.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], symbolType = symbolType.asInstanceOf[js.Any], viewGenerator = js.Any.fromFunction1(viewGenerator))
    __obj.asInstanceOf[GraphLevelNodeConfiguration[N]]
  }
}

