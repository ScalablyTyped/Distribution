package typings.reactRouterNavigationCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var params: js.UndefOr[js.Object] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object Params {
  @scala.inline
  def apply(params: js.Object = null, path: String = null): Params = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

