package typings
package reactDashJsonLib.reactDashJsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonProperties extends js.Object {
  var onChange: js.UndefOr[reactDashJsonLib.OnChangeHandler] = js.undefined
  var value: js.Any
}

object JsonProperties {
  @scala.inline
  def apply(value: js.Any, onChange: reactDashJsonLib.OnChangeHandler = null): JsonProperties = {
    val __obj = js.Dynamic.literal(value = value)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    __obj.asInstanceOf[JsonProperties]
  }
}

