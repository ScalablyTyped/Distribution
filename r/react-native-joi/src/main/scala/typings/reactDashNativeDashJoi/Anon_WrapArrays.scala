package typings.reactDashNativeDashJoi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_WrapArrays extends js.Object {
  var wrapArrays: js.UndefOr[Boolean] = js.undefined
}

object Anon_WrapArrays {
  @scala.inline
  def apply(wrapArrays: js.UndefOr[Boolean] = js.undefined): Anon_WrapArrays = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(wrapArrays)) __obj.updateDynamic("wrapArrays")(wrapArrays)
    __obj.asInstanceOf[Anon_WrapArrays]
  }
}

