package typings
package reactDashTouchLib.reactDashTouchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoldableProps extends js.Object {
  /** @see defineHold */
  var config: js.UndefOr[HoldableConfig] = js.undefined
  var onHoldComplete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onHoldProgress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onMouseDown: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onTouchStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object HoldableProps {
  @scala.inline
  def apply(
    config: HoldableConfig = null,
    onHoldComplete: js.Function0[scala.Unit] = null,
    onHoldProgress: js.Function0[scala.Unit] = null,
    onMouseDown: js.Function0[scala.Unit] = null,
    onTouchStart: js.Function0[scala.Unit] = null
  ): HoldableProps = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config)
    if (onHoldComplete != null) __obj.updateDynamic("onHoldComplete")(onHoldComplete)
    if (onHoldProgress != null) __obj.updateDynamic("onHoldProgress")(onHoldProgress)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    __obj.asInstanceOf[HoldableProps]
  }
}

