package typings.reactInputMask.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputState extends js.Object {
  var selection: Selection | Null
  var value: String
}

object InputState {
  @scala.inline
  def apply(value: String, selection: Selection = null): InputState = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputState]
  }
}

