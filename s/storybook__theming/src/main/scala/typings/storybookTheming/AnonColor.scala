package typings.storybookTheming

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends js.Object {
  var color: String
  var fontStyle: String
}

object AnonColor {
  @scala.inline
  def apply(color: String, fontStyle: String): AnonColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColor]
  }
}

