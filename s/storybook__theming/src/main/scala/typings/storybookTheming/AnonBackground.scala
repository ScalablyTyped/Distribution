package typings.storybookTheming

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackground extends js.Object {
  var background: AnonApp
  var color: AnonAncillary
  var typography: AnonFonts
}

object AnonBackground {
  @scala.inline
  def apply(background: AnonApp, color: AnonAncillary, typography: AnonFonts): AnonBackground = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], typography = typography.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackground]
  }
}

