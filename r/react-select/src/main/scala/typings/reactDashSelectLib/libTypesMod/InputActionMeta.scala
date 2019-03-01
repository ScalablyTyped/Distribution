package typings
package reactDashSelectLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputActionMeta extends js.Object {
  var action: InputActionTypes
}

object InputActionMeta {
  @scala.inline
  def apply(action: InputActionTypes): InputActionMeta = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.asInstanceOf[InputActionMeta]
  }
}

