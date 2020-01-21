package typings.reactQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShouldRefetch extends js.Object {
  var shouldRefetch: js.UndefOr[Boolean] = js.undefined
}

object AnonShouldRefetch {
  @scala.inline
  def apply(shouldRefetch: js.UndefOr[Boolean] = js.undefined): AnonShouldRefetch = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(shouldRefetch)) __obj.updateDynamic("shouldRefetch")(shouldRefetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShouldRefetch]
  }
}

