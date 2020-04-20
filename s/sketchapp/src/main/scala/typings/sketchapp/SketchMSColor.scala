package typings.sketchapp

import typings.sketchapp.sketchappStrings.color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSColor extends js.Object {
  var _class: color
  var alpha: Double
  var blue: Double
  var green: Double
  var red: Double
}

object SketchMSColor {
  @scala.inline
  def apply(_class: color, alpha: Double, blue: Double, green: Double, red: Double): SketchMSColor = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSColor]
  }
}

