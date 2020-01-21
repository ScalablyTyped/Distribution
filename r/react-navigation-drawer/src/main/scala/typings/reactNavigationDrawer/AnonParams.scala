package typings.reactNavigationDrawer

import typings.reactNavigation.mod.NavigationParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParams extends js.Object {
  var params: js.UndefOr[NavigationParams] = js.undefined
  var path: String
}

object AnonParams {
  @scala.inline
  def apply(path: String, params: NavigationParams = null): AnonParams = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParams]
  }
}

