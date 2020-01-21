package typings.reactNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParamsOptional[Params] extends js.Object {
  var params: js.UndefOr[Params] = js.undefined
}

object AnonParamsOptional {
  @scala.inline
  def apply[Params](params: Params = null): AnonParamsOptional[Params] = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParamsOptional[Params]]
  }
}

