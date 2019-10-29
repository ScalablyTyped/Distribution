package typings.reactDashCircularDashProgressbar.distTypesMod

import typings.reactDashCircularDashProgressbar.Anon_Background
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircularProgressbarDefaultProps extends js.Object {
  var background: Boolean
  var backgroundPadding: Double
  var circleRatio: Double
  var className: String
  var classes: Anon_Background
  var counterClockwise: Boolean
  var maxValue: Double
  var minValue: Double
  var strokeWidth: Double
  var styles: CircularProgressbarStyles
  var text: String
}

object CircularProgressbarDefaultProps {
  @scala.inline
  def apply(
    background: Boolean,
    backgroundPadding: Double,
    circleRatio: Double,
    className: String,
    classes: Anon_Background,
    counterClockwise: Boolean,
    maxValue: Double,
    minValue: Double,
    strokeWidth: Double,
    styles: CircularProgressbarStyles,
    text: String
  ): CircularProgressbarDefaultProps = {
    val __obj = js.Dynamic.literal(background = background, backgroundPadding = backgroundPadding, circleRatio = circleRatio, className = className, classes = classes, counterClockwise = counterClockwise, maxValue = maxValue, minValue = minValue, strokeWidth = strokeWidth, styles = styles, text = text)
  
    __obj.asInstanceOf[CircularProgressbarDefaultProps]
  }
}

