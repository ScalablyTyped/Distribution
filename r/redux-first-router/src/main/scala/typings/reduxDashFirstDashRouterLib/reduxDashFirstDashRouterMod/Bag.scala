package typings
package reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bag extends js.Object {
  var action: ReceivedAction | Action
  var extra: js.Any
}

object Bag {
  @scala.inline
  def apply(action: ReceivedAction | Action, extra: js.Any): Bag = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.updateDynamic("extra")(extra)
    __obj.asInstanceOf[Bag]
  }
}

