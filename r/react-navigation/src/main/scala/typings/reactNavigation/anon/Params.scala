package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var params: js.UndefOr[NavigationParams] = js.undefined
  var path: String
}

object Params {
  @scala.inline
  def apply(path: String, params: NavigationParams = null): Params = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

