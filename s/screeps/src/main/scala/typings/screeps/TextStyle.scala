package typings.screeps

import typings.screeps.screepsStrings.center
import typings.screeps.screepsStrings.left
import typings.screeps.screepsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextStyle extends js.Object {
  var align: js.UndefOr[center | left | right] = js.native
  /**
    * Background color in any web format, default is undefined (no background).When background is enabled, text vertical align is set to middle (default is baseline).
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * Background rectangle padding, default is 0.3.
    */
  var backgroundPadding: js.UndefOr[Double] = js.native
  /**
    * Font color in any web format, default is #ffffff(white).
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Either a number or a string in one of the following forms:
    * 0.7 - relative size in game coordinates
    * 20px - absolute size in pixels
    * 0.7 serif
    * bold italic 1.5 Times New Roman
    */
  var font: js.UndefOr[Double | String] = js.native
  /**
    * Opacity value, default is 1.0.
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * Stroke color in any web format, default is undefined (no stroke).
    */
  var stroke: js.UndefOr[String] = js.native
  /**
    * Stroke width, default is 0.15.
    */
  var strokeWidth: js.UndefOr[Double] = js.native
}

object TextStyle {
  @scala.inline
  def apply(): TextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStyle]
  }
  @scala.inline
  implicit class TextStyleOps[Self <: TextStyle] (val x: Self) extends AnyVal {
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
    def setAlign(value: center | left | right): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBackgroundPadding(value: Double): Self = this.set("backgroundPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundPadding: Self = this.set("backgroundPadding", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFont(value: Double | String): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
  }
  
}

