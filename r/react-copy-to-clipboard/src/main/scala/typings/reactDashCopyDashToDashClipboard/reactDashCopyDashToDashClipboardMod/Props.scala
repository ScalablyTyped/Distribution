package typings.reactDashCopyDashToDashClipboard.reactDashCopyDashToDashClipboardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var onCopy: js.UndefOr[js.Function2[/* a */ String, /* b */ Boolean, Unit]] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var text: String
}

object Props {
  @scala.inline
  def apply(text: String, onCopy: (/* a */ String, /* b */ Boolean) => Unit = null, options: Options = null): Props = {
    val __obj = js.Dynamic.literal(text = text)
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction2(onCopy))
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Props]
  }
}

