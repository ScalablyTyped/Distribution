package typings.storybookTheming

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFonts extends js.Object {
  var fonts: AnonBase
  var size: AnonCode
  var weight: AnonBlack
}

object AnonFonts {
  @scala.inline
  def apply(fonts: AnonBase, size: AnonCode, weight: AnonBlack): AnonFonts = {
    val __obj = js.Dynamic.literal(fonts = fonts.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFonts]
  }
}

