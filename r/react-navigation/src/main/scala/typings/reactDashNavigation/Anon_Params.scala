package typings.reactDashNavigation

import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Params extends js.Object {
  var params: js.UndefOr[NavigationParams] = js.undefined
  var path: String
}

object Anon_Params {
  @scala.inline
  def apply(path: String, params: NavigationParams = null): Anon_Params = {
    val __obj = js.Dynamic.literal(path = path)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[Anon_Params]
  }
}

