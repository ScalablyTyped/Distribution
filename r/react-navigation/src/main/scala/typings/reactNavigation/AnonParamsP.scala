package typings.reactNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParamsP[P] extends js.Object {
  var params: js.UndefOr[P] = js.undefined
}

object AnonParamsP {
  @scala.inline
  def apply[P](params: P = null): AnonParamsP[P] = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParamsP[P]]
  }
}

