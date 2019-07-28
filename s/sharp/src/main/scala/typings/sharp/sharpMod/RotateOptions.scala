package typings.sharp.sharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotateOptions extends js.Object {
  /** parsed by the color module to extract values for red, green, blue and alpha. (optional, default "#000000") */
  var background: js.UndefOr[Color] = js.undefined
}

object RotateOptions {
  @scala.inline
  def apply(background: Color = null): RotateOptions = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateOptions]
  }
}

