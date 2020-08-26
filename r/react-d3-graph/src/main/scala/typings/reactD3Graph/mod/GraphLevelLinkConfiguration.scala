package typings.reactD3Graph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphLevelLinkConfiguration[L /* <: GraphLink */] extends LinkLevelLinkConfiguration {
  var fontSize: Double = js.native
  var fontWeight: String = js.native
  var highlightColor: String = js.native
  var highlightFontSize: Double = js.native
  var highlightFontWeight: String = js.native
  var labelProperty: LinkLabelProperty[L] = js.native
  var markerHeight: Double = js.native
  var mouseCursor: String = js.native
  var renderLabel: Boolean = js.native
  var semanticStrokeWidth: Boolean = js.native
  var `type`: String = js.native
}

object GraphLevelLinkConfiguration {
  @scala.inline
  def apply[/* <: typings.reactD3Graph.mod.GraphLink */ L](
    color: String,
    fontColor: String,
    fontSize: Double,
    fontWeight: String,
    highlightColor: String,
    highlightFontSize: Double,
    highlightFontWeight: String,
    labelProperty: LinkLabelProperty[L],
    markerHeight: Double,
    markerWidth: Double,
    mouseCursor: String,
    opacity: Double,
    renderLabel: Boolean,
    semanticStrokeWidth: Boolean,
    strokeWidth: Double,
    `type`: String
  ): GraphLevelLinkConfiguration[L] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontColor = fontColor.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], highlightColor = highlightColor.asInstanceOf[js.Any], highlightFontSize = highlightFontSize.asInstanceOf[js.Any], highlightFontWeight = highlightFontWeight.asInstanceOf[js.Any], labelProperty = labelProperty.asInstanceOf[js.Any], markerHeight = markerHeight.asInstanceOf[js.Any], markerWidth = markerWidth.asInstanceOf[js.Any], mouseCursor = mouseCursor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], renderLabel = renderLabel.asInstanceOf[js.Any], semanticStrokeWidth = semanticStrokeWidth.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphLevelLinkConfiguration[L]]
  }
  @scala.inline
  implicit class GraphLevelLinkConfigurationOps[Self <: GraphLevelLinkConfiguration[_], /* <: typings.reactD3Graph.mod.GraphLink */ L] (val x: Self with GraphLevelLinkConfiguration[L]) extends AnyVal {
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
    def setLabelPropertyFunction1(value: L => String): Self = this.set("labelProperty", js.Any.fromFunction1(value))
    @scala.inline
    def setLabelProperty(value: LinkLabelProperty[L]): Self = this.set("labelProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkerHeight(value: Double): Self = this.set("markerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseCursor(value: String): Self = this.set("mouseCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderLabel(value: Boolean): Self = this.set("renderLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setSemanticStrokeWidth(value: Boolean): Self = this.set("semanticStrokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

