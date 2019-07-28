package typings.ssh2.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShellOptions extends js.Object {
  /** Set either to `true` to use defaults, a number to specify a specific screen number, or an object containing x11 settings. */
  var x11: js.UndefOr[Boolean | Double | X11Options] = js.undefined
}

object ShellOptions {
  @scala.inline
  def apply(x11: Boolean | Double | X11Options = null): ShellOptions = {
    val __obj = js.Dynamic.literal()
    if (x11 != null) __obj.updateDynamic("x11")(x11.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellOptions]
  }
}

