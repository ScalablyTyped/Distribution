package typings.reactDashNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ParamsP[P] extends js.Object {
  var params: js.UndefOr[P] = js.undefined
}

object Anon_ParamsP {
  @scala.inline
  def apply[P](params: P = null): Anon_ParamsP[P] = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ParamsP[P]]
  }
}

