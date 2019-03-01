package typings
package reactDashInputDashMaskLib.reactDashInputDashMaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputState extends js.Object {
  var selection: Selection | scala.Null
  var value: java.lang.String
}

object InputState {
  @scala.inline
  def apply(value: java.lang.String, selection: Selection = null): InputState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value)
    if (selection != null) __obj.updateDynamic("selection")(selection)
    __obj.asInstanceOf[InputState]
  }
}

