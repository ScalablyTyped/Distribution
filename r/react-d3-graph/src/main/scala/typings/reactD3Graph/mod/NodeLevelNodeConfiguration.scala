package typings.reactD3Graph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeLevelNodeConfiguration extends js.Object {
  var color: String = js.native
  var fontColor: String = js.native
  var labelProperty: NodeLabelProperty[NodeWithExtraParameters] = js.native
  var opacity: Double = js.native
  var renderLabel: Boolean = js.native
  var size: Double = js.native
  var strokeColor: String = js.native
  var strokeWidth: Double = js.native
  var svg: String = js.native
  var symbolType: String = js.native
  def viewGenerator(node: NodeWithExtraParameters): js.Any = js.native
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
  @scala.inline
  implicit class NodeLevelNodeConfigurationOps[Self <: NodeLevelNodeConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontColor(value: String): Self = this.set("fontColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelPropertyFunction1(value: NodeWithExtraParameters => String): Self = this.set("labelProperty", js.Any.fromFunction1(value))
    @scala.inline
    def setLabelProperty(value: NodeLabelProperty[NodeWithExtraParameters]): Self = this.set("labelProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderLabel(value: Boolean): Self = this.set("renderLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrokeColor(value: String): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setSvg(value: String): Self = this.set("svg", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbolType(value: String): Self = this.set("symbolType", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewGenerator(value: NodeWithExtraParameters => js.Any): Self = this.set("viewGenerator", js.Any.fromFunction1(value))
  }
  
}

