package typings.reactDashInputDashMask.reactDashInputDashMaskMod

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
    val __obj = js.Dynamic.literal(value = value)
    if (selection != null) __obj.updateDynamic("selection")(selection)
    __obj.asInstanceOf[InputState]
  }
}

