package typings.reactD3Graph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkLevelLinkConfiguration extends js.Object {
  var color: String = js.native
  var fontColor: String = js.native
  var markerWidth: Double = js.native
  var opacity: Double = js.native
  var strokeWidth: Double = js.native
}

object LinkLevelLinkConfiguration {
  @scala.inline
  def apply(color: String, fontColor: String, markerWidth: Double, opacity: Double, strokeWidth: Double): LinkLevelLinkConfiguration = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontColor = fontColor.asInstanceOf[js.Any], markerWidth = markerWidth.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkLevelLinkConfiguration]
  }
  @scala.inline
  implicit class LinkLevelLinkConfigurationOps[Self <: LinkLevelLinkConfiguration] (val x: Self) extends AnyVal {
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
    def setMarkerWidth(value: Double): Self = this.set("markerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
  }
  
}

