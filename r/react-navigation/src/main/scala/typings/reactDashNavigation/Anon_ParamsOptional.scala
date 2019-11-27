package typings.reactDashNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ParamsOptional[Params] extends js.Object {
  var params: js.UndefOr[Params] = js.undefined
}

object Anon_ParamsOptional {
  @scala.inline
  def apply[Params](params: Params = null): Anon_ParamsOptional[Params] = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ParamsOptional[Params]]
  }
}

