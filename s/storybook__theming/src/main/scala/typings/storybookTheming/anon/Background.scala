package typings.storybookTheming.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Background extends js.Object {
  var background: App
  var color: Ancillary
  var typography: Fonts
}

object Background {
  @scala.inline
  def apply(background: App, color: Ancillary, typography: Fonts): Background = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], typography = typography.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
}

