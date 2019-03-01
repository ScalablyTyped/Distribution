package typings
package reactDashRouterDashNavigationDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Params extends js.Object {
  var params: js.UndefOr[js.Object] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Params {
  @scala.inline
  def apply(params: js.Object = null, path: java.lang.String = null): Anon_Params = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Anon_Params]
  }
}

