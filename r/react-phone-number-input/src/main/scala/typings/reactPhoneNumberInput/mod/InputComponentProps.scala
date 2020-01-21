package typings.reactPhoneNumberInput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputComponentProps extends js.Object {
  var country: js.UndefOr[String] = js.undefined
  var metadata: js.UndefOr[js.Object] = js.undefined
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
  // Optional props
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  var value: String
  // Required props
  def onChange(value: String): Unit
}

object InputComponentProps {
  @scala.inline
  def apply(
    onChange: String => Unit,
    value: String,
    country: String = null,
    metadata: js.Object = null,
    onBlur: () => Unit = null,
    onFocus: () => Unit = null
  ): InputComponentProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    __obj.asInstanceOf[InputComponentProps]
  }
}

