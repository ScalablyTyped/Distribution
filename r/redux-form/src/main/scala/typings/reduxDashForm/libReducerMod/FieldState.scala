package typings.reduxDashForm.libReducerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldState extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var touched: js.UndefOr[Boolean] = js.undefined
  var visited: js.UndefOr[Boolean] = js.undefined
}

object FieldState {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    touched: js.UndefOr[Boolean] = js.undefined,
    visited: js.UndefOr[Boolean] = js.undefined
  ): FieldState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(touched)) __obj.updateDynamic("touched")(touched.asInstanceOf[js.Any])
    if (!js.isUndefined(visited)) __obj.updateDynamic("visited")(visited.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldState]
  }
}

