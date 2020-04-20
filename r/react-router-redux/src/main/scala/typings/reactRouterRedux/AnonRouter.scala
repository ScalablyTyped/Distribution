package typings.reactRouterRedux

import typings.reactRouterRedux.mod.RouterState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRouter extends js.Object {
  var router: RouterState
}

object AnonRouter {
  @scala.inline
  def apply(router: RouterState): AnonRouter = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRouter]
  }
}

