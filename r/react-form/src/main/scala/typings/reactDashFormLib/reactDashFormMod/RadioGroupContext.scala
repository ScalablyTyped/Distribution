package typings
package reactDashFormLib.reactDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioGroupContext extends js.Object {
  var group: FieldApi
}

object RadioGroupContext {
  @scala.inline
  def apply(group: FieldApi): RadioGroupContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("group")(group)
    __obj.asInstanceOf[RadioGroupContext]
  }
}

