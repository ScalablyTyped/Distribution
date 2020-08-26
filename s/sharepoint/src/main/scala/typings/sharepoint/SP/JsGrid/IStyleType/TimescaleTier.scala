package typings.sharepoint.SP.JsGrid.IStyleType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimescaleTier extends js.Object {
  var backgroundColor: js.Any = js.native
  var font: js.Any = js.native
  var fontSize: js.Any = js.native
  var fontWeight: js.Any = js.native
  var horizontalBorderColor: js.Any = js.native
  var horizontalBorderStyle: js.Any = js.native
  var outerBorderColor: js.Any = js.native
  var textColor: js.Any = js.native
  var todayLineColor: js.Any = js.native
  var verticalBorderColor: js.Any = js.native
  var verticalBorderStyle: js.Any = js.native
}

object TimescaleTier {
  @scala.inline
  def apply(
    backgroundColor: js.Any,
    font: js.Any,
    fontSize: js.Any,
    fontWeight: js.Any,
    horizontalBorderColor: js.Any,
    horizontalBorderStyle: js.Any,
    outerBorderColor: js.Any,
    textColor: js.Any,
    todayLineColor: js.Any,
    verticalBorderColor: js.Any,
    verticalBorderStyle: js.Any
  ): TimescaleTier = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], horizontalBorderColor = horizontalBorderColor.asInstanceOf[js.Any], horizontalBorderStyle = horizontalBorderStyle.asInstanceOf[js.Any], outerBorderColor = outerBorderColor.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], todayLineColor = todayLineColor.asInstanceOf[js.Any], verticalBorderColor = verticalBorderColor.asInstanceOf[js.Any], verticalBorderStyle = verticalBorderStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimescaleTier]
  }
  @scala.inline
  implicit class TimescaleTierOps[Self <: TimescaleTier] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: js.Any): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setFont(value: js.Any): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSize(value: js.Any): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontWeight(value: js.Any): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontalBorderColor(value: js.Any): Self = this.set("horizontalBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontalBorderStyle(value: js.Any): Self = this.set("horizontalBorderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setOuterBorderColor(value: js.Any): Self = this.set("outerBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextColor(value: js.Any): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTodayLineColor(value: js.Any): Self = this.set("todayLineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticalBorderColor(value: js.Any): Self = this.set("verticalBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticalBorderStyle(value: js.Any): Self = this.set("verticalBorderStyle", value.asInstanceOf[js.Any])
  }
  
}

