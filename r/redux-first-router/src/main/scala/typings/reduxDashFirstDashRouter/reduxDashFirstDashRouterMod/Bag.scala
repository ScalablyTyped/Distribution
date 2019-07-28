package typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod

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
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], extra = extra)
  
    __obj.asInstanceOf[Bag]
  }
}

