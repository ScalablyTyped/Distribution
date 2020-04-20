package typings.storybookTheming

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTypography extends js.Object {
  var typography: AnonFonts
}

object AnonTypography {
  @scala.inline
  def apply(typography: AnonFonts): AnonTypography = {
    val __obj = js.Dynamic.literal(typography = typography.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypography]
  }
}

