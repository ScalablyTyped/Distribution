package typings.protonNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButtons extends js.Object {
  var buttons: js.Array[String]
  var height: Double
  var width: Double
  var x: Double
  var y: Double
}

object AnonButtons {
  @scala.inline
  def apply(buttons: js.Array[String], height: Double, width: Double, x: Double, y: Double): AnonButtons = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonButtons]
  }
}

