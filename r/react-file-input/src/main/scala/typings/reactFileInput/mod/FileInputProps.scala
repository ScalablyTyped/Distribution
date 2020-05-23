package typings.reactFileInput.mod

import typings.react.mod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileInputProps extends js.Object {
  var accept: String
  var className: String
  var disabled: js.UndefOr[Boolean] = js.undefined
  var name: String
  var placeholder: String
  def onChange(event: SyntheticEvent[_, Event]): Unit
}

object FileInputProps {
  @scala.inline
  def apply(
    accept: String,
    className: String,
    name: String,
    onChange: SyntheticEvent[_, Event] => Unit,
    placeholder: String,
    disabled: js.UndefOr[Boolean] = js.undefined
  ): FileInputProps = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), placeholder = placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInputProps]
  }
}

