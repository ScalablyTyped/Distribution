package typings.reduxDashPromiseDashMiddleware.reduxDashPromiseDashMiddlewareMod.reduxMod

import typings.redux.reduxMod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseAction[R]
  extends Action[js.Any] {
  var payload: js.Promise[R]
}

object PromiseAction {
  @scala.inline
  def apply[R](payload: js.Promise[R], `type`: js.Any): PromiseAction[R] = {
    val __obj = js.Dynamic.literal(payload = payload)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PromiseAction[R]]
  }
}

