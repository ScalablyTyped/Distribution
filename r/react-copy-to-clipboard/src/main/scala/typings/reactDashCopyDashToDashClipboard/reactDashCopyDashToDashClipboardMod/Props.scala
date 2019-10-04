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
    children: ReactNode,
    text: String,
    onCopy: (/* text */ String, /* result */ Boolean) => Unit = null,
    options: Options = null
  ): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], text = text)
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction2(onCopy))
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Props]
  }
}

