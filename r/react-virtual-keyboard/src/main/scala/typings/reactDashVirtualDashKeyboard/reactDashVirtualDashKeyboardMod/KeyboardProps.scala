package typings.reactDashVirtualDashKeyboard.reactDashVirtualDashKeyboardMod

import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardProps extends js.Object {
  var callbackParent: js.UndefOr[kbEvents] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onAccepted: js.UndefOr[kbEvents] = js.undefined
  var onChange: js.UndefOr[kbEvents] = js.undefined
  var options: js.UndefOr[ReactKeyboardOptions] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object KeyboardProps {
  @scala.inline
  def apply(
    callbackParent: (/* event */ js.UndefOr[String | Event], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit = null,
    name: String = null,
    onAccepted: (/* event */ js.UndefOr[String | Event], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit = null,
    onChange: (/* event */ js.UndefOr[String | Event], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit = null,
    options: ReactKeyboardOptions = null,
    placeholder: String = null,
    value: String = null
  ): KeyboardProps = {
    val __obj = js.Dynamic.literal()
    if (callbackParent != null) __obj.updateDynamic("callbackParent")(js.Any.fromFunction3(callbackParent))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onAccepted != null) __obj.updateDynamic("onAccepted")(js.Any.fromFunction3(onAccepted))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardProps]
  }
}

