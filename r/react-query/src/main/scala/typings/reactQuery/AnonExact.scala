package typings.reactQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExact extends js.Object {
  var exact: js.UndefOr[Boolean] = js.undefined
  var force: js.UndefOr[Boolean] = js.undefined
  var throwOnError: js.UndefOr[Boolean] = js.undefined
}

object AnonExact {
  @scala.inline
  def apply(
    exact: js.UndefOr[Boolean] = js.undefined,
    force: js.UndefOr[Boolean] = js.undefined,
    throwOnError: js.UndefOr[Boolean] = js.undefined
  ): AnonExact = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (!js.isUndefined(throwOnError)) __obj.updateDynamic("throwOnError")(throwOnError.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExact]
  }
}

