package typings.reactNavigation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsParams[Params] extends js.Object {
  var params: js.UndefOr[Params] = js.undefined
}

object ParamsParams {
  @scala.inline
  def apply[Params](params: Params = null): ParamsParams[Params] = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsParams[Params]]
  }
}

