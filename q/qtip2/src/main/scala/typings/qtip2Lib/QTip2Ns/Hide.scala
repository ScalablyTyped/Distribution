package typings
package qtip2Lib.QTip2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Hide property
	 */
trait Hide extends js.Object {
  var delay: js.UndefOr[scala.Double] = js.undefined
  var distance: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var effect: js.UndefOr[scala.Boolean | (js.Function1[/* offset */ js.Any, scala.Unit])] = js.undefined
  var event: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var fixed: js.UndefOr[scala.Boolean] = js.undefined
  var inactive: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var leave: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var target: js.UndefOr[qtip2Lib.JQuery | scala.Boolean] = js.undefined
}

object Hide {
  @scala.inline
  def apply(
    delay: scala.Int | scala.Double = null,
    distance: scala.Double | scala.Boolean = null,
    effect: scala.Boolean | (js.Function1[/* offset */ js.Any, scala.Unit]) = null,
    event: java.lang.String | scala.Boolean = null,
    fixed: js.UndefOr[scala.Boolean] = js.undefined,
    inactive: scala.Double | scala.Boolean = null,
    leave: java.lang.String | scala.Boolean = null,
    target: qtip2Lib.JQuery | scala.Boolean = null
  ): Hide = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed)
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (leave != null) __obj.updateDynamic("leave")(leave.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hide]
  }
}

