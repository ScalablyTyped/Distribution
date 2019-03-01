package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmulateOptions extends js.Object {
  /** The emulated user-agent. */
  var userAgent: js.UndefOr[java.lang.String] = js.undefined
  /** The viewport emulation options. */
  var viewport: js.UndefOr[Viewport] = js.undefined
}

object EmulateOptions {
  @scala.inline
  def apply(userAgent: java.lang.String = null, viewport: Viewport = null): EmulateOptions = {
    val __obj = js.Dynamic.literal()
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    if (viewport != null) __obj.updateDynamic("viewport")(viewport)
    __obj.asInstanceOf[EmulateOptions]
  }
}

