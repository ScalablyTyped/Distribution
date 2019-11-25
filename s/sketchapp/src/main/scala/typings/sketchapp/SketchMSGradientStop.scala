package typings.sketchapp

import typings.sketchapp.sketchappStrings.gradientStop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSGradientStop extends js.Object {
  var _class: gradientStop
  var color: SketchMSColor
  var position: Double
}

object SketchMSGradientStop {
  @scala.inline
  def apply(_class: gradientStop, color: SketchMSColor, position: Double): SketchMSGradientStop = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SketchMSGradientStop]
  }
}

