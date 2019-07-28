package typings.puppeteer.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmulateOptions extends js.Object {
  /** The emulated user-agent. */
  var userAgent: js.UndefOr[String] = js.undefined
  /** The viewport emulation options. */
  var viewport: js.UndefOr[Viewport] = js.undefined
}

object EmulateOptions {
  @scala.inline
  def apply(userAgent: String = null, viewport: Viewport = null): EmulateOptions = {
    val __obj = js.Dynamic.literal()
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    if (viewport != null) __obj.updateDynamic("viewport")(viewport)
    __obj.asInstanceOf[EmulateOptions]
  }
}

