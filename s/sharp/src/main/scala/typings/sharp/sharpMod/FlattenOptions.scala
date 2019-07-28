package typings.sharp.sharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlattenOptions extends js.Object {
  /** background colour, parsed by the color module, defaults to black. (optional, default {r:0,g:0,b:0}) */
  var background: js.UndefOr[Color] = js.undefined
}

object FlattenOptions {
  @scala.inline
  def apply(background: Color = null): FlattenOptions = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlattenOptions]
  }
}

