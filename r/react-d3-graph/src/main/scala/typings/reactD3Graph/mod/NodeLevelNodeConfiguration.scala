package typings.reactD3Graph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeLevelNodeConfiguration extends js.Object {
  var color: String
  var fontColor: String
  var labelProperty: NodeLabelProperty[NodeWithExtraParameters]
  var opacity: Double
  var renderLabel: Boolean
  var size: Double
  var strokeColor: String
  var strokeWidth: Double
  var svg: String
  var symbolType: String
  def viewGenerator(node: NodeWithExtraParameters): js.Any
}

object NodeLevelNodeConfiguration {
  @scala.inline
  def apply(
    color: String,
    fontColor: String,
    labelProperty: NodeLabelProperty[NodeWithExtraParameters],
    opacity: Double,
    renderLabel: Boolean,
    size: Double,
    strokeColor: String,
    strokeWidth: Double,
    svg: String,
    symbolType: String,
    viewGenerator: NodeWithExtraParameters => js.Any
  ): NodeLevelNodeConfiguration = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontColor = fontColor.asInstanceOf[js.Any], labelProperty = labelProperty.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], renderLabel = renderLabel.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], symbolType = symbolType.asInstanceOf[js.Any], viewGenerator = js.Any.fromFunction1(viewGenerator))
    __obj.asInstanceOf[NodeLevelNodeConfiguration]
  }
}

