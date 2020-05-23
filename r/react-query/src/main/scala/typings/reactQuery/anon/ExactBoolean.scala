package typings.reactQuery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExactBoolean extends js.Object {
  var exact: js.UndefOr[Boolean] = js.undefined
}

object ExactBoolean {
  @scala.inline
  def apply(exact: js.UndefOr[Boolean] = js.undefined): ExactBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExactBoolean]
  }
}

