package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSColor extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.color
  var alpha: scala.Double
  var blue: scala.Double
  var do_objectID: js.UndefOr[java.lang.String] = js.undefined
  var green: scala.Double
  var red: scala.Double
  /**
    * ex: "#FFFFFF"
    * ex: rgb(1,0,1)
    */
  var value: java.lang.String
}

object SketchMSColor {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.color,
    alpha: scala.Double,
    blue: scala.Double,
    green: scala.Double,
    red: scala.Double,
    value: java.lang.String,
    do_objectID: java.lang.String = null
  ): SketchMSColor = {
    val __obj = js.Dynamic.literal(_class = _class, alpha = alpha, blue = blue, green = green, red = red, value = value)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSColor]
  }
}

