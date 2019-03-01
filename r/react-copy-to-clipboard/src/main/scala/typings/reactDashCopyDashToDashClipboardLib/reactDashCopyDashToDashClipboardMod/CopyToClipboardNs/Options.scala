package typings
package reactDashCopyDashToDashClipboardLib.reactDashCopyDashToDashClipboardMod.CopyToClipboardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var debug: scala.Boolean
  var message: java.lang.String
}

object Options {
  @scala.inline
  def apply(debug: scala.Boolean, message: java.lang.String): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(debug)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Options]
  }
}

