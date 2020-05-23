package typings.reactRouterRedux.anon

import typings.reactRouterRedux.mod.RouterState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Router extends js.Object {
  var router: RouterState
}

object Router {
  @scala.inline
  def apply(router: RouterState): Router = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[Router]
  }
}

