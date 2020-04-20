package typings.reactCircularProgressbar.typesMod

import typings.reactCircularProgressbar.AnonBackground
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-circular-progressbar.react-circular-progressbar/dist/types.CircularProgressbarDefaultProps & {  value  :number} */
trait CircularProgressbarProps extends js.Object {
  var background: Boolean
  var backgroundPadding: Double
  var circleRatio: Double
  var className: String
  var classes: AnonBackground
  var counterClockwise: Boolean
  var maxValue: Double
  var minValue: Double
  var strokeWidth: Double
  var styles: CircularProgressbarStyles
  var text: String
  var value: Double
}

object CircularProgressbarProps {
  @scala.inline
  def apply(
    background: Boolean,
    backgroundPadding: Double,
    circleRatio: Double,
    className: String,
    classes: AnonBackground,
    counterClockwise: Boolean,
    maxValue: Double,
    minValue: Double,
    strokeWidth: Double,
    styles: CircularProgressbarStyles,
    text: String,
    value: Double
  ): CircularProgressbarProps = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], backgroundPadding = backgroundPadding.asInstanceOf[js.Any], circleRatio = circleRatio.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], counterClockwise = counterClockwise.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircularProgressbarProps]
  }
}

