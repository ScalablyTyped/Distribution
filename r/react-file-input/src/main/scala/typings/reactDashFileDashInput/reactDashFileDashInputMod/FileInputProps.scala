package typings.reactDashFileDashInput.reactDashFileDashInputMod

import typings.react.Event
import typings.react.reactMod.SyntheticEvent
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
    val __obj = js.Dynamic.literal(accept = accept, className = className, name = name, onChange = js.Any.fromFunction1(onChange), placeholder = placeholder)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[FileInputProps]
  }
}

