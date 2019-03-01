package typings
package reactDashNavigationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Params extends js.Object {
  var params: js.UndefOr[reactDashNavigationLib.reactDashNavigationMod.NavigationParams] = js.undefined
  var path: java.lang.String
}

object Anon_Params {
  @scala.inline
  def apply(
    path: java.lang.String,
    params: reactDashNavigationLib.reactDashNavigationMod.NavigationParams = null
  ): Anon_Params = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[Anon_Params]
  }
}

