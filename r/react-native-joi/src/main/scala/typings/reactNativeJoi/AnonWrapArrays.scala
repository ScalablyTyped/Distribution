package typings.reactNativeJoi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWrapArrays extends js.Object {
  var wrapArrays: js.UndefOr[Boolean] = js.undefined
}

object AnonWrapArrays {
  @scala.inline
  def apply(wrapArrays: js.UndefOr[Boolean] = js.undefined): AnonWrapArrays = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(wrapArrays)) __obj.updateDynamic("wrapArrays")(wrapArrays.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWrapArrays]
  }
}

