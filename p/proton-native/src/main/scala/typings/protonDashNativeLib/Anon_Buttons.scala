package typings
package protonDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buttons extends js.Object {
  var buttons: js.Array[java.lang.String]
  var height: scala.Double
  var width: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object Anon_Buttons {
  @scala.inline
  def apply(
    buttons: js.Array[java.lang.String],
    height: scala.Double,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): Anon_Buttons = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buttons")(buttons)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Anon_Buttons]
  }
}

