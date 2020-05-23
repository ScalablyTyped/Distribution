package typings.reactD3Graph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkLevelLinkConfiguration extends js.Object {
  var color: String
  var fontColor: String
  var markerWidth: Double
  var opacity: Double
  var strokeWidth: Double
}

object LinkLevelLinkConfiguration {
  @scala.inline
  def apply(color: String, fontColor: String, markerWidth: Double, opacity: Double, strokeWidth: Double): LinkLevelLinkConfiguration = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontColor = fontColor.asInstanceOf[js.Any], markerWidth = markerWidth.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkLevelLinkConfiguration]
  }
}

