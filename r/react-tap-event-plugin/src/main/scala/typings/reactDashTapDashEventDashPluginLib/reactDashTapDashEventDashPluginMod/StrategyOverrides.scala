package typings
package reactDashTapDashEventDashPluginLib.reactDashTapDashEventDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOverrides extends js.Object {
  var shouldRejectClick: js.UndefOr[
    js.Function2[
      /* lastTouchEventTimestamp */ stdLib.Date, 
      /* clickEventTimestamp */ stdLib.Date, 
      scala.Boolean
    ]
  ] = js.undefined
}

object StrategyOverrides {
  @scala.inline
  def apply(
    shouldRejectClick: js.Function2[
      /* lastTouchEventTimestamp */ stdLib.Date, 
      /* clickEventTimestamp */ stdLib.Date, 
      scala.Boolean
    ] = null
  ): StrategyOverrides = {
    val __obj = js.Dynamic.literal()
    if (shouldRejectClick != null) __obj.updateDynamic("shouldRejectClick")(shouldRejectClick)
    __obj.asInstanceOf[StrategyOverrides]
  }
}

