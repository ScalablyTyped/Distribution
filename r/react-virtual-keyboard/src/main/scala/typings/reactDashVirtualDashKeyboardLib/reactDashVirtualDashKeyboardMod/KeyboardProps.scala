package typings
package reactDashVirtualDashKeyboardLib.reactDashVirtualDashKeyboardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardProps extends js.Object {
  var callbackParent: js.UndefOr[kbEvents] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onAccepted: js.UndefOr[kbEvents] = js.undefined
  var onChange: js.UndefOr[kbEvents] = js.undefined
  var options: js.UndefOr[ReactKeyboardOptions] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object KeyboardProps {
  @scala.inline
  def apply(
    callbackParent: kbEvents = null,
    name: java.lang.String = null,
    onAccepted: kbEvents = null,
    onChange: kbEvents = null,
    options: ReactKeyboardOptions = null,
    placeholder: java.lang.String = null,
    value: java.lang.String = null
  ): KeyboardProps = {
    val __obj = js.Dynamic.literal()
    if (callbackParent != null) __obj.updateDynamic("callbackParent")(callbackParent)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onAccepted != null) __obj.updateDynamic("onAccepted")(onAccepted)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (options != null) __obj.updateDynamic("options")(options)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[KeyboardProps]
  }
}

