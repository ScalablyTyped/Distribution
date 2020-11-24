package typings.reactD3Graph.mod

import typings.reactD3Graph.anon.Height
import typings.reactD3Graph.reactD3GraphStrings.SAME
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphLevelNodeConfiguration[N /* <: GraphNode */] extends js.Object {
  
  var color: String = js.native
  
  var fontColor: String = js.native
  
  var fontSize: Double = js.native
  
  var fontWeight: String = js.native
  
  var highlightColor: String = js.native
  
  var highlightFontSize: Double = js.native
  
  var highlightFontWeight: String = js.native
  
  var highlightStrokeColor: SAME | String = js.native
  
  var highlightStrokeWidth: SAME | Double = js.native
  
  var labelProperty: NodeLabelProperty[N] = js.native
  
  var mouseCursor: String = js.native
  
  var opacity: Double = js.native
  
  var renderLabel: Boolean = js.native
  
  var size: Double | Height = js.native
  
  var strokeColor: String = js.native
  
  var strokeWidth: Double = js.native
  
  var svg: String = js.native
  
  var symbolType: String = js.native
  
  def viewGenerator(node: N): js.Any = js.native
}
object GraphLevelNodeConfiguration {
  
  @scala.inline
  def apply[N /* <: GraphNode */](
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
    size: Double | Height,
    strokeColor: String,
    strokeWidth: Double,
    svg: String,
    symbolType: String,
    viewGenerator: N => js.Any
  ): GraphLevelNodeConfiguration[N] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontColor = fontColor.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], highlightColor = highlightColor.asInstanceOf[js.Any], highlightFontSize = highlightFontSize.asInstanceOf[js.Any], highlightFontWeight = highlightFontWeight.asInstanceOf[js.Any], highlightStrokeColor = highlightStrokeColor.asInstanceOf[js.Any], highlightStrokeWidth = highlightStrokeWidth.asInstanceOf[js.Any], labelProperty = labelProperty.asInstanceOf[js.Any], mouseCursor = mouseCursor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], renderLabel = renderLabel.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], symbolType = symbolType.asInstanceOf[js.Any], viewGenerator = js.Any.fromFunction1(viewGenerator))
    __obj.asInstanceOf[GraphLevelNodeConfiguration[N]]
  }
  
  @scala.inline
  implicit class GraphLevelNodeConfigurationOps[Self <: GraphLevelNodeConfiguration[_], N /* <: GraphNode */] (val x: Self with GraphLevelNodeConfiguration[N]) extends AnyVal {
    
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
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeight(value: String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightColor(value: String): Self = this.set("highlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightFontSize(value: Double): Self = this.set("highlightFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightFontWeight(value: String): Self = this.set("highlightFontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightStrokeColor(value: SAME | String): Self = this.set("highlightStrokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightStrokeWidth(value: SAME | Double): Self = this.set("highlightStrokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPropertyFunction1(value: N => String): Self = this.set("labelProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelProperty(value: NodeLabelProperty[N]): Self = this.set("labelProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseCursor(value: String): Self = this.set("mouseCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderLabel(value: Boolean): Self = this.set("renderLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double | Height): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeColor(value: String): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvg(value: String): Self = this.set("svg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolType(value: String): Self = this.set("symbolType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewGenerator(value: N => js.Any): Self = this.set("viewGenerator", js.Any.fromFunction1(value))
  }
}
