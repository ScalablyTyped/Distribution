package typings
package reactDashSelectLib.libSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuOptions[OptionType] extends js.Object {
  var focusable: js.Array[OptionType]
  var render: js.Array[OptionType]
}

object MenuOptions {
  @scala.inline
  def apply[OptionType](focusable: js.Array[OptionType], render: js.Array[OptionType]): MenuOptions[OptionType] = {
    val __obj = js.Dynamic.literal(focusable = focusable, render = render)
  
    __obj.asInstanceOf[MenuOptions[OptionType]]
  }
}

