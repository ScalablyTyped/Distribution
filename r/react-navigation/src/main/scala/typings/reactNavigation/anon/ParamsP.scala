package typings.reactNavigation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsP[P] extends js.Object {
  var params: js.UndefOr[P] = js.undefined
}

object ParamsP {
  @scala.inline
  def apply[P](params: P = null): ParamsP[P] = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsP[P]]
  }
}

