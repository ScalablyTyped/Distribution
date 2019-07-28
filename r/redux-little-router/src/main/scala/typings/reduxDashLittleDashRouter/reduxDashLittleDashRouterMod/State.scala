package typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var router: Location
}

object State {
  @scala.inline
  def apply(router: Location): State = {
    val __obj = js.Dynamic.literal(router = router)
  
    __obj.asInstanceOf[State]
  }
}

