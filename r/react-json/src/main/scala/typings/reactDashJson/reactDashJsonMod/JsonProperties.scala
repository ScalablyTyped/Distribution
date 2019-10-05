package typings.reactDashJson.reactDashJsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonProperties extends js.Object {
  var onChange: js.UndefOr[OnChangeHandler] = js.undefined
  var value: js.Any
}

object JsonProperties {
  @scala.inline
  def apply(value: js.Any, onChange: /* value */ js.Any => Unit = null): JsonProperties = {
    val __obj = js.Dynamic.literal(value = value)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[JsonProperties]
  }
}

