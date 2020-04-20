package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmulateOptions extends js.Object {
  /** The emulated user-agent. */
  var userAgent: String
  /** The viewport emulation options. */
  var viewport: Viewport
}

object EmulateOptions {
  @scala.inline
  def apply(userAgent: String, viewport: Viewport): EmulateOptions = {
    val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmulateOptions]
  }
}

