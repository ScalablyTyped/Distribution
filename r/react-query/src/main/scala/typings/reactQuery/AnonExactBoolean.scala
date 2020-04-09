package typings.reactQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExactBoolean extends js.Object {
  var exact: js.UndefOr[Boolean] = js.undefined
}

object AnonExactBoolean {
  @scala.inline
  def apply(exact: js.UndefOr[Boolean] = js.undefined): AnonExactBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExactBoolean]
  }
}

