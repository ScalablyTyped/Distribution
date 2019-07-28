package typings.protonDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buttons extends js.Object {
  var buttons: js.Array[String]
  var height: Double
  var width: Double
  var x: Double
  var y: Double
}

object Anon_Buttons {
  @scala.inline
  def apply(buttons: js.Array[String], height: Double, width: Double, x: Double, y: Double): Anon_Buttons = {
    val __obj = js.Dynamic.literal(buttons = buttons, height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[Anon_Buttons]
  }
}

