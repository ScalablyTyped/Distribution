package typings.reactQuery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exact extends js.Object {
  var exact: js.UndefOr[Boolean] = js.undefined
  var force: js.UndefOr[Boolean] = js.undefined
  var throwOnError: js.UndefOr[Boolean] = js.undefined
}

object Exact {
  @scala.inline
  def apply(
    exact: js.UndefOr[Boolean] = js.undefined,
    force: js.UndefOr[Boolean] = js.undefined,
    throwOnError: js.UndefOr[Boolean] = js.undefined
  ): Exact = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.get.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (!js.isUndefined(throwOnError)) __obj.updateDynamic("throwOnError")(throwOnError.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exact]
  }
}

