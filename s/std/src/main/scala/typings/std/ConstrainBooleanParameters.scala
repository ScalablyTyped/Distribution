package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstrainBooleanParameters extends js.Object {
  var exact: js.UndefOr[scala.Boolean] = js.undefined
  var ideal: js.UndefOr[scala.Boolean] = js.undefined
}

object ConstrainBooleanParameters {
  @scala.inline
  def apply(exact: js.UndefOr[scala.Boolean] = js.undefined, ideal: js.UndefOr[scala.Boolean] = js.undefined): ConstrainBooleanParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ideal)) __obj.updateDynamic("ideal")(ideal.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstrainBooleanParameters]
  }
}

