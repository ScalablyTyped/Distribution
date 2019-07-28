package typings.ssh2.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X11Options extends js.Object {
  /** The Screen number to use (default: `0`). */
  var screen: js.UndefOr[Double] = js.undefined
  /** Whether to allow just a single connection (default: `false`).*/
  var single: js.UndefOr[Boolean] = js.undefined
}

object X11Options {
  @scala.inline
  def apply(screen: Int | Double = null, single: js.UndefOr[Boolean] = js.undefined): X11Options = {
    val __obj = js.Dynamic.literal()
    if (screen != null) __obj.updateDynamic("screen")(screen.asInstanceOf[js.Any])
    if (!js.isUndefined(single)) __obj.updateDynamic("single")(single)
    __obj.asInstanceOf[X11Options]
  }
}

