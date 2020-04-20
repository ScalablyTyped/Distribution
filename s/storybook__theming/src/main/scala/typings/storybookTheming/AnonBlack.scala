package typings.storybookTheming

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlack extends js.Object {
  var black: Double
  var bold: Double
  var regular: Double
}

object AnonBlack {
  @scala.inline
  def apply(black: Double, bold: Double, regular: Double): AnonBlack = {
    val __obj = js.Dynamic.literal(black = black.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], regular = regular.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlack]
  }
}

