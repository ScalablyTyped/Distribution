package typings.reactD3Graph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphLevelLinkConfiguration[L /* <: GraphLink */] extends LinkLevelLinkConfiguration {
  var fontSize: Double
  var fontWeight: String
  var highlightColor: String
  var highlightFontSize: Double
  var highlightFontWeight: String
  var labelProperty: LinkLabelProperty[L]
  var markerHeight: Double
  var mouseCursor: String
  var renderLabel: Boolean
  var semanticStrokeWidth: Boolean
  var `type`: String
}

object GraphLevelLinkConfiguration {
  @scala.inline
  def apply[L](
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
}

