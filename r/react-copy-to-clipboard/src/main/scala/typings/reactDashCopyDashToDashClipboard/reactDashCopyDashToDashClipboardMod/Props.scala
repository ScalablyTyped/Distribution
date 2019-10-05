package typings.reactDashCopyDashToDashClipboard.reactDashCopyDashToDashClipboardMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: ReactNode
  var onCopy: js.UndefOr[js.Function2[/* text */ String, /* result */ Boolean, Unit]] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var text: String
}

object Props {
  @scala.inline
  def apply(
    text: String,
    children: ReactNode = null,
    onCopy: (/* text */ String, /* result */ Boolean) => Unit = null,
    options: Options = null
  ): Props = {
    val __obj = js.Dynamic.literal(text = text)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction2(onCopy))
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Props]
  }
}

