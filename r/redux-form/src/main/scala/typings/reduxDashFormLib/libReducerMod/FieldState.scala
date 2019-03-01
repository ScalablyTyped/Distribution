package typings
package reduxDashFormLib.libReducerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldState extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var touched: js.UndefOr[scala.Boolean] = js.undefined
  var visited: js.UndefOr[scala.Boolean] = js.undefined
}

object FieldState {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    touched: js.UndefOr[scala.Boolean] = js.undefined,
    visited: js.UndefOr[scala.Boolean] = js.undefined
  ): FieldState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(touched)) __obj.updateDynamic("touched")(touched)
    if (!js.isUndefined(visited)) __obj.updateDynamic("visited")(visited)
    __obj.asInstanceOf[FieldState]
  }
}

