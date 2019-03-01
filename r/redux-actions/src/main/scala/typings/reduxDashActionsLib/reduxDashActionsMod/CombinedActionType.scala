package typings
package reduxDashActionsLib.reduxDashActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CombinedActionType extends js.Object {
  var _dummy: js.UndefOr[scala.Nothing]
}

object CombinedActionType {
  @scala.inline
  def apply(_dummy: js.UndefOr[scala.Nothing] = js.undefined): CombinedActionType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_dummy)) __obj.updateDynamic("_dummy")(_dummy)
    __obj.asInstanceOf[CombinedActionType]
  }
}

