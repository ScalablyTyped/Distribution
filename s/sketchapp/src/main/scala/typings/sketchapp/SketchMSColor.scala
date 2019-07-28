package typings.sketchapp

import typings.sketchapp.sketchappStrings.color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSColor extends js.Object {
  var _class: color
  var alpha: Double
  var blue: Double
  var do_objectID: js.UndefOr[String] = js.undefined
  var green: Double
  var red: Double
  /**
    * ex: "#FFFFFF"
    * ex: rgb(1,0,1)
    */
  var value: String
}

object SketchMSColor {
  @scala.inline
  def apply(
    _class: color,
    alpha: Double,
    blue: Double,
    green: Double,
    red: Double,
    value: String,
    do_objectID: String = null
  ): SketchMSColor = {
    val __obj = js.Dynamic.literal(_class = _class, alpha = alpha, blue = blue, green = green, red = red, value = value)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSColor]
  }
}

