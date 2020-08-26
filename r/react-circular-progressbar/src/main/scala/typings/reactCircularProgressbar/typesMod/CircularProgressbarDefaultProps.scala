package typings.reactCircularProgressbar.typesMod

import typings.reactCircularProgressbar.anon.Background
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircularProgressbarDefaultProps extends js.Object {
  var background: Boolean = js.native
  var backgroundPadding: Double = js.native
  var circleRatio: Double = js.native
  var className: String = js.native
  var classes: Background = js.native
  var counterClockwise: Boolean = js.native
  var maxValue: Double = js.native
  var minValue: Double = js.native
  var strokeWidth: Double = js.native
  var styles: CircularProgressbarStyles = js.native
  var text: String = js.native
}

object CircularProgressbarDefaultProps {
  @scala.inline
  def apply(
    background: Boolean,
    backgroundPadding: Double,
    circleRatio: Double,
    className: String,
    classes: Background,
    counterClockwise: Boolean,
    maxValue: Double,
    minValue: Double,
    strokeWidth: Double,
    styles: CircularProgressbarStyles,
    text: String
  ): CircularProgressbarDefaultProps = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], backgroundPadding = backgroundPadding.asInstanceOf[js.Any], circleRatio = circleRatio.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], counterClockwise = counterClockwise.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircularProgressbarDefaultProps]
  }
  @scala.inline
  implicit class CircularProgressbarDefaultPropsOps[Self <: CircularProgressbarDefaultProps] (val x: Self) extends AnyVal {
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
    def setBackground(value: Boolean): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundPadding(value: Double): Self = this.set("backgroundPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def setCircleRatio(value: Double): Self = this.set("circleRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setClasses(value: Background): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def setCounterClockwise(value: Boolean): Self = this.set("counterClockwise", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyles(value: CircularProgressbarStyles): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

