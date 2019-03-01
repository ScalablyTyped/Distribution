package typings
package reactDashCopyDashToDashClipboardLib.reactDashCopyDashToDashClipboardMod.CopyToClipboardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var onCopy: js.UndefOr[js.Function2[/* a */ java.lang.String, /* b */ scala.Boolean, scala.Unit]] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var text: java.lang.String
}

object Props {
  @scala.inline
  def apply(
    text: java.lang.String,
    onCopy: js.Function2[/* a */ java.lang.String, /* b */ scala.Boolean, scala.Unit] = null,
    options: Options = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    if (onCopy != null) __obj.updateDynamic("onCopy")(onCopy)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Props]
  }
}

